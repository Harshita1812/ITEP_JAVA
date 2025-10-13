import java.util.Scanner;
class SevenTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i*7 + " ");
            i++;
        }
    }
}
/*  int i = 1;
whil(i<=n){
 System.out.println(i*7);
            i++;
} */