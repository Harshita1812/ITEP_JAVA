import java.util.Scanner;
class PerfectNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int i = 1,sum= 0;
        while(i < n)
        {
            if(n % i == 0){
              sum = sum + i;   //System.out.print(sum + " ");
            }
            i++;
        }
            if(sum == n ){
                System.out.println("number is perfect number");
            }
            else
            System.out.println("number is not a perfect number");
        
    }
}