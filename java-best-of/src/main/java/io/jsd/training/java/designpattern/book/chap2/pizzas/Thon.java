package io.jsd.training.java.designpattern.book.chap2.pizzas;
public class Thon extends DecorateurPizza {
    public Thon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 3.20 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription() + ", Thon";
    }
}
