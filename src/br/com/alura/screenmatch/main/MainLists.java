package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        Series lost = new Series("Lost",2000 );
        Movie filmeDoPaulo = new Movie("Dogville", 2003);
        myMovie.addRating(9);
        filmeDoPaulo.addRating(10);

        ArrayList<Title> list = new ArrayList<>();
        list.add(filmeDoPaulo);
        list.add(myMovie);
        list.add(lost);
        for(Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getRating() > 2) {
                System.out.println("Classificação " + movie.getRating());
            }
        }

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Adam Sandler");
        searchByArtist.add("Paulo");
        searchByArtist.add("Alexandra");
        System.out.println(searchByArtist);

        Collections.sort(searchByArtist);
        System.out.println("Depois da ordenação: " + searchByArtist);
        Collections.sort(list);
        System.out.println(list);

        //Comparando pelo ano de lançamento

        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);


    }
}
