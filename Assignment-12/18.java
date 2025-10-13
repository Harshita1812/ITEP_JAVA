import java.util.Scanner;
class MissingPriceException extends Exception{
    public MissingPriceException(){
        super("MissingPriceException!");
    }
}
class PriceMissingIssue{
    private float price; 
    private int quantity;
    private float defaultPrice = 10f;
    public PriceMissingIssue(){
        this.price = price;
        this.quantity = quantity;
    }
    public void setQuantity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a quantity: ");
        int quantity = sc.nextInt();
    }
    public float getTotal(){
        return price*quantity;
    }
    public float getPrice(){
        return this.price;
    }
    public void defaultPrice(){
        try{
        if(price == 0){
            this.price = defaultPrice ;
        }
        else{
            throw new MissingPriceException();
        }
        }
        catch(MissingPriceException mpe){
            mpe.printStackTrace();
        }
       
    }
}
class Main{
    public static void main(String args[]){
        PriceMissingIssue obj = new PriceMissingIssue();
       
      
        obj.setQuantity();
        obj.defaultPrice();
        System.out.println("total price: "+obj.getTotal());
        System.out.println("Default price: " + obj.getPrice());
        
    }
}
