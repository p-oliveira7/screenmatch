import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setMinutes(80);

        myMovie.showMovieInfo();
        myMovie.addRating(5);
        myMovie.addRating(8);
        myMovie.addRating(10);
       // System.out.println(myMovie.totalRating);
        System.out.println("Total de avaliações: "+ myMovie.getNumberOfRatings());
        System.out.println(myMovie.mkAverage());
    }
}