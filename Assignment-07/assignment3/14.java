import java.util.Scanner;
class MathOperation{
    private double x;
    private double y;
    private double result;

    public void init(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double add(){
        double result =  x + y;
        return result;
    }
    public double mul(){
        double result = x * y;
        return result;
    }
    public double power(){
        double result = Math.pow(x, y);
        return result;
    }
    public double Display(){
        return result;
    }

}
class TestMain{
    public static void main(String args[]){

        MathOperation obj =  new MathOperation();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x: ");
        double x =  sc.nextDouble();
        System.out.println("enter the value of y: ");
        double y =  sc.nextDouble();

        obj.init(x, y);
        System.out.println(obj.add());
        System.out.println(obj.mul());
        System.out.println(obj.power());
        
    }
}
