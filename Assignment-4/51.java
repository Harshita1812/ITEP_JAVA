import java.util.Scanner ;
class ReverseInRange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a start number: ");
        int start = sc.nextInt();

        System.out.println("enter a second number: ");
        int endNum = sc.nextInt();

        for(int num= start ; num<=endNum; num++){
            int digit = 0;
            int reverse = 0;
            int temp = num;

            while(temp > 0){
                digit = temp %10;
                reverse =  reverse *10+digit;
                temp = temp/10;

            }
            System.out.println(num + "-->"+reverse);
        }
    }
}