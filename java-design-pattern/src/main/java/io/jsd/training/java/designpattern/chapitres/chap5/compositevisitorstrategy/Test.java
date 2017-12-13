package io.jsd.training.java.designpattern.chapitres.chap5.compositevisitorstrategy;

public class Test {

    public static void main(String[] args) {
        Noeud noeud1, noeud2, noeud3, racine;
        noeud1 = new Fichier("F1");
        noeud2 = new Fichier("F2");
        noeud3 = new Repertoire("R2");
        noeud3.ajouteSousNoeud(noeud1);
        noeud3.ajouteSousNoeud(noeud2);
        noeud1 = new Fichier("F3");
        racine = new Repertoire("R1");
        racine.ajouteSousNoeud(noeud3);
        racine.ajouteSousNoeud(noeud1);

        Visiteur<Strategie1, Integer> visiteur1 = new Visiteur<Strategie1, Integer>(
                Strategie1.class);
        racine.accepteVisiteur(visiteur1);
        System.out.println("Nombre de noeuds : "
                + visiteur1.getResultat());

        Visiteur<Strategie2, Strategie2.Resultat> visiteur2 = new Visiteur<Strategie2, Strategie2.Resultat>(
                Strategie2.class);
        racine.accepteVisiteur(visiteur2);
        System.out.println("Nombre de fichiers : "
                + visiteur2.getResultat()
                        .getNbrFichiers());
        System.out.println("Nombre de répertoires : "
                + visiteur2.getResultat()
                        .getNbrRepertoires());

        Visiteur<Strategie3, Strategie3.Resultat> visiteur3 = new Visiteur<Strategie3, Strategie3.Resultat>(
                Strategie3.class);
        visiteur3.getStrategieVisiteur().setNomCherche(
                "2");
        racine.accepteVisiteur(visiteur3);
        System.out.println("Nombre de fichiers : "
                + visiteur3.getResultat().getFichiers()
                        .size());
        for (Fichier fichier : visiteur3.getResultat()
                .getFichiers())
            System.out.println("Fichier : "
                    + fichier.getNom());
        System.out.println("Nombre de répertoires : "
                + visiteur3.getResultat()
                        .getRepertoires().size());
        for (Repertoire repertoire : visiteur3
                .getResultat().getRepertoires())
            System.out.println("Répertoire : "
                    + repertoire.getNom());

    }

}
