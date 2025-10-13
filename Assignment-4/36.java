import java.util.Scanner;
class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int digit, reverse = 0;
        while(n>0){
            digit = n % 10;
             reverse = reverse * 10 + digit;
            n = n/10;
         }
         System.out.print( reverse  + " ");     
    }    
          
}