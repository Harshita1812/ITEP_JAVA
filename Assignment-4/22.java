import java.util.Scanner;
class Cube{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for cube: ");
        int n = sc. nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i*i*i + " ");
            i++;
        }
    }
}