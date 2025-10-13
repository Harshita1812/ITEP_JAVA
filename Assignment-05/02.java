import java.util.Scanner;
class ArraySum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter the array element: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            arr[i] = arr[i]+sum;
            sum = arr[i];
            
        }
System.out.println("Sum of array element: "+ sum);

    }
}