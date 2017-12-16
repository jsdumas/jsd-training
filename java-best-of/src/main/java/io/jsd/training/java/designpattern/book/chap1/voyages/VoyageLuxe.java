package io.jsd.training.java.designpattern.book.chap1.voyages;
public class VoyageLuxe extends Voyage<PartieVoyageLuxe> {
    public VoyageLuxe() {
    }

    @Override
    public void affiche() {
        System.out
                .println("Description de votre voyage de luxe:");
        for (PartieVoyageLuxe partieVoyage : composition) {
            partieVoyage.affiche();

        }
    }

}
