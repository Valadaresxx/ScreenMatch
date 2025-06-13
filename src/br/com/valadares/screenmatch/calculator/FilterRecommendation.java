package br.com.valadares.screenmatch.calculator;

public class FilterRecommendation {
    private String recommendation;

    public void filter(Classifiable c){
        if (c.getClassification() >=4){
            System.out.println("entre os preferidos");

        }else if(c.getClassification() >= 2){
            System.out.println("Está em alta");
        }else{
            System.out.println("Coloque na lista para assistir");
        }


    }
}
