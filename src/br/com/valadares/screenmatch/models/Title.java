package br.com.valadares.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private final String name;
    private final double duration;
    private final int releaseYear;
    private double amountOfNote;
    private int totalNotes;
    private double averageRating;

    public Title(String name, double duration, int releaseYear) {
        this.name = name;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getTotalNotes(){
        return totalNotes;
    }

    public void sumNotes(double note){
        amountOfNote += note;
        totalNotes ++;
    }

    public double average(){
        averageRating = amountOfNote/totalNotes;
        return averageRating;
    }

    public void technicalSheet(){
        System.out.println("------------------------");
        System.out.println("Nome: " + getName());
        System.out.println("Duração: " + getDuration());
        System.out.println("Ano de Lançamento: " + getReleaseYear());
        System.out.println("Total de avaliações: " + getTotalNotes());
        System.out.println("------------------------");
        //  System.out.println("Avaliação media do filme: " + average());
    }

    @Override
    public String toString() {
        return "Title{" +
                "Nome:" + name + '\'' +
//                ", duration=" + duration +
                "- Ano de Lançamento: (" + releaseYear +
                ")"+
//                ", amountOfNote=" + amountOfNote +
//                ", totalNotes=" + totalNotes +
//                ", averageRating=" + averageRating +
                '}';
    }

    @Override
    public int compareTo(Title o) {
        return this.getName().compareTo(o.getName());
    }
}
