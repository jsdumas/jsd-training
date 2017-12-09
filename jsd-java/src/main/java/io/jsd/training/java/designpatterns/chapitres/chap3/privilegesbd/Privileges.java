package io.jsd.training.java.designpatterns.chapitres.chap3.privilegesbd;
public abstract class Privileges {
    protected Privileges suivant;

    protected void accepteRequete(Requete requete) {
        if (!this.requeteOK(requete)) {
            if (suivant != null) {
                suivant.accepteRequete(requete);
            } else
                System.out.println("Requête refusée");
        }

    }

    protected abstract boolean requeteOK(Requete requete);

    public void setSuivant(Privileges suivant) {
        this.suivant = suivant;
    }
}
