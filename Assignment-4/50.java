import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int startnum = sc.nextInt();

        System.out.println("enter a number2: ");
        int endNum = sc.nextInt();

        for(int num = startnum ; num<=endNum; num++){
           int original = num;
            int reverse = 0;
            int temp = num;
            while(temp > 0 ){
               int digit = temp % 10;
                reverse = reverse * 10 +digit;
                temp = temp/10;
                
            }
        if(original == reverse){
            System.out.println(reverse);
        }
        }
    }
}