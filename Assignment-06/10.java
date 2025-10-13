import java.util.Scanner;
class RotateArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size: ");
    int size = sc.nextInt();

    int arr[] = new int[size];
      System.out.println("enter a array element: ");
    for(int i=0; i<size;i++){
         arr[i] = sc.nextInt();
    }

        int temp = arr[0];

        for(int i = 0; i < size - 1; i++){
            arr[i] = arr[i+1];
        }

        arr[size-1] = temp;

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}