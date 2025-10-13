import java.util.Scanner;
class OccurrenceArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("enter the array element: ");
            arr[i] = sc.nextInt();
        }
    System.out.println("Occurrences of each element:");

        for(int i=0; i<arr.length-1; i++){
            boolean checked = false;
            for(int k=0; k<arr.length; k++){
                if(arr[i] == arr[j]){
                  checked = true;
                    break;
                }
            }
            if(checked){
                continue;
            }
            int count =1;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
             System.out.println(arr[i] + " occurred " + count + " time(s)");
        }
    }
}