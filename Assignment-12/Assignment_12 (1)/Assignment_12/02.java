import java.util.Scanner;
interface Refundable{
   public void processRefund();
}

abstract class Payment{
    int amount;
    abstract void pay(int amount);
    public void paymentDetails(){
        System.out.println("Payment of ₹" + amount + " processed.");
    }
}

class CreditCardPayment extends Payment implements Refundable{
    public void pay(int amount){
       System.out.println("Paid" + amount + " using Credit Card.");
    }
   public void processRefund(){
        System.out.println("Refunded" + amount + " to Credit Card.");
    }
}

class DebitCardPayment extends Payment{
    public void pay(int amount){
       System.out.println(amount + " Rs is credited to your account");
    }
   

class UPIPayment extends Payment implements Refundable{
   public void pay(int amount){
       System.out.println(amount + " Rs is credited to your account");
    }
     public void processRefund(){
        System.out.println("Refunded "+ amount + "to Credit card: ");
    }
}
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    }
}

