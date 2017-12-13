package io.jsd.training.java.designpattern.chapitres.chap5.proxyPrototype.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyCalculatrice {

    public class ExceptionProxy extends Exception {
    }

    protected Calculatrice sujet = null;
    private static final Set<String> clefs = new HashSet<String>();

    static {
        clefs.add("clef1");
        clefs.add("clef2");
    }

    protected Calculatrice getSujet() {
        if (sujet == null)
            sujet = new Calculatrice();
        return sujet;
    }

    public int getValeur(String clef)
            throws ExceptionProxy {
        if (!clefs.contains(clef))
            throw new ExceptionProxy();
        return getSujet().getValeur();
    }

    public void setValeur(String clef, int valeur)
            throws ExceptionProxy {
        if (!clefs.contains(clef))
            throw new ExceptionProxy();
        getSujet().setValeur(valeur);
    }

    public void ajoute(String clef, int montant)
            throws ExceptionProxy {
        if (!clefs.contains(clef))
            throw new ExceptionProxy();
        getSujet().ajoute(montant);
    }

    public void soustrait(String clef, int montant)
            throws ExceptionProxy {
        if (!clefs.contains(clef))
            throw new ExceptionProxy();
        getSujet().soustrait(montant);
    }

    public void multiplie(String clef, int coefficient)
            throws ExceptionProxy {
        if (!clefs.contains(clef))
            throw new ExceptionProxy();
        getSujet().multiplie(coefficient);
    }
}
