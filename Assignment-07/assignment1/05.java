import java.util.Scanner;
class Product{
    private int productId;
    private String name;
    private double quantity;
    private double price;

    public void setData(int productId, String name, double quantity, double price){
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
        public int getProductId(int productId){
            return productId;
        }
        public String getName(String name){
            return name;

        }
        public double getQuantity(double quantity){
            return quantity;
        }
        public double getPrice(double price){
        return price;
        }
        // public double totalValue(double quantity, double price){
        // System.out.println("total value is :" + (quantity*price));
        // }

        public double multiplication(double quantity, double price){
        return quantity * price;
        }

        public void Display(){
            System.out.println("ProductId: " + productId);
            System.out.println("name: " + name);
            System.out.println("quantity: " + quantity);
            System.out.println("price: " + price);
        }
}
   
    

    class Inventory{
        public static void main(String args[]){
            Product p = new Product();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a product id: ");
            int productId = sc.nextInt();

            System.out.println("Enter a product name: ");
            String name  = sc.nextLine();

            System.out.println("Enter a quantity: ");
            double quantity = sc.nextDouble();

            System.out.println("enter the price: ");
            double price = sc.nextDouble();


            p.setData(productId, name, quantity, price);
            p.Display();
            double result = p.multiplication(quantity, price);
            System.out.println("total value :"+result);
            
        }
    }

