package io.jsd.training.java.designpattern.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.formesgraphiques;

import io.jsd.training.java.designpattern.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique.FabriqueGraphique;


public class Triangle extends FormeGraphiquePlane {

    public Triangle(FabriqueGraphique fabriquePoint, int x0, int y0, int x1, int y1, int x2, int y2) {
        super(fabriquePoint);
        ajoutePoint(x0, y0);
        ajoutePoint(x1, y1);
        ajoutePoint(x2, y2);
    }

    @Override
    public void dessine() {
        System.out
                .println("triangle dont les sommets sont : ");
        for (int i = 0; i < 3; i++)
            System.out.println("Sommet (" + (i + 1)
                    + ") = " + points.get(i).getX() + ","
                    + points.get(i).getY());
    }

}
