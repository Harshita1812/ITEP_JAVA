import java.util.Scanner;
class BinarySearch{
    public static void main(String args[]){
        int arr[] ={10,20,30,40,50};
        int low, high;
        int element = 30;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid] == element){
                break;
            }
            else if(arr[mid] > element){
                low = mid+1;
            }
            else
            high = mid-1;
        }
        if(low>high){
            System.out.println("element found");
        }
        else
        System.out.println("element not found");

    }
}