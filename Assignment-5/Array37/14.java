import java.util.Scanner;
class NonRepeatingElments{
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];
        System.out.println("enter the element: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        for(int i=0; i<arr.length; i++){
          boolean isRepeating =  false;
          for(int j=0; j<arr.length; j++){
            if((i !=j) && (arr[i] == arr[j])){
              isRepeating = true;
              break;
            }
          }
          if(!isRepeating){
             System.out.println("non repeating element: " + arr[i]);
             found = true;
             break;
              }
            }
             if (!found) {
            System.out.println("No non-repeating element found in the array.");
        }

 }
}