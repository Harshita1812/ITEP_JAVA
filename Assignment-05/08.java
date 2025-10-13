import java.util.Scanner;
class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
       

        for(int i =0; i<size;i++){
            System.out.println("enter a aaray element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter an element which you to search: ");
        int element = sc.nextInt();
       

        int i = 0, j = size-1;
        while(i <= j){
             int mid = (i+j)/2;

            if(arr[mid] == element){
                break;
            }
            else if(arr[mid] < element){
                i = mid+1;
            }
            else
            j = mid-1;
        }
        if(i <= j){
            System.out.println("element found");
        }
        else
        System.out.println("element not found");
    }
}