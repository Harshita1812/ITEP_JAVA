import java.util.Scanner;
class OccurenceArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size: ");
        int n = sc.nextInt();
        int count;

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter a array element: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            count = 1;
            for(int j=1;j<arr.length-1; j++){
                if(arr[i] ==  arr[j]){
                    count++;
                }
                
            }
            System.out.println("count of the element: "+ count);
        }
        
    }
}