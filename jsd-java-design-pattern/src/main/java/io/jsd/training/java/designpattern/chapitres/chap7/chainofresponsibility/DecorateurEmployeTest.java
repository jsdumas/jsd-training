package io.jsd.training.java.designpattern.chapitres.chap7.chainofresponsibility;

import static org.junit.Assert.assertTrue;

public class DecorateurEmployeTest
        extends Employe {
    protected Employe employeReel;
    protected Courrier.Categorie categorieCourrier;

    public DecorateurEmployeTest(Employe employeReel,
            Courrier.Categorie categorieCourrier) {
        super(null);
        this.employeReel = employeReel;
        this.categorieCourrier = categorieCourrier;
    }
    
    @Override
    public Employe getEmployeSuivant() {
        return employeReel.getEmployeSuivant();
    }

    @Override
    public void setEmployeSuivant(Employe employeSuivant) {
        employeReel.setEmployeSuivant(employeSuivant);
    }


    @Override
    protected boolean accepteCourrier(Courrier courrier) {
        boolean resultat = employeReel
                .accepteCourrier(courrier);
        assertTrue(resultat == (courrier.getCategorie() == categorieCourrier));
        return resultat;
    }

    @Override
    public void gereCourrier(Courrier courrier) {
        if ((!accepteCourrier(courrier))
                && (employeReel.getEmployeSuivant() != null))
            employeReel.getEmployeSuivant()
                    .gereCourrier(courrier);
    }

}
