import java.util.Scanner;
class CalArea{
    private float radius;
    private float area;
    private float result;

    public void init(float radius){
        this.radius = radius;
    }
    public void area(){
         result = 3.14f * radius * radius;
    }
    public float Display(){
        return result;
    }

}
class TestMain{
    public static void main(String args[]){
        CalArea obj =  new CalArea();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius: ");
        float radius =  sc.nextFloat();
        obj.init(radius);
        obj.area();
        System.out.println("Area = " + obj.Display());

    }
}