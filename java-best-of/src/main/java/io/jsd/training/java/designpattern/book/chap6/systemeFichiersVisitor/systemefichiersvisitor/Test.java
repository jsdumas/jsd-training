package io.jsd.training.java.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class Test {

    public static void main(String[] args) {
        Repertoire racine = new Repertoire();
        racine.ajouteNoeud(new Fichier(10,
                TypeFichier.TEXTE));
        racine.ajouteNoeud(new Fichier(20,
                TypeFichier.TEXTE));
        racine.ajouteNoeud(new Fichier(30,
                TypeFichier.IMAGE));
        racine.ajouteNoeud(new Fichier(40,
                TypeFichier.AUTRE));
        Repertoire repertoire = new Repertoire();
        repertoire.ajouteNoeud(new Fichier(1000,
                TypeFichier.TEXTE));
        repertoire.ajouteNoeud(new Fichier(2000,
                TypeFichier.TEXTE));
        repertoire.ajouteNoeud(new Fichier(3000,
                TypeFichier.IMAGE));
        repertoire.ajouteNoeud(new Fichier(4000,
                TypeFichier.AUTRE));
        racine.ajouteNoeud(repertoire);
        System.out.println("nombre de répertoires = "
                + new VisiteurNombreRepertoires()
                        .nombreDeRepertoires(racine));
        System.out.println("nombre de fichiers = "
                + new VisiteurNombreFichiers()
                        .nombreDeFichiers(racine));
        System.out.println("nombre de noeuds = "
                + new VisiteurNombreNoeuds()
                        .nombreDeNoeuds(racine));
        System.out.println("nombre de fichiers image = "
                + new VisiteurNombreFichiersImage()
                        .nombreDeFichiersImage(racine));
        System.out.println("nombre de fichiers texte = "
                + new VisiteurNombreFichiersTexte()
                        .nombreDeFichiersTexte(racine));
    }

}
