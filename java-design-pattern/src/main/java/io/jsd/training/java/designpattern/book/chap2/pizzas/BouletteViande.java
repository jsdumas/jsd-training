package io.jsd.training.java.designpattern.book.chap2.pizzas;
public class BouletteViande extends DecorateurPizza {
    public BouletteViande(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 5.10 + super.calculePrix();
    }

    @Override
    public String afficheDescription() {
        return super.afficheDescription()
                + ", Boulettes de viande hachée";
    }
}
