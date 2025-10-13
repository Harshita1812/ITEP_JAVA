
interface BonusEligible{
    void giveBonus(double bonus);
}

abstract class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public abstract void calculateSalary();
    
    public void showDetails(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

}

class FullTimeEmployee extends Employee implements BonusEligible{
        private double monthlySalary;
        public FullTimeEmployee(int id, String name, double monthlySalary){
            super(id, name);
            this.monthlySalary = monthlySalary;
        }

        public void calculateSalary(){
            this.salary = monthlySalary;
        }

        public void giveBonus(double bonus){
            this.salary += bonus;
            System.out.println(name + " got a bonus of " + bonus);
        }
}

class PartTimeEmployee extends Employee implements BonusEligible{
        private int hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate){
            super(id, name);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }
        public void calculateSalary(){
            this.salary = hoursWorked * hourlyRate;
        }
        public void giveBonus(double bonus){
            this.salary += bonus;
            System.out.println(name + " got a bonus of " + bonus);
        }
}

class Intern extends Employee{

    private double stipend;

    public Intern(int id, String name, double stipend){
        super(id, name);
        this.stipend = stipend;
    }

    public void calculateSalary(){
        this.salary = stipend;
    }
}

class EmployeeManagementSystem{
    public static void main(String args[]){
       
       Employee emp1 = new FullTimeEmployee(1, "Harsh", 25000);
       Employee emp2 = new PartTimeEmployee(2, "Ritik", 80, 200);
       Employee emp3 = new Intern(3, "Ram", 10000);

       emp1.calculateSalary();
       emp2.calculateSalary();
       emp3.calculateSalary();

        if(emp1 instanceof BonusEligible){
             ((BonusEligible)emp1).giveBonus(5000);
        }
        if(emp2 instanceof BonusEligible){
             ((BonusEligible)emp2).giveBonus(2000);
        }
        if(emp3 instanceof BonusEligible){
             ((BonusEligible)emp3).giveBonus(1000);
        }
      
       emp1.showDetails();
       emp2.showDetails();
       emp3.showDetails();

        
    }
}