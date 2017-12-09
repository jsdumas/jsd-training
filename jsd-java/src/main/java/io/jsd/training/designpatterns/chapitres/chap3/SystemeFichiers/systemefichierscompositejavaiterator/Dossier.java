package io.jsd.training.designpatterns.chapitres.chap3.SystemeFichiers.systemefichierscompositejavaiterator;
import java.util.*;

public class Dossier extends Element {
    protected List<Element> enfants = new ArrayList<Element>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    @Override
    public void ajouteElement(Element element) {
        enfants.add(element);
    }

    @Override
    public void afficheInformations() {
        System.out.println("Dossier " + nom);
    }

    public Iterator<Element> iterator() {
        return new IterateurCompose(enfants.iterator());
    }

}