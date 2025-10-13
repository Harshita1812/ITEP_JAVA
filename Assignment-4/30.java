import java.util.Scanner;
class Thirthy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        long current_num = 1;
        int i = 0;
        while(i<=n){
            System.out.print(current_num + " " + " + ");
            current_num = current_num *10+1;
            i++;
        }
    }
}