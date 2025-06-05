package br.com.valadares.screenmatch.calculator;
import br.com.valadares.screenmatch.models.Title;

public class Calculator {
    private int hours;

    public int getHours() {
        return hours;
    }
    public void inclui(Title t){
        hours += t.getDuration();
    }
}
