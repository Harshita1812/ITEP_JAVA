import java.util.Scanner;
class FindElement{
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
                
         System.out.println("maximun element is: "+ max);
        System.out.println("minimum element is: "+ min);
}
}


