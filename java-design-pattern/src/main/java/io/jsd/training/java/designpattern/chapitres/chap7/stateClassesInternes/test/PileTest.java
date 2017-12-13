package io.jsd.training.java.designpattern.chapitres.chap7.stateClassesInternes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.jsd.training.java.designpattern.chapitres.chap7.stateClassesInternes.Pile;

//import stateClassesInternes.Pile;

public class PileTest {

    @Test
    public void testPile() {
        Pile pile = new Pile(3);
        Pile.accesInterneTest accessInterne = pile.new accesInterneTest();
        assertTrue(accessInterne.estEtatVide());
        pile.empile(10);
        assertTrue(accessInterne.estEtatNormal());
        pile.empile(10);
        assertTrue(accessInterne.estEtatNormal());
        pile.empile(10);
        assertTrue(accessInterne.estEtatPlein());
        pile.empile(10);
        assertTrue(accessInterne.estEtatPlein());
        pile.empile(10);
        assertTrue(accessInterne.estEtatPlein());
        pile.depile();
        assertTrue(accessInterne.estEtatNormal());
        pile.depile();
        assertTrue(accessInterne.estEtatNormal());
        pile.depile();
        assertTrue(accessInterne.estEtatVide());
        pile.depile();
        assertTrue(accessInterne.estEtatVide());
    }

}
