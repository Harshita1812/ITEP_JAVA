import java.util.Scanner;
class BookLibrary{
    private String title;
    private String author;
    private float price;

    public void setData(String title, String author, float price){
    this.title = title;
    this.author = author;
    this.price = price;
    }

    public String setTitle(String title){
        return title;
    }
    public String setAuthor(String author){
        return author;
    }
    public float setPrice(float price){
    return price;
    }

    public void Display(){
        System.out.println("the title of the book: " + title);
        System.out.println("the name of the author:  " + author);
        System.out.println("the price of the book: " + price);


    }
}
class Book{
    public static void main(String args[]){

        BookLibrary bk = new BookLibrary();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a title of the book: ");
        String title = sc.nextLine();

        System.out.println("enter a authore name: ");
        String author = sc.nextLine(); 

        System.out.println("Enter a price: ");
        float price = sc.nextFloat();

        bk.setData(title, author, price);
        bk.Display();
        
    }
}