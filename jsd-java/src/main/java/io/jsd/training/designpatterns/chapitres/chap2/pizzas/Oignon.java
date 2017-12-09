package io.jsd.training.designpatterns.chapitres.chap2.pizzas;
public class Oignon extends DecorateurPizza {
    public Oignon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 0.30 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription() + ", Oignons";
    }
}
