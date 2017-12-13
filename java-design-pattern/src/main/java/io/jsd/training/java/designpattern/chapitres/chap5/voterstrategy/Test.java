package io.jsd.training.java.designpattern.chapitres.chap5.voterstrategy;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Point unPoint;
        String reponse;
        System.out
                .print("1- mode de scrutin majoritaire 2- mode de scrutin à l'unanimité ");
        reponse = reader.next();
        if (reponse.equals("1")) {
            unPoint = new Point(10, 15,
                    new StrategieMajoritaire());
        } else {
            unPoint = new Point(10, 15,
                    new StrategieUnanimite());
        }
        unPoint.enregistreElecteur(
                new ElecteurCoordonnee("x", 10, 20));
        unPoint.enregistreElecteur(
                new ElecteurCoordonnee("y", 12, 18));
        unPoint.enregistreElecteur(
                new ElecteurCoordonnee("y", 13, 20));
        unPoint.enregistreElecteur(
                new ElecteurCoordonnee("y", 13, 20));
        do {
            System.out
                    .print("1- modifier X 2- modifier Y 3- sortir : ");
            reponse = reader.next();
            if (reponse.equals("1")) {
                System.out
                        .print("Entrez la coordonnée X : ");
                Integer x = reader.nextInt();
                unPoint.setX(x);
            } else if (reponse.equals("2")) {
                System.out
                        .print("Entrez la coordonnée Y : ");
                Integer y = reader.nextInt();
                unPoint.setY(y);
            }
            System.out.println("X : " + unPoint.getX()
                    + " Y : " + unPoint.getY());
        } while (!(reponse.equals("3")));
    }

}
