package io.jsd.training.designpattern.book.chap1.logicielpaysagiste;
public class Client {
    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();
        Paysage paysage = new Paysage();
        Immeuble immeuble1 = catalogue.getImmeuble();
        immeuble1.setCoordonnees(10, 20, 15);
        Immeuble immeuble2 = catalogue.getImmeuble();
        immeuble2.setNombreEtages(15);
        immeuble2.setCoordonnees(30, 20, 15);
        paysage.ajouteElement(immeuble1);
        paysage.ajouteElement(immeuble2);
        Arbre arbre1 = catalogue.getArbre();
        Arbre arbre2 = catalogue.getArbre();
        arbre1.setCoordonnees(9, 20, 15);
        arbre2.setCoordonnees(8, 20, 15);
        paysage.ajouteElement(arbre1);
        paysage.ajouteElement(arbre2);
        Banc banc = catalogue.getBanc();
        banc.setCouleur("verte");
        banc.setCoordonnees(7, 20, 15);
        paysage.ajouteElement(banc);
        paysage.affiche();
    }
}
