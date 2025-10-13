/* Circle Geometry
Create a class Circle with field radius.
Use a setter to assign radius. Add methods to compute area and circumference.
 */

import java.util.Scanner;
class Circle{
private float radius;

public void setRadius(float radius){
   this.radius=radius;
}

public float calculateArea(float radius){
    return(float)((3.14*(radius*radius)));
}

}

class Geometry {
public static void main(String []args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter radius of a circle : ");
float radius=sc.nextFloat();

Circle r1=new Circle();

r1.setRadius(radius);
float area=r1.calculateArea(radius);
 System.out.println("Area of Circle is : " +area);

}
}