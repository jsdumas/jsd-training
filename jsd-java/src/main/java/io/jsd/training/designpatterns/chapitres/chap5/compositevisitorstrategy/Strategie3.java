package io.jsd.training.designpatterns.chapitres.chap5.compositevisitorstrategy;

import java.util.ArrayList;
import java.util.List;

public class Strategie3 implements
        StrategieVisiteur<Strategie3.Resultat> {

    public class Resultat {
        private List<Fichier> fichiers;
        private List<Repertoire> repertoires;

        public Resultat(List<Fichier> fichiers,
                List<Repertoire> repertoires) {
            super();
            this.fichiers = fichiers;
            this.repertoires = repertoires;
        }

        public List<Fichier> getFichiers() {
            return fichiers;
        }

        public List<Repertoire> getRepertoires() {
            return repertoires;
        }

    }

    protected String nomCherche = "";

    protected List<Fichier> fichiers = new ArrayList<Fichier>();
    protected List<Repertoire> repertoires = new ArrayList<Repertoire>();

    public void setNomCherche(String nomCherche) {
        this.nomCherche = nomCherche;
    }

    @Override
    public void gere(Fichier fichier) {
        if (fichier.getNom().indexOf(nomCherche) != -1)
            fichiers.add(fichier);
    }

    @Override
    public void gere(Repertoire repertoire) {
        if (repertoire.getNom().indexOf(nomCherche) != -1)
            repertoires.add(repertoire);
    }

    @Override
    public Resultat getResultat() {
        return new Resultat(fichiers, repertoires);
    }

}
