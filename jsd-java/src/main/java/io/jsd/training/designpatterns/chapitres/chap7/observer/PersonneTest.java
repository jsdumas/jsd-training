package io.jsd.training.designpatterns.chapitres.chap7.observer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonneTest {
    protected Personne personne;
    protected ObservateurPersonne observateurPersonne;
    protected String attributModifie;
    protected Object nouvelleValeur;

    @Test
    public void testPersonne() {
        personne = new Personne();
        observateurPersonne = new ObservateurPersonne();
        personne.ajouteObservateur(new Observateur() {

            @Override
            public void metsAJour(String attributModifie,
                    Object nouvelleValeur) {
                PersonneTest.this.attributModifie = attributModifie;
                PersonneTest.this.nouvelleValeur = nouvelleValeur;
                PersonneTest.this.observateurPersonne
                        .metsAJour(attributModifie,
                                nouvelleValeur);
            }
        });
        personne.setNom("Debrauwer");
        assertEquals(attributModifie, "nom");
        assertEquals(nouvelleValeur, "Debrauwer");
        personne.setPrenom("Laurent");
        assertEquals(attributModifie, "prenom");
        assertEquals(nouvelleValeur, "Laurent");
    }
}
