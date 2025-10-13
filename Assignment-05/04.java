import java.util.Scanner;
class FindElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=1; i<size; i++){
            System.out.println("enter a element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a number which you want to find: ");
        int x = sc.nextInt();
        for(int i=0;i<size; i++){
            if(arr[i] == x){
                System.out.println("Element was found: "+ arr[i]);
                break;
            }
            else 
            System.out.println("element was not found: ");
            
        }
        
            
    }
}