import java.util.Scanner;
class ReplaceArrayElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  size: ");
        int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0; i<n; i++){
            System.out.println("Enter a element: ");
            arr[i] = sc.nextInt();
        }
         for(int i=0; i<n; i++){
            if(arr[i]%5 == 0){
                arr[i] = 0;
                System.out.println("Replacing array element is: " + arr[i]);
            }
            else
            System.out.println("Original Array elements are: "+ arr[i]);
         }
    }
}