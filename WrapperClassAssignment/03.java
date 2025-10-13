/* hello 1 world 2 welcome 3*/
class Main{
    public static void main(String args[]){
        String s = "hello 10 world 2 welcome 3"; 
        int sum = 0 ;
        String number[] = s.split(" ");
        for(String s1 : number){
            try{
          sum += Integer.parseInt(s1);
            }
            catch(NumberFormatException e){}
        }
        System.out.println("total = " + sum);

    }
}