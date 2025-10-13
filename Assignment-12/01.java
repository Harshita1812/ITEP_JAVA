
import java.util.Scanner;
class TestMain{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();

        System.out.println("enter the second number: ");
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("Dividing result: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception cought: ");
            e.printStackTrace();
        }
        System.out.println("01 Done");
    }
}