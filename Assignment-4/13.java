import java.util.Scanner;
class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n= sc.nextInt();
        int i = n;
        while(i>=1){
            System.out.print(i +" ");;
            i--;
        }
    }
}