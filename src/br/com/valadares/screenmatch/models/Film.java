package br.com.valadares.screenmatch.models;

public class Film {
    private String name;
    private double duration;
    private int releaseYear;
    private double amountOfNote;
    private int totalNotes;
    private double averageRating;



    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
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
        System.out.println("Nome do filme: " + name);
        System.out.println("Duração do Filme: " + duration);
        System.out.println("Ano de Lançamento: " + releaseYear);
        System.out.println("Total de avaliações: " + getTotalNotes());
        System.out.println("Avaliação media do filme: " + average());
    }

}