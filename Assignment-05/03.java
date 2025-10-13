import java.util.Scanner;
class EvenOddArrayElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter a element: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                System.out.println("even element are in array: "+ arr[i]);
            }
             if(arr[i] % 2 ==1){
                System.out.println("odd number in array: "+ arr[i]);
            }
        }
    }
}