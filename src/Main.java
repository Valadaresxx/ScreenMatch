import br.com.valadares.screenmatch.calculator.Calculator;
import br.com.valadares.screenmatch.models.Film;
import br.com.valadares.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args){
        Film film1 = new Film();
        film1.setName("O auto da compadecida 2");
        film1.setDuration(135);
        film1.setReleaseYear(2025);

        film1.sumNotes(5);
        film1.sumNotes(7);
        film1.sumNotes(10);

        Film film2 = new Film();
        film2.setName("Madagascar");
        film2.setDuration(90);
        film2.setReleaseYear(2012);

        film1.technicalSheet();
        System.out.println(film1.average());
        film2.technicalSheet();
        System.out.println(film2.average());

        Serie serie1 = new Serie();
        serie1.setName("Hunter X Hunter");
        serie1.setSeason(6);
        serie1.setEpisodeForSeason(22);
        serie1.setReleaseYear(2006);
        serie1.setDurationForEpisode(22);

        serie1.technicalSheet();

        Calculator c = new Calculator();
        c.inclui(serie1);
        c.inclui(film1);
        System.out.println(c.getHours());
    }
}
