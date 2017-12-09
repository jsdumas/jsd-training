package io.jsd.training.java.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory;

import io.jsd.training.java.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique.FabriqueGraphique3D;
import io.jsd.training.java.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.formesgraphiques.Triangle;

public class Test {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new FabriqueGraphique3D(10), 10, 10, 20, 20, 30, 30);
        triangle.dessine();
    }

}
