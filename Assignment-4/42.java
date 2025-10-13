import java.util.Scanner;
class Hcf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int x = sc.nextInt();

        System.out.println("Enter a second number: ");
        int y = sc.nextInt();
        int hcf = 0;
        
        if(x < y){
            System.out.println("min is: "+x);
        }
        else{
            System.out.println("min is:" + y );
        }
        
        for(int i=1; i<=x/2; i++){
            if(x%i ==0 && y%i==0){
                hcf = i;
            }
            System.out.println("hcf is: "+ hcf);
        }

    }
}