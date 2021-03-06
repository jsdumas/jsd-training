﻿package io.jsd.training.designpattern.book.chap4.voter.observer;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Point unPoint = new Point(10, 15);
        String reponse;
        unPoint.enregistreObservateur(
                new ObservateurCoordonnee());
        unPoint.enregistreObservateur(
                new ObservateurCoordonnee());
        unPoint.enregistreObservateur(
                new ObservateurCoordonnee());
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
