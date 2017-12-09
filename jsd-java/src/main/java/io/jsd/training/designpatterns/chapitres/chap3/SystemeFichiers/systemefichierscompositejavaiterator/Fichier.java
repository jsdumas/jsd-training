package io.jsd.training.designpatterns.chapitres.chap3.SystemeFichiers.systemefichierscompositejavaiterator;
import java.util.*;

public class Fichier extends Element {
    int taille;

    public Fichier(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    @Override
    public void ajouteElement(Element element) {
    }

    @Override
    public void afficheInformations() {
        System.out.println("Fichier " + nom
                + " de taille: " + taille);
    }

    public Iterator<Element> iterator() {
        return new ArrayList<Element>().iterator();
    }

}
