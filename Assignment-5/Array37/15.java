import java.util.Scanner;
class EqualSubArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the array element: ");
            arr[i] =  sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
          
            for(int j=i; j<arr.length;j++){
                if(arr[j] == 0){
                    sum += -1;
                }
                if(arr[j] == 1){
                    sum += 1;
                }

            }
            if(sum == 0){
                System.out.println("equal sub Array of 0s and 1s: " + arr[i]);
            }
        }
    }
}