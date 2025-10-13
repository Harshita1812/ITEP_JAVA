import java.util.Scanner;
class CountSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];
        System.out.println("enter the element: ");
        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targeted sum: ");
        int targetSum = sc.nextInt();
        int count = 0;

        for(int i=0 ; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               if(arr[i] + arr[j] == targetSum)
               count++;
            }
        }
        System.out.println("Total sum pairs: "+ count);
    }

}