package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.estimate.Recommendation;
import br.com.alura.screenmatch.estimate.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.setMinutes(80);
        System.out.println("Duração do filme: " + myMovie.getMinutes());


        myMovie.showMovieInfo();
        myMovie.addRating(5);
        myMovie.addRating(8);
        myMovie.addRating(10);
       // System.out.println(myMovie.totalRating);
        System.out.println("Total de avaliações: "+ myMovie.getNumberOfRatings());
        System.out.println(myMovie.mkAverage());

        Series lost = new Series("Lost",2000 );
        lost.showMovieInfo();
        lost.setSeasons(10);
        lost.setEpsPerSeason(10);
        lost.setMinutesPerEp(50);
        System.out.println("Duração para maratonar Lost: " + lost.getMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(myMovie);
        calculator.add(lost);
        System.out.println(calculator.getTotalTime());

        Recommendation filter = new Recommendation();
        filter.filter(myMovie);
        Episode episode  = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.filter(episode);

        Movie filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.setMinutes(200);
        filmeDoPaulo.addRating(10);



        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(myMovie);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());
    }
}