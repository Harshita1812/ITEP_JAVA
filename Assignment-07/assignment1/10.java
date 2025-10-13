/* Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area.
  */

import java.util.Scanner;
class Rectangle{
private int length;
private int width;

public void setLength(int length){
   this.length=length;
}
public void setWidth(int width){
   this.width=width;
}

public int caclulateArea(int length,int width){
    return(length*width);
}

}

class AreaCalculator {
public static void main(String []args){
Scanner sc=new Scanner(System.in);


System.out.println("Enter length of rectangle : ");
int length=sc.nextInt();
//sc.nextLine();
System.out.println("Enter width of rectangle : ");
int width=sc.nextInt();


Rectangle r1=new Rectangle();

r1.setLength(length);
r1.setWidth(width);
int area=r1.caclulateArea(length,width);
 System.out.println("Area of rectangle is : " +area);

} 
}