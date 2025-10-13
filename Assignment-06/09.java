import java.util.Scanner;
class PositiveNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
      
    
    System.out.println("enter a array element: ");
    for(int i=0; i<size;i++){
        arr[i] = sc.nextInt();
    }
    int arr2[] = new int[size];
    int k = 0;
    for(int i=0; i<arr.length;i++){
    if(arr[i] >= 0)
       arr2[k++] = arr[i];
    }
    for(int i=0;i<arr.length;i++){
    if(arr[i]<0)
        arr2[k++] = arr[i];
    }
    for(int x: arr2){
        System.out.print(x+" ");
    }
}
 }
