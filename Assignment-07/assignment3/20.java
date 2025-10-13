import java.util.Scanner;
class Tile{
    private int side;
    public Tile(int side){
        this.side =  side;
    }
   public int getArea(){
    return side*side;
   }
}
class Floor{
    private int length;
    private int width;
    public Floor(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getArea2(){
        return length*width;
    }
    public float totalTile(Tile t){
        return (float) getArea2()/t.getArea(); 
        
    }
   
    
}
class Main{
    public static void main(String args[]){
        Floor f = new Floor(2,3);
        Tile t =  new Tile(2);
        System.out.println(t.getArea());
        System.out.println(f.getArea2());
        System.out.println(f.totalTile(t));
        
        
        
    }
}