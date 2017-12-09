package io.jsd.training.designpatterns.chapitres.chap4.factoryMethodClasseGenerique.factorymethod;

public abstract class Courrier {
    protected Contenu contenu;
    protected String destinataire;

    abstract protected Contenu nouveauContenu();

    public void prepare(String destinataire, String texte) {
        this.destinataire = destinataire;
        contenu = nouveauContenu();
        contenu.encode(texte);
    }

    public void affiche() {
        System.out.println("destinataire : "
                + destinataire);
        System.out.print("contenu : ");
        contenu.affiche();
    }

}
