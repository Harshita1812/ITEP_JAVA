import java.util.Scanner;
class CarInfo {
    private String brand;
    private String model;
    private int year;

    public void setData(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year =  year;
    }
    public String getBrand(String brand){
        return brand;
    }
    public String getModel(String model){
        return model;
    }
    public int getYear(int year){
        return year;
    }
    public void Display(){
         System.out.println("the brand name : "+ brand);
        System.out.println("the model name : "+ model);
        System.out.println("the year : "+ year);

    }

} 
class Manager{
    public static void main(String ar[]){
        CarInfo cr = new CarInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a brand name: ");
        String brand = sc.nextLine();

        System.oout.println("enter a model name: ");
        String model =  sc.nextLine(); 

        System.out.println("Enter a year"); 
        int year = sc.nextInt();
        cr.setData(brand, model, year);
         cr.Display();
    }
   
}
