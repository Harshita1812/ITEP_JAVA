import java.util.Scanner;
class ReverseArrayElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter a element: ");
            arr[i] = sc.nextInt();
        }       
        int brr[] = new int[size];
        for(int i=0; i<size; i++){
           System.out.println("array =" + arr[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            brr[i] = arr[size-1-i];
            System.out.println("reverse array element: " + brr[i]);
        }

        }
     
}