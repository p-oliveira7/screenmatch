package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.estimate.QualifiedToRating;

public class Episode implements QualifiedToRating {
    private int number;
    private String name;
    private Series serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getRating() {
        if (totalViews > 100){
            return 4;
        }else{
            return 2;
        }

    }
}
