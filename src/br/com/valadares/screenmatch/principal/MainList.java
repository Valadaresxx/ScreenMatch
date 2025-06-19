package br.com.valadares.screenmatch.principal;

import br.com.valadares.screenmatch.models.Film;
import br.com.valadares.screenmatch.models.Serie;
import br.com.valadares.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        Film film1 = new Film("O auto da compadecida 2", 135,
                2025, "Não sei ainda");
        Film film2 = new Film("Madagascar", 90,
                2012, "Não sei ainda");
        Serie serie1 = new Serie("Hunter X Hunter", 1420, 2006,
                6, 22, 24);

        List<Title> myList = new ArrayList<>();
        myList.add(film1);
        myList.add(film2);
        myList.add(serie1);

//        Collections.sort(myList);
        myList.sort(Comparator.comparing(Title::getReleaseYear));

        for (Title i: myList){
            System.out.println(i);
        }
    }
}
