package io.jsd.training.java.designpattern.chapitres.chap5.proxyPrototype.proxyprototype;

public class Test {

    public static void main(String[] args) {
        ProxyCalculatrice calculatrice1 = new ProxyCalculatrice();
        try {
            calculatrice1.ajoute("clef1", 12);
            ProxyCalculatrice calculatrice2 = calculatrice1
                    .clone();
            calculatrice2.ajoute("clef1", 25);

            System.out.println("valeur de la première calculatrice : "+calculatrice1
                    .getValeur("clef1"));
            System.out.println("valeur de la seconde calculatrice : "+calculatrice2
                    .getValeur("clef1"));
        } catch (ProxyCalculatrice.ExceptionProxy e) {
            System.out.println("Exception Proxy levée");
        } catch (CloneNotSupportedException e) {
            System.out.println("Erreur de duplication "
                    + e.getMessage());
        }
    }

}
