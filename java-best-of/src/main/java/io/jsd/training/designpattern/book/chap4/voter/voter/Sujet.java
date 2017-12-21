package io.jsd.training.designpattern.book.chap4.voter.voter;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    protected List<Electeur> electeurs;

    public Sujet() {
        electeurs = new ArrayList<Electeur>();
    }

    public void enregistreElecteur(Electeur electeur) {
        electeurs.add(electeur);
    }

    protected boolean notifieElecteurs(
            String attributModifie, Object nouvelleValeur) {
        boolean voteOK = true;
        for (Electeur electeur : electeurs) {
            voteOK = electeur.metsAJour(attributModifie,
                    nouvelleValeur)
                    && voteOK;
        }
        return voteOK;
    }
}
