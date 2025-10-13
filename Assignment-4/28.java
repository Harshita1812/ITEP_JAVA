import java.util.Scanner;
class Five{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter a numbers: ");
         int n = sc.nextInt();
        int i =1;
        while(i<=n){
            if(i%5==0){
                System.out.print(" Hello "+ " ");

            }
            else
            System.out.print(i + " ");
            i++;
        }
    }
}