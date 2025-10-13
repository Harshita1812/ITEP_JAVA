import java.util.Scanner;
class PerfectNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a start number: ");
        int start = sc.nextInt();
        System.out.println("enter a end number: ");
        int endNum = sc.nextInt();

        for(int num = start; num <= endNum; num++){
           int sum = 0;
           for(int i =1; i<=num/2; i++){
            if(num % 2 == 0 ){
                sum += i;

            }
           }
           if(sum == num){
            System.out.println(num);
           }
        }

    }
}