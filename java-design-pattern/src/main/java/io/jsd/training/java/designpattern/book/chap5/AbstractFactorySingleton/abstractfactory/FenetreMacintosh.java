package io.jsd.training.java.designpattern.book.chap5.AbstractFactorySingleton.abstractfactory;

public class FenetreMacintosh implements Fenetre {
    protected String titre;

    public FenetreMacintosh(String titre) {
        super();
        this.titre = titre;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    @Override
    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public void affiche() {
        System.out.println("Fenetre Macintosh " + titre);
    }

}
