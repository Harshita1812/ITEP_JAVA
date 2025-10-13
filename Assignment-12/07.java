import java.util.Scanner;
class InValidAgeException extends Exception{
    public InValidAgeException(String msg){
        super(msg);
    }
   
    
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();
        try{
            if(age < 18){
                throw  new InValidAgeException("Not eligible for voting");
            }
            else{
                System.out.println("you are eligible for vote");
            }
        }
        catch(InValidAgeException ive){
            ive.printStackTrace();
        }
    }
}