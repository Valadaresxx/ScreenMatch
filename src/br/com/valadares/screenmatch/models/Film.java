package br.com.valadares.screenmatch.models;
import br.com.valadares.screenmatch.calculator.Classifiable;

public class Film extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) average() / 2;
    }
}