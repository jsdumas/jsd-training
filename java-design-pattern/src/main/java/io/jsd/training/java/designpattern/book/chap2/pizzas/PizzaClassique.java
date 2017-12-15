package io.jsd.training.java.designpattern.book.chap2.pizzas;
public class PizzaClassique extends Pizza {
    public PizzaClassique() {
        description = "Pizza classique";
    }

    @Override
    public double calculePrix() {
        return 2.99;
    }
}
