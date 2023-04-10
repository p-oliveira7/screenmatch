package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean userAccess;
    private double totalRating;
   private int numberOfRatings;
    private int minutes;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isUserAccess() {
        return userAccess;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getNumberOfRatings(){
        return numberOfRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserAccess(boolean userAccess) {
        this.userAccess = userAccess;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void showMovieInfo(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void addRating(double points){
        totalRating += points;
        numberOfRatings++;
    }

    public double mkAverage(){
        return totalRating / numberOfRatings;
    }
}
