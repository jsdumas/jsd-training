package io.jsd.training.java.designpatterns.chapitres.chap4.factoryMethodClasseGenerique.factorymethodclassegenerique;

public class Courrier<T extends Contenu> {
    protected Class<T> classeContenu;
    protected T contenu;
    protected String destinataire;

    protected T nouveauContenu() {
        try {
            return classeContenu.newInstance();
        } catch (IllegalAccessException e) {
            return null;
        } catch (InstantiationException e) {
            return null;
        }
    }

    public Courrier(Class<T> classeContenu) {
        this.classeContenu = classeContenu;
    }

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
