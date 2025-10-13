import java.util.Scanner;
class TestMain{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter a String: ");
        String str = sc.nextLine();
        if(str.isEmpty())
        str = null;
            System.out.println("String length: "+ str.length());
        }
        catch(NullPointerException e){
         

            System.out.println("empty valid: ");
            e.printStackTrace();
          
        }

    }
}