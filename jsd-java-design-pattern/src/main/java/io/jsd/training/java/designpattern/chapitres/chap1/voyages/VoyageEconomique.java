package io.jsd.training.java.designpattern.chapitres.chap1.voyages;
public class VoyageEconomique extends
        Voyage<PartieVoyageEconomique> {
    public VoyageEconomique() {
    }

    @Override
    public void affiche() {
        System.out
                .println("Description de votre voyage economique :");
        for (PartieVoyageEconomique partieVoyage : composition) {
            partieVoyage.affiche();
        }
    }

}
