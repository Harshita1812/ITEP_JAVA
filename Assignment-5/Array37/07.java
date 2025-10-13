import java.util.Scanner;
class ZeroAnOnes{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size: ");
       int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
        System.out.println("enter the element of the array: ");
            arr[i] = sc.nextInt();
        }

          int count0 = 0;
          int count1 = 0;
          int count2 = 0;

         for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
               count0++;
            }
           else if(arr[i] == 1){
            count1++; 
            }

            else if(arr[i] == 2){
                count2++;
            }
         }

            int index = 0;
            while(count0-- > 0){
                arr[index++] =0;
            }
            while(count1-- > 0){
                arr[index++] = 1;
            }
             while(count2-- > 0){
                arr[index++] = 2;
            }
            System.out.println("sorted Arrar: ");
            for(int i=0; i<size; i++){
                System.out.println(arr[i]+ " ");
            }
        }
    }
