import java.util.Scanner;
class Duplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size1: ");
        int size1 =  sc.nextInt();
        int arrA[] = new int[size1];
        System.out.println("Enter the elments for array A");
        for(int i=0; i<size1; i++){
        arrA[i] = sc.nextInt();
        }

        System.out.println("enter the size2: ");
        int size2 =  sc.nextInt();
        int arrB[] = new int[size2];
        System.out.println("Enter the elments for array B");
        for(int j=0; j<size2; j++){
        arrB[j] = sc.nextInt();
        }

        System.out.println("enter the size3: ");
        int size3 =  sc.nextInt();
        int arrC[] = new int[size3];
        
        System.out.println("Enter the elments for array C");
        for(int k=0; k<size3; k++){
        arrC[k] = sc.nextInt();
        }

        for(int i =0; i<arrA.length; i++){
            for(int j =0; j<arrB.length; j++){
                for(int k=0; k<arrC.length; k++){
                    if((arrA[i] == arrB[j]) && (arrA[i]== arrC[k]) &&(arrB[j] == arrC[k]))
                    System.out.println("Duplicate values is "+arrA[i]);
                }

            }
        }
    }
}