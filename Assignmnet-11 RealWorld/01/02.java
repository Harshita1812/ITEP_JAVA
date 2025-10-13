
abstract class Payment{
    Payment(){}
    public Payment(int amountField){
        this.amountField = amountField;
    }
    private int amountField;
    abstract public void pay();
    public void paymentDetials(){
        System.out.println("payment details are:" );
    }

}
class CreditCardPayment extends Payment implements Refundable{
    CreditCardPayment(){}
    public CreditCardPayment(int af){
     super(af);
    }
    public void pay(){
        System.out.println("Payment is credited: ");
    }
    public void processRefund(){
        System.out.println("Payment is refund:" );
    }

}
class DebitCardPayment extends Payment{
    DebitCardPayment(){}
    public DebitCardPayment(int af){
        super(af);
    }
    public void pay(){
    System.out.println("Payment is debited: ");
    }
}
class UpiPayment extends Payment implements Refundable{
    UpiPayment(){}
    public UpiPayment(int af){
        super(af);
    }
    public void pay(){
        System.out.println("Payment with upi: ");

    }
    public void processRefund(){
        System.out.println("Refund successfully! ");
    }

}
interface Refundable{
    public void processRefund();
}
class GatewaySystem{
    public static void main(String args[]){
         CreditCardPayment visa = new CreditCardPayment();
         visa.pay();
         DebitCardPayment rupay = new DebitCardPayment();
         rupay.pay();
         UpiPayment pytm = new UpiPayment();
         pytm.pay();
         
         
        }
}

