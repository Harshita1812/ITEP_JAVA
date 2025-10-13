/* "1 2 3 4 5 6 7 8 9 10 " */
class Main{
    public static void main(String args[]){
        String s1 = "1 2 3 4 5 6 7 8 9 10"; 
        int sum = 0 ;
        String [] numbers = s1.split(" ");
        for(String num : numbers){
          sum += Integer.parseInt(num);
        }
        System.out.println("total = " + sum);

    }
}