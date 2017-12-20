package io.jsd.training.designpattern.book.chap4.voter.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    protected List<Observateur> observateurs;

    public Sujet() {
        observateurs = new ArrayList<Observateur>();
    }

    public void enregistreObservateur(Observateur electeur) {
        observateurs.add(electeur);
    }

    protected void notifieObservateurs(
            String attributModifie, Object nouvelleValeur) {
        for (Observateur observateur : observateurs) {
            observateur.metsAJour(attributModifie,
                    nouvelleValeur);
        }
    }
}
