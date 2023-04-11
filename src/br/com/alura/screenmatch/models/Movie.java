package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.estimate.QualifiedToRating;

public class Movie extends Title implements QualifiedToRating {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) mkAverage() / 2;
    }
}
