import java.util.Scanner;
class DigitCounts{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int digit = 0;
        while(n>0){
            digit++;
            n = n/10;
        }
          System.out.print(digit +" ");
    }
}