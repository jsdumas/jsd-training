package io.jsd.training.java.designpattern.book.chap7.chainofresponsibility;

import org.junit.Test;

public class TestChaine {
    @Test
    public void testChaine() {
        Comptable comptable;
        Secretaire secretaire;
        Commercial commercial;
        Employe tete;
        comptable = new Comptable(null);
        commercial = new Commercial(
                new DecorateurEmployeTest(
                        comptable,
                        Courrier.Categorie.COMPTABLE));
        secretaire = new Secretaire(
                new DecorateurEmployeTest(
                        commercial,
                        Courrier.Categorie.COMMERCIAL));
        tete = new DecorateurEmployeTest(
                secretaire,
                Courrier.Categorie.ADMINISTRATIF);
        tete
                .gereCourrier(new Courrier(
                        Courrier.Categorie.COMPTABLE,
                        "lettre 1"));
        tete.gereCourrier(new Courrier(
                Courrier.Categorie.ADMINISTRATIF,
                "lettre 2"));
        tete
                .gereCourrier(new Courrier(
                        Courrier.Categorie.COMMERCIAL,
                        "lettre 3"));
    }
}
