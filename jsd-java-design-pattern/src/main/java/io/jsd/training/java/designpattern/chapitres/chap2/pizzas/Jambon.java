package io.jsd.training.java.designpattern.chapitres.chap2.pizzas;
public class Jambon extends DecorateurPizza {
    public Jambon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 2.80 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription() + ", Jambon";
    }
}
