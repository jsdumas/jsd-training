package io.jsd.training.designpatterns.chapitres.chap2.pizzas;
public abstract class Pizza {
    protected String description = "";

    public String afficheDescription() {
        return description;
    }

    public abstract double calculePrix();
}
