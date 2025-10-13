import java.util.Scanner;
class Operation{
 private int x;
 private int y;
  public int multiplication(int x, int y){
    this.x = x;
    this.y = y;
    int result =  x + y;
    return result;
  }
  public float multiplication(float x, float y, float z){
    float result = x * y *z;
    return result;

  }
  public double multiplication(double x, int y){
    double result = x * y ;
    return result;
  }
 
}
class TestMain {
    public static void main(String args[]){
        Operation op =  new Operation();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("enter the value of y: ");
        int y =  sc.nextInt();
        

        int result = op.multiplication(x,y);
        System.out.println("result = " + result);
        
        
    }
}