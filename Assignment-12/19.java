import java.util.Scanner;
class MaxBooksIssuedException extends Exception{
    public MaxBooksIssuedException(String msg){
        super(msg);
    }
}

class BooksIssueLimit{
    private int books;
    public BooksIssueLimit(){
        books = 3;
    }
    public int getBooks()
    {
        return books;
    }
}
class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    BooksIssueLimit b = new BooksIssueLimit();
     
    try  { 
         System.out.println("enter your book quantity");
         int books =  sc.nextInt();
        if(b.getBooks()==books) 
        {
            System.out.println("issued Succesfully ");
            return;
        }
         else if(books != 3) throw new MaxBooksIssuedException("you can not issue more than three books");
        
    }
    catch(MaxBooksIssuedException e){
        e.printStackTrace();

    }
    }

    }
