import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mobile number: ");
        String mNum = sc.nextLine();
        mNum.trim();
        boolean valid = true;
        char [] arr = mNum.toCharArray();
        if(mNum.length()== 10){
        for(char n: arr){
            Character num =  n;
            if(!Character.isDigit(num)){
                valid = false;
                break;
            }
            
        }
         if(valid){
                System.out.println("Valid number: ");
            }
            else{
                 System.out.println(" not Valid number: ");
            }
        }else{
            System.out.println("not valid number");
        }
    }
}
