package io.jsd.training.designpattern.book.chap6.autorisationDepenseChainOfResponsibility.autorisationdepense;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Employe> employes = new HashMap<String, Employe>();
        Employe unEmploye;
        unEmploye = new Employe(10000, "Jacques");
        employes.put("Jacques", unEmploye);
        unEmploye = new Employe(5000, "Pierre");
        unEmploye.ajouteDecideur(employes.get("Jacques"));
        employes.put("Pierre", unEmploye);
        unEmploye = new Employe(1000, "Paul");
        unEmploye.ajouteDecideur(employes.get("Pierre"));
        unEmploye.ajouteDecideur(employes.get("Jacques"));
        employes.put("Paul", unEmploye);
        unEmploye = new Employe(1500, "Marie");
        unEmploye.ajouteDecideur(employes.get("Pierre"));
        unEmploye.ajouteDecideur(employes.get("Jacques"));
        employes.put("Marie", unEmploye);
        unEmploye = new Employe(8000, "Jean");
        unEmploye.ajouteDecideur(employes.get("Jacques"));
        employes.put("Jean", unEmploye);
        unEmploye = new Employe(2000, "Alain");
        unEmploye.ajouteDecideur(employes.get("Jean"));
        unEmploye.ajouteDecideur(employes.get("Jacques"));
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
