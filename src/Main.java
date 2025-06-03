import br.com.valadares.screenmatch.models.Film;

public class Main {
    public static void main(String[] args){
        Film film1 = new Film();
        film1.setName("O auto da compadecida 2");
        film1.setDuration(135);
        film1.setReleaseYear(2025);

        film1.sumNotes(5);
        film1.sumNotes(7);
        film1.sumNotes(10);

        film1.technicalSheet();
        System.out.println(film1.average());
    }
}
