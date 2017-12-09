package io.jsd.training.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.formesgraphiques;

import io.jsd.training.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique.FabriqueGraphique;

public class Ligne extends FormeGraphiquePlane {

    public Ligne(FabriqueGraphique fabriquePoint, int x0,
            int y0, int x1, int y1) {
        super(fabriquePoint);
        ajoutePoint(x0, y0);
        ajoutePoint(x1, y1);
    }

    @Override
    public void dessine() {
        System.out.println("ligne de "
                + points.get(0).getX() + ","
                + points.get(0).getY() + " à "
                + points.get(1).getX() + ","
                + points.get(1).getY());
    }

}
