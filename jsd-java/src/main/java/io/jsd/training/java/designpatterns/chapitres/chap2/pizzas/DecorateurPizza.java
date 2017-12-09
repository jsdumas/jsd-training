package io.jsd.training.java.designpatterns.chapitres.chap2.pizzas;
public abstract class DecorateurPizza extends Pizza {
    protected Pizza pizza;

    public DecorateurPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double calculePrix() {
        return pizza.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return pizza.afficheDescription();
    }
}
