import java.util.Scanner;
class Tables{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number1: ");
    int startNum = sc.nextInt();
    
    System.out.println("enter a number2: ");
    int endNum =  sc.nextInt();

    for(int i = startNum; i<=endNum; i++){
        System.out.println("\ntable of " + i + ": ");
        for(int j =1; j<=10; j++){
            System.out.println(" " + i + " * " + j + " = " + (i*j));
        }
    }
    }
}