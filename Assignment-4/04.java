import java.util.Scanner;
class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        while(i<= 10 ){
            System.out.print(n*i+" ");;
            i++;
        }

    }
}