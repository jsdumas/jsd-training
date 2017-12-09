package io.jsd.training.designpatterns.chapitres.chap4.compositeplusieursparents;

import java.util.Set;

public class Test {

    public static void afficheEnsembleNoeuds(
            Set<? extends Noeud> ensembleNoeuds) {
        for (Noeud element : ensembleNoeuds)
            element.afficheNom();
    }

    public static void main(String[] args) {
        Noeud tempInterface = new Interface("I7");
        tempInterface.ajouteEnfant(new Classe("C4"));
        Noeud tempInterface2 = new Interface("I5");
        tempInterface2.ajouteEnfant(new Classe("C2"));
        tempInterface2.ajouteEnfant(tempInterface);
        Noeud tempInterface3 = new Interface("I6");
        tempInterface3.ajouteEnfant(new Classe("C3"));
        tempInterface3.ajouteEnfant(tempInterface);
        tempInterface = new Interface("I4");
        tempInterface.ajouteEnfant(new Classe("C1"));
        tempInterface.ajouteEnfant(tempInterface2);
        tempInterface.ajouteEnfant(tempInterface3);
        Noeud interfaceI4 = tempInterface;
        Classe classe5 = new Classe("C5");
        tempInterface2 = new Interface("I2");
        tempInterface2.ajouteEnfant(interfaceI4);
        tempInterface2.ajouteEnfant(classe5);
        tempInterface3 = new Interface("I3");
        tempInterface3.ajouteEnfant(interfaceI4);
        tempInterface2.ajouteEnfant(classe5);
        tempInterface = new Interface("I1");
        Noeud interfaceI1 = tempInterface;
        tempInterface.ajouteEnfant(tempInterface2);
        tempInterface.ajouteEnfant(tempInterface3);

        Set<Interface> interfacesParents = interfaceI4
                .toutesLesInterfacesParents();
        System.out
                .println("Ensemble des interfaces parents de I4");
        afficheEnsembleNoeuds(interfacesParents);
        Set<Noeud> enfants = interfaceI4.tousLesEnfants();
        System.out.println("Ensemble des enfants de I4");
        afficheEnsembleNoeuds(enfants);
        enfants = interfaceI1.tousLesEnfants();
        System.out.println("Ensemble des enfants de I1");
        afficheEnsembleNoeuds(enfants);
    }

}
