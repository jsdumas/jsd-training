package io.jsd.training.java.designpatterns.chapitres.chap1.voyages;
import java.util.*;

public class ConstructeurVoyageEconomique extends
        ConstructeurVoyage<PartieVoyageEconomique> {

    public ConstructeurVoyageEconomique() {
        voyage = new VoyageEconomique();
        composition = new ArrayList<PartieVoyageEconomique>();
    }

    @Override
    public void ajouteVol() {
        composition.add(new VolEconomique());
    }

    @Override
    public void ajouteHotel() {
        composition.add(new HotelEconomique());
    }

    @Override
    public void ajouteRepas() {
        composition.add(new RepasEconomique());
    }

    @Override
    public void ajouteActivites() {
        composition.add(new ActivitesEconomique());
    }
}
