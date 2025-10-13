import java.util.Scanner;
class Even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n= sc.nextInt();
        int i = 0;
        while(i<=n){
            if(i%2 == 0){
                System.out.print(i +" ");;
                i++;
            }
            else{
                i++;
            }

        }
    }
}