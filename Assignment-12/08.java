import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class A {
        public void op()throws IOException{      
                FileReader fr = new FileReader("nonexistent.txt");
                fr.read();
                fr.close();
           
        }      
        public void opp()  throws ArithmeticException{
            int a=5/0;
        }
}
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      A a1=new A();
      try{
      a1.op();
      }
      catch(IOException i){
        System.out.println("Io exception handled");
      }
      a1.opp();
      
      
    }     
}