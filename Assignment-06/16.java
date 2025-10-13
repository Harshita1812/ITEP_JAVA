import java.util.Scanner;
class AlternatingArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
         System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
           
             arr[i] =  sc.nextInt();
        }
           int positiveElement[] = new int[n];
           int negativeElement[] = new int[n];
           int p_index = 0;
           int n_index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >=0){
               positiveElement[p_index++] = arr[i];
            }
            else{
                negativeElement[n_index++] =  arr[i];
            }

        }
        int p=0, ne=0;
        for(int i=0; i<p_index ; i=i+2){
             arr[i++] = positiveElement[p++];
        }
       for(int i=1; i<n_index; i=i+2){
        arr[i++] = negativeElement[ne++];
       }
       
       for(int k =0; k<arr.length; k++){
        System.out.println("Alternating elements: "+ arr[k]);
       }

        }
           
         
        }
    
