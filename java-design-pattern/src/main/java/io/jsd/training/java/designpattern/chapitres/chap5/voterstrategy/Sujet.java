package io.jsd.training.java.designpattern.chapitres.chap5.voterstrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    protected List<Electeur> electeurs;
    protected StrategieVote strategieVote;

    public Sujet(StrategieVote strategieVote) {
        electeurs = new ArrayList<Electeur>();
        this.strategieVote = strategieVote;
    }

    public void enregistreElecteur(Electeur electeur) {
        electeurs.add(electeur);
    }

    protected boolean notifieElecteurs(
            String attributModifie, Object nouvelleValeur) {
        strategieVote.initialiseVotes();
        for (Electeur electeur : electeurs) {
            strategieVote.ajouteVote(electeur.metsAJour(
                    attributModifie, nouvelleValeur));
        }
        return strategieVote.getResultat();
    }
}
