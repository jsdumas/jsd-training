package io.jsd.training.java.designpattern.chapitres.chap6.autorisationDepenseChainOfResponsibility.autorisationdepensechainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Employe> employes = new HashMap<String, Employe>();
        Employe unEmploye;
        unEmploye = new Employe(10000, "Jacques", null);
        employes.put("Jacques", unEmploye);
        unEmploye = new Employe(5000, "Pierre", employes
                .get("Jacques"));
        employes.put("Pierre", unEmploye);
        unEmploye = new Employe(1000, "Paul", employes
                .get("Pierre"));
        employes.put("Paul", unEmploye);
        unEmploye = new Employe(1500, "Marie", employes
                .get("Pierre"));
        employes.put("Marie", unEmploye);
        unEmploye = new Employe(8000, "Jean", employes
                .get("Jacques"));
        employes.put("Jean", unEmploye);
        unEmploye = new Employe(2000, "Alain", employes
                .get("Jean"));
        employes.put("Alain", unEmploye);

        if (!employes.get("Paul").accordDepense(1200))
            System.out
                    .println("Dépense de 1200 auprès de Paul refusée");

        if (!employes.get("Paul").accordDepense(5200))
            System.out
                    .println("Dépense de 5200 auprès de Paul refusée");

        if (!employes.get("Paul").accordDepense(11200))
            System.out
                    .println("Dépense de 11200 auprès de Paul refusée");

        if (!employes.get("Marie").accordDepense(1200))
            System.out
                    .println("Dépense de 1200 auprès de Marie refusée");

        if (!employes.get("Alain").accordDepense(1700))
            System.out
                    .println("Dépense de 1700 auprès de Alain refusée");

    }

}
