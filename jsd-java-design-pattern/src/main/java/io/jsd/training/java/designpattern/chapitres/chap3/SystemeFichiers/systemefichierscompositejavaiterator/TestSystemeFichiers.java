package io.jsd.training.java.designpattern.chapitres.chap3.SystemeFichiers.systemefichierscompositejavaiterator;
public class TestSystemeFichiers {

    public static void main(String[] args) {
        Dossier disqueC = new Dossier("Disque C");
        Dossier programmes = new Dossier("Programmes");
        programmes.ajouteElement(new Fichier(
                "CompilateurJava", 125000));
        Dossier accessoires = new Dossier("Accessoires");
        accessoires.ajouteElement(new Fichier(
                "EditeurTexte", 15000));
        programmes.ajouteElement(accessoires);
        disqueC.ajouteElement(programmes);
        Dossier documents = new Dossier("Documents");
        documents.ajouteElement(new Fichier("MonCV.txt",
                72));
        disqueC.ajouteElement(documents);
        Dossier photos = new Dossier("Photos");
        photos.ajouteElement(new Fichier(
                "Panoramique.jpg", 176));
        photos.ajouteElement(new Fichier("Portrait.jpg",
                125));
        disqueC.ajouteElement(photos);

        Dossier posteDeTravail = new Dossier(
                "Poste de travail");
        posteDeTravail.ajouteElement(disqueC);

        for (Element element : posteDeTravail)
            element.afficheInformations();

    }

}