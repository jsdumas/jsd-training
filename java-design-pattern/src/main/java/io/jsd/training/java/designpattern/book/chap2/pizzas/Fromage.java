package io.jsd.training.java.designpattern.book.chap2.pizzas;
public class Fromage extends DecorateurPizza {
    public Fromage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 1.50 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription() + ", Fromage";
    }
}
