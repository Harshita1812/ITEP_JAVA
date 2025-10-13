interface DiscountApplicable{
    void applyDiscount();
}

abstract class Order{
    String orderId;
    double amount;

    public Order(String orderId, double amount){
        this.orderId = orderId;
        this.amount = amount;
    }

    abstract void processOrder();
    abstract void cancelOrder();

    void orderSummary(){
        System.out.println("\nOrder-id: " + this.orderId);
        System.out.println("Amount: " + this.amount);
    }
}

class OnlineOrder extends Order implements DiscountApplicable{

    public OnlineOrder(String orderId, double amount){
        super(orderId, amount);
    }

    void processOrder(){
       System.out.println("Product with product id : " + this.orderId + " is procesing.");
    }
    void cancelOrder(){
        System.out.println("Product with product id : " + this.orderId + " is cancelled.");
    }
    public void applyDiscount(){
        System.out.println("\nYou can avail the discount on product with order-id: " + this.orderId);
    }
}

class StorePickupOrder extends Order{

    public StorePickupOrder(String orderId, double amount){
        super(orderId, amount);
    }

    void processOrder(){
        System.out.println("Product with product id : " + this.orderId + " is procesing.");
    }
    void cancelOrder(){
        System.out.println("Product with product id : " + this.orderId + " is cancelled.");
    }
}

class ECommerceOrderSystem{
    public static void main(String args[]){
        Order order1 = new OnlineOrder("25XR213", 2300);
        Order order2 = new StorePickupOrder("27XT213", 1100);

        order1.processOrder();
        order2.processOrder();

        order1.orderSummary();
        order2.orderSummary();
    
        order1.cancelOrder();
        order2.cancelOrder();

        if(order1 instanceof DiscountApplicable){
            ((DiscountApplicable)order1).applyDiscount();
        }
        if(order2 instanceof DiscountApplicable){
            ((DiscountApplicable)order1).applyDiscount();
        }

    }
}