import java.util.Scanner;
class BinaryDecimal{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int i = 0;
        while(binary >0){
            int digit = x %10;
            for(int j=0; j<i; j++){
                digit *=2;
            }
            decimal +=digit;
            i++;
            x = x/10;
        }
        
        
    }
}