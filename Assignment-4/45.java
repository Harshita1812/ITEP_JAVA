import java.util.Scanner;
class DigitSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int digit = 0, sum = 0 ;
        while(n>0){
            digit = n % 10;
            sum = sum + digit;
            n = n/ 10;
        }
        System.out.print("sum of the digit: " + sum);
    }
}