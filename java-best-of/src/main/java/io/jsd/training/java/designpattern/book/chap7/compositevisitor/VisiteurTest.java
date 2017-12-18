package io.jsd.training.java.designpattern.book.chap7.compositevisitor;

import static org.junit.Assert.assertTrue;

public class VisiteurTest {

    public void visite(NoeudOperateur noeud) {
        assertTrue((noeud instanceof NoeudAddition)
                || (noeud instanceof NoeudSoustraction));
        noeud.getSousNoeudGauche().accepteVisiteurTest(
                this);
        noeud.getSousNoeudDroit().accepteVisiteurTest(
                this);
    }

    public void visite(NoeudEntier noeud) {
        assertTrue(noeud.getValeur() >= 0);
    }

}
