package io.jsd.training.designpattern.book.chap5.multitoniterator;

public class Test {

    public static void main(String[] args) {
        Personne personne = Personne
                .getInstance("laurent");
        personne.setNom("Debrauwer");
        personne.setPrenom("Laurent");
        personne = Personne.getInstance("naouel");
        personne.setNom("Karam");
        personne.setPrenom("Naouel");

        for (Personne p : Personne
                .getEnsembleIterableDesInstances())
            System.out.println("Nom : " + p.getNom()
                    + " prénom : " + p.getPrenom());
    }

}
