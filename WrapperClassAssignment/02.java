class Main{
    public static void main(String args[]){
        String s = "1,2,3,4,5,6,7,8,9,10"; 
        int sum = 0 ;
        String number[] = s.split(",");
        for(String s1 : number){
          sum += Integer.parseInt(s1);
        }
        System.out.println("total = " + sum);

    }
}