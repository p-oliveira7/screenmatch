package br.com.alura.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean userAccess;
    private double totalRating;
    private int numberOfRatings;
    private int minutes;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.minutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
    }

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

    @Override
    public int compareTo(Title oTitle) {
        return this.getName().compareTo(oTitle.getName());
    }

    @Override
    public String toString() {
        return "(nome: " + name + '\'' +
                ", ano de lançamento: " + releaseYear+","+
        "duração:  "+ minutes + ")";
    }
}

