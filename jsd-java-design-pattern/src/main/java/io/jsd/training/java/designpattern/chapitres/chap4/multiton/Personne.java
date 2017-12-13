package io.jsd.training.java.designpattern.chapitres.chap4.multiton;

import java.util.HashMap;
import java.util.Map;

public class Personne {
    protected String nom;
    protected String prenom;

    private static final Map<Object, Personne> _instances = new HashMap<Object, Personne>();

    private Personne() {
    }

    public static Personne Instance(Object clef) {
        Personne instance = _instances.get(clef);
        if (instance == null) {
            instance = new Personne();
            _instances.put(clef, instance);
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
