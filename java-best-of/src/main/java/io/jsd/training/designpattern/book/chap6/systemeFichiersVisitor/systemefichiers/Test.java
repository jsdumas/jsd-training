package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiers;

public class Test {

    public static void main(String[] args) {
        Repertoire racine = new Repertoire();
        racine.ajouteFichier(new Fichier(10,
                TypeFichier.TEXTE));
        racine.ajouteFichier(new Fichier(20,
                TypeFichier.TEXTE));
        racine.ajouteFichier(new Fichier(30,
                TypeFichier.IMAGE));
        racine.ajouteFichier(new Fichier(40,
                TypeFichier.AUTRE));
        Repertoire repertoire = new Repertoire();
        repertoire.ajouteFichier(new Fichier(1000,
                TypeFichier.TEXTE));
        repertoire.ajouteFichier(new Fichier(2000,
                TypeFichier.TEXTE));
        repertoire.ajouteFichier(new Fichier(3000,
                TypeFichier.IMAGE));
        repertoire.ajouteFichier(new Fichier(4000,
                TypeFichier.AUTRE));
        racine.ajouteRepertoire(repertoire);
        System.out.println("nombre de répertoires = "
                + racine.nombreDeRepertoires());
        System.out.println("nombre de fichiers = "
                + racine.nombreDeFichiers());
        System.out.println("nombre de noeuds = "
                + racine.nombreDeNoeuds());
        System.out.println("nombre de fichiers image = "
                + racine.nombreDeFichiersImage());
        System.out.println("nombre de fichiers texte = "
                + racine.nombreDeFichiersTexte());
    }

}
