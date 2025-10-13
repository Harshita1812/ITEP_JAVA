import java.util.Scanner;
class FactorialInRange{
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number: ");
        int fristNum = sc.nextInt();

        System.out.println("enter a second number: ");
        int secondNum = sc.nextInt();

        for(int num = fristNum; num<=secondNum; num++){
            int fact = 1;
             for(int i = 1; i<=num; i++){
                fact *=i;
             }
             System.out.println(num +"!" + " = " + fact );

        }
    }
}