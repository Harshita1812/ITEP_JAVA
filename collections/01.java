import java.util.ArrayList;
class Main{
    public static void main(String args[]){
   ArrayList al = new ArrayList();
   al.add(10);
   al.add(20);
   al.add(40);
   al.add(30);
   System.out.println(al);
   System.out.println(al.size());
   System.out.println(al.contains(10));
   al.add(2, 300);
   System.out.println(al);
   //size is five 
   al.add(6,200);
   System.out.println(al);
    }
}