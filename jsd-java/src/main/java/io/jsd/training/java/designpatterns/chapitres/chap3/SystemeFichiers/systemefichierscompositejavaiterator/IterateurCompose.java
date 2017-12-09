package io.jsd.training.java.designpatterns.chapitres.chap3.SystemeFichiers.systemefichierscompositejavaiterator;
import java.util.*;

public class IterateurCompose implements
        Iterator<Element> {
    protected Iterator<Element> iterateurComposants,
            IterateurComposantEnCours;

    public IterateurCompose(Iterator<Element> iterateur) {
        iterateurComposants = iterateur;
        IterateurComposantEnCours = null;
    }

    public Element next() {
        if (hasNext()) {
            if (IterateurComposantEnCours == null) {
                Element composantSuivant = iterateurComposants
                        .next();
                IterateurComposantEnCours = composantSuivant
                        .iterator();
                return composantSuivant;
            } else
                return IterateurComposantEnCours.next();
        } else
            return null;
    }

    public boolean hasNext() {
        if (IterateurComposantEnCours == null)
            return iterateurComposants.hasNext();
        if (IterateurComposantEnCours.hasNext())
            return true;
        else {
            IterateurComposantEnCours = null;
            return iterateurComposants.hasNext();
        }
    }

    public void remove() {
    }

}
