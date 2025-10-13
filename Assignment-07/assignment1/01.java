import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private float salary;
    public void setData(int id, String name, float salary){
    this.id = id;
    this.name =  name;
    this.salary =  salary;
}
public int setId(int id){
    return id;

} 
public String setName(String name){
    return name;
}
public float setSalary(float salary){
  return salary;
}
public void Display(){
    System.out.println("Id of the employee is: " + id);
    System.out.println("name of the employee is: "+ name);
    System.out.println("salary of the employee is: "+ salary);
}
}
class TestMain{
    public  static void main(String args[]){
        Employee obj = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter a name: ");
        String name = sc.nextLine();

        System.out.println("enter a salary: ");
        float salary = sc.nextFloat();

        obj.setData(id, name, salary);
        obj.Display();
        
    }
}