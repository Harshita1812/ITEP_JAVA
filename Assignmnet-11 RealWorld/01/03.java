abstract class Employee{
     Employee(){}
    public Employee(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    private int id;
    private String name;
    private float salary;
    abstract public float calculateSalary(float a);
    abstract public void showDetails();
    
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public float getSalary(){
        return this.salary;
    }
} 
interface BonusEligible {
    public void giveBonus();
}
class FullTimeEmployee extends Employee implements BonusEligible{
    FullTimeEmployee(){}
    public FullTimeEmployee(int number, String n, float s){
        super(number,n,s);
    
    }
    public float calculateSalary(float s){
        return s;
    }
    public void showDetails(){
        System.out.println("Employee id: "+ getId());
        System.out.println("Employee name: "+ getName());
        System.out.println("Employee salary: "+ getSalary());
    }
    public void giveBonus(){
        System.out.println("Bonus is given: ");
    }
}
class PartTimeEmployee extends Employee implements BonusEligible{
     PartTimeEmployee(){}
    public PartTimeEmployee(int number, String n, float s){
        super(number,n,s);
    
    }
    public void showDetails(){
         System.out.println("Employee id: "+getId());
        System.out.println("Employee name: "+getName());
        System.out.println("Employee salary: "+ getSalary());
    }
    public float calculateSalary(float h){
       return  h;
    }
     public void giveBonus(){
        System.out.println("Bonus is given: ");
    }
    

}
class Intern extends Employee{
     Intern(){}
    public Intern(int number, String n, float s){
        super(number,n,s);
    }
     public void showDetails(){
         System.out.println("Employee id: " +getId());
        System.out.println("Employee name: "+getName());
        System.out.println("Employee salary: "+ getSalary());

    }
    public float calculateSalary(float h){
        System.out.println("salary depend on stipend");
        return h;
    }
}
class EmployeeSystem{
    public static void main(String args[]){
        FullTimeEmployee emp = new FullTimeEmployee(01, "harshita", 20000f);
        emp.showDetails();
        emp.giveBonus();
        
        PartTimeEmployee pemp =  new PartTimeEmployee(02, "ayush", 50000f);
        pemp.showDetails();
        pemp.giveBonus();
    
        Intern i = new Intern(03, "aashita", 80000f);
        i.showDetails();

    }
}