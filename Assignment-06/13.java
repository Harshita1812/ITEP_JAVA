import java.util.Scanner;
class RepeatingElments{
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];
        System.out.println("enter the element: ");
        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }

        boolean check = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                System.out.println("First repeating elment: "+ arr[i]);
                check = true;
                break; 
                }
            }
            if(check)
            break;
        }
 }
}
            

