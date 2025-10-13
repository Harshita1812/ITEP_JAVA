import java.util.Scanner;
class SubArray{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size: ");
    int size = sc.nextInt();

    int arr[] = new int[size];
      System.out.println("enter a array element: ");
    for(int i=0; i<size;i++){
      
        arr[i] = sc.nextInt();
    }

    System.out.println("enter a number for sum: ");
    int s = sc.nextInt();
    boolean found = false;

     
    for(int i=0; i<arr.length; i++){
         int sum = 0;
         for(int j=i; j<arr.length; j++){
            sum += arr[j];
             if(sum == s){
             System.out.println("position of the elements: " + (i+1) +" "+ (j+1));
             found = true;
            break;
        }
         }
         if(found)
         break;
         else 
         System.out.println("no sub array");
        
    
    
}
}
}