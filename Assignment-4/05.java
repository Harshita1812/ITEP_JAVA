import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i<=n){
            int result = fact * i;
            fact = result;
            i++;
        }
           System.out.print(fact +" ");
       
        }
    }
