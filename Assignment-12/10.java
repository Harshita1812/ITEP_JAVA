import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
class A {
        public void readFile()throws IOException{      
              FileReader fr = new FileReader("myFile.txt");
              fr.read();
              fr.close();
        }      
}
  class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      A a1=new A();
      try{
      a1.readFile();
      }
      catch(IOException i){
        System.out.println("exception handle");
      }
        sc.close();
    }
        }