package br.com.valadares.screenmatch.calculator;

public class FilterRecommendation {

    public void filter(Classifiable c){
        if (c.getClassification() == 5){
            System.out.println("Classificação 5 Estrelas - *****");
        }else if(c.getClassification() >= 4){
            System.out.println("Classificação 4 Estrelas - ****");
        }else if(c.getClassification() >= 3){
            System.out.println("Classificação 3 Estrelas - ***");
        }else if(c.getClassification() >= 2){
            System.out.println("Classificação 2 Estrelas - **");
        }else{
            System.out.println("Classificação 1 Estrela - *");
        }


    }
}
