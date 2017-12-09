package io.jsd.training.designpatterns.chapitres.chap4.multiton;

public class Test {

    public static void main(String[] args) {
        Personne personne1 = Personne.Instance("laurent");
        personne1.setNom("Debrauwer");
        personne1.setPrenom("Laurent");
        Personne personne2 = Personne.Instance("laurent");
        System.out.println(personne2.getPrenom() + " "
                + personne2.getNom());
        if (personne1 == personne2)
            System.out
                    .println("Les deux instances sont bien identiques");
    }

}
