import java.util.*;
class Test{
    public int input()
    {
        try{
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a roll number: ");
        int a = sc.nextInt();
        return a;
        }
        catch(InputMismatchException e)
        {    
            System.out.println("enter a valid roll number: ");
            return input();
        }
    }
class Main{
    public static void main(String args[])
    {
        Test n=new Test();
        int a = n .input();
        System.out.println("roll number is: "+a);
    }
}
}