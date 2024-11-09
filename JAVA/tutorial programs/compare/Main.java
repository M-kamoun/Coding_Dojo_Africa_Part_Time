import java.io.*;
import java.util.*;


// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    @Override
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

    @Override
    public String toString() {
   
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void display(ArrayList<Movie> list){
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }

    }

    

    
}

class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
       if(m1.getRating()< m2.getRating()){
        return -1;
       }
       if(m1.getRating()> m2.getRating()){
        return 1;
       }else{
        return 0;
       }
       
    }
    
}

class NameCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
    
}






// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        System.out.println("Movies before sorting : ");

        Movie.display(list);
        

        

        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        Movie.display(list);

        RatingCompare compare = new RatingCompare();
        Collections.sort(list, compare);
        System.out.println("Movies after sorting by rating*******: ");
        Movie.display(list);
        
        NameCompare compare2 = new NameCompare();
        Collections.sort(list, compare2);
        System.out.println("Movies after sorting by name*******: ");
        Movie.display(list);

        
        
    }
}