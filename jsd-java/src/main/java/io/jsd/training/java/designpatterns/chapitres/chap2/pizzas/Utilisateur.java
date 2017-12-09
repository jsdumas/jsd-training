package io.jsd.training.java.designpatterns.chapitres.chap2.pizzas;
public class Utilisateur {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaPateFine();
        pizza1 = new BouletteViande(pizza1);
        pizza1 = new Fromage(pizza1);
        pizza1 = new OliveNoire(pizza1);
        pizza1 = new Oignon(pizza1);
        System.out.println("Première pizza : "
                + pizza1.afficheDescription()
                + "\nTarif: " + pizza1.calculePrix());
        Pizza pizza2 = new PizzaClassique();
        pizza2 = new Jambon(pizza2);
        pizza2 = new Fromage(pizza2);
        pizza2 = new Champignon(pizza2);
        System.out.println("Seconde pizza : "
                + pizza2.afficheDescription()
                + "\nTarif: " + pizza2.calculePrix());
    }
}
