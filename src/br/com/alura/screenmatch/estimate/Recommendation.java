package br.com.alura.screenmatch.estimate;

public class Recommendation {
    private String recommendation;

    public void filter(QualifiedToRating qualified){
        if (qualified.getRating() >= 4){
            System.out.println("Está entre os favoritos do momento");
        }else if (qualified.getRating() >= 2){
            System.out.println("Muito bem avaliado no momento");

        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
