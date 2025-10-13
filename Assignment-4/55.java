import java.util.Scanner;
class OddInRange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number: ");
        int startNum = sc.nextInt();

        System.out.println("Enter a second number: ");
        int endNum = sc.nextInt();
        for(int num = startNum; num<=endNum; num++){
            if(num % 2 == 1){
                System.out.println(num);
            }
        }
    }
}