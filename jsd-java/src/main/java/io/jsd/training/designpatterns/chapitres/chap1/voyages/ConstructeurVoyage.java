package io.jsd.training.designpatterns.chapitres.chap1.voyages;
import java.util.List;

public abstract class ConstructeurVoyage<T extends PartieVoyage> {
    protected Voyage<T> voyage;
    protected List<T> composition;

    public abstract void ajouteVol();

    public abstract void ajouteHotel();

    public abstract void ajouteRepas();

    public abstract void ajouteActivites();

    public Voyage<T> composeVoyage() {
        voyage.setComposition(composition);
        return voyage;
    }
}
