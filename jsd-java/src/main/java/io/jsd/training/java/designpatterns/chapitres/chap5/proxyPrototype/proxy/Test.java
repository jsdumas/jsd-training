package io.jsd.training.java.designpatterns.chapitres.chap5.proxyPrototype.proxy;

public class Test {

    public static void main(String[] args) {
        ProxyCalculatrice calculatrice1 = new ProxyCalculatrice();
        try {
            calculatrice1.ajoute("clef1", 12);

            System.out.println(calculatrice1
                    .getValeur("clef1"));
        } catch (ProxyCalculatrice.ExceptionProxy e) {
            System.out.println("Exception Proxy levée");
        }
    }

}
