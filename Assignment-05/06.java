import java.util.Scanner;
class SortingArray{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size: ");
        int n = sc.nextInt();

        int arr[] =  new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter a number: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                  int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp; 
                }
            }
            
        }
       for(int i=0; i<arr.length; i++){
         System.out.println("sorted array is: "+ arr[i]);
       }

    }

}