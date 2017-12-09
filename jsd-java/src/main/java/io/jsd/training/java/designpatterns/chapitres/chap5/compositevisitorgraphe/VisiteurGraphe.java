package io.jsd.training.java.designpatterns.chapitres.chap5.compositevisitorgraphe;

import java.util.ArrayList;
import java.util.List;

public abstract class VisiteurGraphe<T> {
    protected T resultat;
    protected List<Noeud> noeudDejaVisites = new ArrayList<Noeud>();

    public void visite(Feuille feuille) {
        gereVisite(feuille);
        noeudDejaVisites.add(feuille);
    }

    public void visite(Compose compose) {
        gereVisite(compose);
        noeudDejaVisites.add(compose);
        List<Noeud> enfants = compose.getEnfants();
        for (NoeudIntf enfant : enfants)
            if (!noeudDejaVisites.contains(enfant))
                enfant.accepte(this);
    }

    public T getResultat() {
        return resultat;
    }

    abstract protected void gereVisite(Feuille feuille);

    abstract protected void gereVisite(Compose compose);
}
