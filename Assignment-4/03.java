import java.util.Scanner;
class SumNaturalNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            int result = sum + i;
            sum = result;
            i++;

        }
         System.out.println("Sum = "+ sum);
    }
}