import java.util.Scanner;
class EvenOddCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int i =1, evenCount = 0, oddCount = 0;
        while(i<=n){
            if(i % 2 == 0){
                evenCount++;
            }
            else
            oddCount++;
            i++;
        }
         System.out.println("oddCount " + oddCount );
            System.out.println("evenCount "+ evenCount );
           
    }
}