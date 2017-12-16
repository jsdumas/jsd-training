package io.jsd.training.java.designpattern.book.chap5.multitoniterator;

import java.util.HashMap;
import java.util.Map;

public class Personne {
    protected String nom;
    protected String prenom;

    private static final Map<Object, Personne> _instances =
            new HashMap<Object, Personne>();

    private Personne() {
    }

    public static Iterable<Personne> getEnsembleIterableDesInstances() {
        return _instances.values();
    }

    public static Personne getInstance(Object key) {
        Personne instance = _instances.get(key);
        if (instance == null) {
            instance = new Personne();
            _instances.put(key, instance);
        }
        return instance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
