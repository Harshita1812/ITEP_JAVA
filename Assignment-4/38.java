import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int length = 0;
        int temp1 = n;
        while(temp1 != 0){
            temp1 = temp1/10;
            length++;
        }
              

        int temp2 = n;
        int arm =0;
        int rem = 0;
        while(temp2 != 0 ){
            rem = temp2 % 10;
            temp2 = temp2/10;
            int multi=1;
            for(int i=1; i<=length; i++){
                multi = rem * multi;

            }
            arm = arm + multi;
        }
        if(arm == n){
            System.out.println("number is armstrong" + arm );
        }
        else
        System.out.println("number is not armstrong");
    }
}            