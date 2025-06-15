import br.com.valadares.screenmatch.calculator.Calculator;
import br.com.valadares.screenmatch.calculator.FilterRecommendation;
import br.com.valadares.screenmatch.models.Film;
import br.com.valadares.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Film film1 = new Film("O auto da compadecida 2", 135,
                            2025, "Não sei ainda");
        film1.sumNotes(5);
        film1.sumNotes(7);
        film1.sumNotes(10);

        Film film2 = new Film("Madagascar", 90,
                            2012, "Não sei ainda");

        Serie serie1 = new Serie("Hunter X Hunter", 2006, 6,
                        22, 22, 24);
        serie1.sumNotes(10);


        Calculator c = new Calculator();
        c.inclui(serie1);
        c.inclui(film1);
        System.out.println(c.getHours());

        FilterRecommendation filter = new FilterRecommendation();
        filter.filter(film1);

        ArrayList<Film> listMovies = new ArrayList<>();
        listMovies.add(film1);
        listMovies.add(film2);
        System.out.println("Quantidade de itens na lista: " + listMovies.size());
        System.out.println("Filme na posição numero 1: " + listMovies.get(0).getName());
        System.out.println(listMovies);

    }
}
