package io.jsd.training.designpatterns.chapitres.chap2.proxy;
public class TestProxy {

    public static void main(String[] args) {
        BD bd = new BD();
        BaseDonnees bdproxy = new BDProxy(bd);
        bdproxy.executeRequete("********");
        bdproxy.retourneResultat();
    }
}
