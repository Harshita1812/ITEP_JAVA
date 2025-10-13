import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter a number: ");
            int a = sc.nextInt();
            System.out.println("enter a number2: ");
            int b = sc.nextInt(); 

            int c =a/b; 
            System.out.println("reuslt: "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator can not be Zero! please enter a valid value: ");
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println("only integer value allowed for the operation: ");
            e.printStackTrace();
        }

    }
}