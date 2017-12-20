package io.jsd.training.designpattern.book.chap5.compositevisitorstrategy;

public class Visiteur<T1 extends StrategieVisiteur<T2>, T2> {
    protected T1 strategieVisiteur = null;

    public Visiteur(Class<T1> classStrategieVisiteur) {
        try {
            strategieVisiteur = classStrategieVisiteur
                    .newInstance();
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) {
        }
    }

    public T2 getResultat() {
        return strategieVisiteur.getResultat();
    }

    public T1 getStrategieVisiteur() {
        return strategieVisiteur;
    }

    public void visite(Fichier fichier) {
        strategieVisiteur.gere(fichier);
    }

    public void visite(Repertoire repertoire) {
        strategieVisiteur.gere(repertoire);
        for (Noeud noeud : repertoire.listeSousNoeuds())
            noeud.accepteVisiteur(this);
    }

}
