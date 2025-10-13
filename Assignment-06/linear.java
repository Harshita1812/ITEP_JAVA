import java.util.Scanner;
class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int element = 20;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                int position = i;
                System.out.println("array found at index " +position);
            }
        }
    }
}