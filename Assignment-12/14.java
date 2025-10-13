import java.util.Scanner;
class Calculate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a item: ");
        String item = sc.nextLine();
        System.out.println("enter a quantity: ");
        int quantity = sc.nextInt();
        System.out.println("the price: ");
        float price = sc.nextFloat();

        float totalAmount = price*quantity; 
        System.out.println("total Amount "+ totalAmount);
        try{ 
        float result = totalAmount / quantity;
        System.out.println("the result: " + result);
        }
        catch(ArithmeticException e){
        System.out.println("Qauntity is must a valid value ! it cannot be Zero: ");
        e.printStackTrace();
        }
        System.out.println("discount Calculation: ");
    }

    
}