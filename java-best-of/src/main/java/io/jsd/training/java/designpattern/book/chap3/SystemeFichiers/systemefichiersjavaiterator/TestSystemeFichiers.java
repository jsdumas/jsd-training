package io.jsd.training.java.designpattern.book.chap3.SystemeFichiers.systemefichiersjavaiterator;
public class TestSystemeFichiers {

    public static void main(String[] args) {
        SystemeFichiers disqueC = new SystemeFichiers(
                "Disque C");
        disqueC.ajouteDossier("Programmes", 30, 205.6);
        disqueC.ajouteDossier("Documents", 45, 25.9);
        disqueC.ajouteDossier("Photos", 137, 302.6);
        for (Dossier dossier : disqueC) {
            dossier.afficheInformations();
        }

    }

}
