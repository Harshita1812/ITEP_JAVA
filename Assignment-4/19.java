import java.util.Scanner;
class DivisionSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n =  sc.nextInt();
        float i = 1;
        while(i<=n){
            float series = (float)(1/i);
            System.out.print(" + " + " " + series);
            i++;
        }
    }
}