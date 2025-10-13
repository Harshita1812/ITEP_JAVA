import java.util.Scanner;
class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n =  sc.nextInt();
       int lastDigit = n %10;
       System.out.println("last digit: "+ lastDigit);
       int firstDigit = n ; 
       while(firstDigit > 10){
        firstDigit = firstDigit /10;
       }
       System.out.println("first digit: "+ firstDigit);
       int sum =  firstDigit + lastDigit;
       System.out.print("Sum of first and last digit: "+ sum);
        
    }
}