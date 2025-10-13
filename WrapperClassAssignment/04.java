import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        name.trim();
        boolean valid = true;
        char [] arr = name.toCharArray();
        for(char w: arr){
            Character wds =  w;
            if(Character.isDigit(wds)){
                valid = false;
                break;
            }
        }
         if(valid){
                System.out.println("Valid name: ");
            }
            else{
                 System.out.println(" not Valid name: ");
            }
    }
}
