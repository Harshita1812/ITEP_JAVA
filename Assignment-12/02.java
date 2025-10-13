import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter a first number: ");
        int a = sc.nextInt();
        System.out.println("enter a second number: ");
        int b = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Enter a valid input: ");
            e.printStackTrace();
        }
        System.out.println("exexution succes!");
        
        }
}