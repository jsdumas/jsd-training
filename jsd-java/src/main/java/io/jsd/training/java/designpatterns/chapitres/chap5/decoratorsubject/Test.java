package io.jsd.training.java.designpatterns.chapitres.chap5.decoratorsubject;

public class Test {

    public static void main(String[] args) {
        PointSujet unPoint = new PointSujet(
                new Point(10, 10));
        unPoint.ajouteObservateur(
                new ObservateurSimple());
        unPoint.setX(15);
        unPoint.setY(20);
    }

}
