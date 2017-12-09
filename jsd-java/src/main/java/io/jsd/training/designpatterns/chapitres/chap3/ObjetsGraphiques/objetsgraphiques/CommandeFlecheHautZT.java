package io.jsd.training.designpatterns.chapitres.chap3.ObjetsGraphiques.objetsgraphiques;
public class CommandeFlecheHautZT implements Commande {
    protected ZoneTexte recepteur;

    public CommandeFlecheHautZT(ZoneTexte r) {
        this.recepteur = r;
    }

    public void lance() {
        int taille = recepteur.getTaillePolice();
        if (taille < ZoneTexte.TAILLEMAX)
            recepteur.setTaillePolice(taille + 1);
    }

}
