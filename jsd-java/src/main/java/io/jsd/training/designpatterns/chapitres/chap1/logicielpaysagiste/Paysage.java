package io.jsd.training.designpatterns.chapitres.chap1.logicielpaysagiste;
import java.util.*;

public class Paysage {
    protected List<ObjetGraphique> elements = new ArrayList<ObjetGraphique>();

    public void ajouteElement(ObjetGraphique element) {
        elements.add(element);
    }

    public List<ObjetGraphique> getElements() {
        return elements;
    }

    public void affiche() {
        for (ObjetGraphique elt : elements) {
            elt.affiche();
        }
    }
}
