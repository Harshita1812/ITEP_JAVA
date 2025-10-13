import java.util.Scanner;
class LargestsubArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a szie: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter a array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0]; 
         int sum = arr[0];
       
        for(int i=1; i<arr.length; i++){
            if(sum >=0){
               sum += arr[i];
            }
            else {
            sum = arr[i];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
          System.out.println("Largest sum of sub arrays: " +  maxSum );
        
    }
}