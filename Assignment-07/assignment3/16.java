import java.util.Scanner;
class Person{
    private String name;
    private int age;

    public int defaultAge(int age){
        age = 18;
        return age;
    }
    public String name(String name){
       return name;
    }
    public String Display(){
      return name;
    }
}
class TestMain{
    public static void main(String args[]){
        Person p =  new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name: ");
        String name = sc.nextLine();
        System.out.println(p.name("Person name : "+ name));
        System.out.println("Default age of the person: "+p.defaultAge(18));
        p.Display();
    }
}