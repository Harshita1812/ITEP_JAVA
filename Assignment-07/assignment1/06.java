import java.util.Scanner;
class MovieRating{
    private String name;
    private String genre;
    private float rating;

    public void setData(String name, String genre, float rating){
        this.name = name;
        this. genre = genre;
        this.rating = rating;
    }
    public String getName(String name){
        return name;
    }
    public String getGenre(String genre){
        return genre;
    }
    public float getRating(float rating){
        return rating;
    }
    public boolean isHit(){
        if(rating >= 8.0f){
            return true;
        }
       
        return false;
    }

    public void Display(){
        System.out.println("the name of the movie: " + name);
        System.out.println("the name of the genre: " + genre);
        System.out.println("the name of the rating: " + rating);
          System.out.println("movie is hit: "+ isHit());
    }

}
 class RatingSystem{
    public static void main(String ars[]){
        MovieRating mr = new MovieRating();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a movie name: ");
        String name = sc.nextLine();

        System.out.println("enter a genre: ");
        String genre = sc.nextLine();

        System.out.println("enter a rating: ");
        float rating = sc.nextLine();

        mr.setData(name, genre, rating);
        mr.isHit();
        mr.Display();

    }
 }