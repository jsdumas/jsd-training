package io.jsd.training.designpatterns.chapitres.chap6.systemeFichiersVisitor.systemefichiers;

public class Fichier {
    protected long taille;
    protected TypeFichier typeFichier;

    public Fichier(long taille, TypeFichier typeFichier) {
        this.taille = taille;
        this.typeFichier = typeFichier;
    }

    public long getTaille() {
        return taille;
    }

    public TypeFichier getTypeFichier() {
        return typeFichier;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    public void setTypeFichier(TypeFichier typeFichier) {
        this.typeFichier = typeFichier;
    }

    public boolean estUnFichierTexte() {
        return typeFichier == TypeFichier.TEXTE;
    }

    public boolean estUnFichierImage() {
        return typeFichier == TypeFichier.IMAGE;
    }
}
