package io.jsd.training.java.designpattern.book.chap1.voyages;
import java.util.*;

public class ConstructeurVoyageLuxe extends
        ConstructeurVoyage<PartieVoyageLuxe> {

    public ConstructeurVoyageLuxe() {
        voyage = new VoyageLuxe();
        composition = new ArrayList<PartieVoyageLuxe>();
    }

    @Override
    public void ajouteVol() {
        composition.add(new VolLuxe());
    }

    @Override
    public void ajouteHotel() {
        composition.add(new HotelLuxe());
    }

    @Override
    public void ajouteRepas() {
        composition.add(new RepasLuxe());
    }

    @Override
    public void ajouteActivites() {
        composition.add(new ActivitesLuxe());
    }

}
