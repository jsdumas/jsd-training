package io.jsd.training.designpattern.book.chap4.stateClassesInternes.stateclassesinternes;

public class Pile {

    protected int tailleMax;
    protected EtatPile etatVide = new EtatVide();
    protected EtatPile etatPlein = new EtatPlein();
    protected EtatPile etatNormal = new EtatNormal();
    protected EtatPile etatCourant = etatVide;
    protected int[] contenuPile;
    protected int sommet = 0;

    public Pile(int tailleMax) {
        this.tailleMax = tailleMax;
        contenuPile = new int[tailleMax];
    }

    public void empile(int valeur) {
        etatCourant.empile(valeur);
    }

    public Integer depile() {
        return etatCourant.depile();
    }

    protected interface EtatPile {
        void empile(int valeur);

        Integer depile();

        boolean peutEmpiler();

        boolean peutDepiler();
    }

    protected class EtatNormal implements EtatPile {

        public Integer depile() {
            sommet--;
            if (sommet == 0)
                etatCourant = etatVide;
            return contenuPile[sommet];
        }

        public void empile(int valeur) {
            contenuPile[sommet] = valeur;
            sommet++;
            if (sommet == tailleMax)
                etatCourant = etatPlein;
        }

        public boolean peutEmpiler() {
            return true;
        }

        public boolean peutDepiler() {
            return true;
        }

    }

    protected class EtatPlein implements EtatPile {

        public Integer depile() {
            sommet--;
            etatCourant = etatNormal;
            return contenuPile[sommet];
        }

        public void empile(int valeur) {
        }

        public boolean peutEmpiler() {
            return false;
        }

        public boolean peutDepiler() {
            return true;
        }

    }

    protected class EtatVide implements EtatPile {

        public Integer depile() {
            return null;
        }

        public void empile(int valeur) {
            contenuPile[sommet] = valeur;
            sommet++;
            etatCourant = etatNormal;
        }

        public boolean peutEmpiler() {
            return true;
        }

        public boolean peutDepiler() {
            return false;
        }

    }

}
