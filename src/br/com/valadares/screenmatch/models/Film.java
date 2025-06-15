package br.com.valadares.screenmatch.models;
import br.com.valadares.screenmatch.calculator.Classifiable;

public class Film extends Title implements Classifiable {
    private final String director;

    public Film(String name, double duration, int releaseYear, String director) {
        super(name, duration, releaseYear);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getClassification() {
        return (int) average() / 2;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getReleaseYear() + ")";
    }
}