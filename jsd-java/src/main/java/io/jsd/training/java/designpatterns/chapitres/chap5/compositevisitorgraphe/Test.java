package io.jsd.training.java.designpatterns.chapitres.chap5.compositevisitorgraphe;

public class Test {

    public static void main(String[] args) {
        Noeud racine, noeud1;

        racine = new Compose("C1");
        racine.ajouteEnfant(new Feuille("F1"));
        noeud1 = new Compose("C2");
        racine.ajouteEnfant(noeud1);
        noeud1.ajouteEnfant(racine);
        noeud1.ajouteEnfant(new Feuille("F2"));

        VisiteurChercheNom visiteur = new VisiteurChercheNom(
                "C");
        racine.accepte(visiteur);
        for (NoeudIntf noeud : visiteur.getResultat())
            noeud.afficheNom();

        visiteur = new VisiteurChercheNom("F");
        racine.accepte(visiteur);
        for (NoeudIntf noeud : visiteur.getResultat())
            noeud.afficheNom();

    }

}
