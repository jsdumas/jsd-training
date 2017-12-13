package io.jsd.training.java.designpattern.chapitres.chap1.connexions;
public class ConnexionOracle extends Connexion {
    public ConnexionOracle(String utilisateur,
            String motdepasse) {
        super(utilisateur, motdepasse);
    }

    @Override
    public void getDescription() {
        System.out
                .println("Connecté à Oracle avec le nom d'utilisateur : "
                        + utilisateur);
    }
}
