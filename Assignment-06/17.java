import java.util.Scanner;
class EqualSums{
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("entert the size: ");
          int n = sc.nextInt();

          int arr[] = new int[n];
     System.out.println("enter a array element: ");
     for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
     }
     boolean found = false;

     for(int i=0; i<arr.length; i++){
          int sum =0;
     for(int j=i; j<arr.length; j++){
          sum+= arr[j];
          if(sum == 0){
               found = true;
        System.out.println("yes");  
      }
      
     }
     }
     if(!found){
           System.out.println("no"); 
     }

}
}