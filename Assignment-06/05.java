import java.util.Scanner;
class KthElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th size of array: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter the aaray element: ");
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
            int min = arr[0];
        for(int i=0; i<arr.length; i++){
            
                if(max <= arr[i]){
                    max = arr[i];
                }
                else if(min > arr[i]){
                    min = arr[i];

                }
        }
                
         System.out.println("Kth largest element is: "+ max);
        System.out.println("kth minimun element is: "+ min);
}
}


