package br.com.valadares.screenmatch.models;

import br.com.valadares.screenmatch.calculator.Classifiable;

public class Episode implements Classifiable {
    private int numero;
    private String nome;
    private Serie serie;
    private int views;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (views > 100){
            return 4;
        }else{
        return 2;
        }
    }
}
