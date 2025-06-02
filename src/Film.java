
public class Film {
    String name;
    double duration;
    double amountOfNote;
    int totalNotes;
    double averageRating;


    void sumNotes(double note){
        amountOfNote += note;
        totalNotes ++;
    }

    double average(){
        averageRating = amountOfNote/totalNotes;
        return averageRating;
    }

    void technicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Duração do Filme: " + duration);
        System.out.println("Avaliação media do filme: " + average());
    }

}