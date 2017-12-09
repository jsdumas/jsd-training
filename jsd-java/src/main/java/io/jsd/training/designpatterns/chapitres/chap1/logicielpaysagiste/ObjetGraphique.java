package io.jsd.training.designpatterns.chapitres.chap1.logicielpaysagiste;
public abstract class ObjetGraphique implements Cloneable {
    protected double coordX;
    protected double coordY;
    protected double coordZ;

    public void setCoordonnees(double x, double y,
            double z) {
        this.coordX = x;
        this.coordY = y;
        this.coordZ = z;
    }

    public ObjetGraphique duplique() {
        ObjetGraphique resultat;
        try {
            resultat = (ObjetGraphique) this.clone();
        } catch (CloneNotSupportedException exception) {
            return null;
        }

        return resultat;
    }

    public abstract void affiche();

}
