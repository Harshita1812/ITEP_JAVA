import java.util.Scanner;
class LargestSubArrayMultiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a szie: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter a array element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxMul = arr[0]; 
        
       
        for(int i=0; i<arr.length; i++){
             int mul = 1;
             for(int j=i; j<arr.length; j++){
                mul *= arr[j];
            if(mul >maxMul){
             maxMul = mul ;
            }
             }
        }
          System.out.println("Largest multiplication of sub arrays: " +  maxMul );
        
    }
}