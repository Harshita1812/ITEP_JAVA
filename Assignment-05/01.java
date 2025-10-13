import java.util.Scanner;
class ArrayElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter the element" + (i+1)+" ");
             arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.println("Array elements are: " + arr[i]);
        }
    }
}