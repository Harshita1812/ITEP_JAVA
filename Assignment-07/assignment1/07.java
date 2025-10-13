/* Student Result Checker
Create a class Student with fields: name, mathMarks, scienceMarks.
Use setters to assign values. Add a method getAverage().
  */
import java.util.Scanner;
class Student{
private String name;
private int mathMarks;
private int scienceMarks;

public void setName(String name){
 this.name=name;
}
public void setMathMarks(int mathMarks){
  this.mathMarks=mathMarks;
}
public void setScienceMarks(int scienceMarks){
  this.scienceMarks=scienceMarks;
}
public float getAverage(int mathMarks,int scienceMarks){
    return((mathMarks+scienceMarks)/2f);
}

}


class Result{
public static void main(String []args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Student name : ");
String name=sc.nextLine();
System.out.println("Enter Student math marks : ");
int mathMarks=sc.nextInt();
System.out.println("Enter Student science marks : ");
int scienceMarks=sc.nextInt();

Student s1=new Student();

s1.setName(name);
s1.setMathMarks(mathMarks);
s1.setScienceMarks(scienceMarks);
float average=s1.getAverage(mathMarks,scienceMarks);
System.out.println("Average marks of student is : "+average);

}

}