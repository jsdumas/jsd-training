package io.jsd.training.designpattern.book.chap2.pizzas;
public class OliveNoire extends DecorateurPizza {
    public OliveNoire(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 0.40 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription()
                + ", Olives noires";
    }
}
