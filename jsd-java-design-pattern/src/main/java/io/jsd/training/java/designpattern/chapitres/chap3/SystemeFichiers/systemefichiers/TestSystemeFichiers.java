package io.jsd.training.java.designpattern.chapitres.chap3.SystemeFichiers.systemefichiers;
public class TestSystemeFichiers {

    public static void main(String[] args) {
        IterateurSystemeFichiers iterateur;
        SystemeFichiers disqueC = new SystemeFichiers(
                "Disque C");
        disqueC.ajouteDossier("Programmes", 30, 205.6);
        disqueC.ajouteDossier("Documents", 45, 25.9);
        disqueC.ajouteDossier("Photos", 137, 302.6);
        iterateur = disqueC.iterator();

        while (iterateur.hasNext()) {
            Dossier dossier = iterateur.next();
            dossier.afficheInformations();
        }
        
        System.out.println();

        for (Dossier dossier : disqueC) {
            dossier.afficheInformations();
        }

    }

}