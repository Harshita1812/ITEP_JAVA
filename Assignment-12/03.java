import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter a size"); 
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter the array element: ");
            arr[i] = sc.nextInt();

        }
       
        for(int i=0; i<=size; i++){
            System.out.println("array element: " + arr[i]);
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
           
        e.printStackTrace();
        }
        System.out.println("End of the program!");
       
     
    }
}