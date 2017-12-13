package io.jsd.training.java.designpattern.chapitres.chap2.pizzas;
public class Champignon extends DecorateurPizza {
    public Champignon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 0.80 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription()
                + ", Champignons";
    }
}
