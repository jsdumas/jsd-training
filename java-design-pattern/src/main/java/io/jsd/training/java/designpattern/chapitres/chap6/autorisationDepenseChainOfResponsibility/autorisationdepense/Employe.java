package io.jsd.training.java.designpattern.chapitres.chap6.autorisationDepenseChainOfResponsibility.autorisationdepense;

import java.util.ArrayList;
import java.util.List;

public class Employe {
    protected int plafondDepense;
    protected String nom;
    protected List<Employe> decideurs = new ArrayList<Employe>();

    public Employe(int plafondDepense, String nom) {
        super();
        this.plafondDepense = plafondDepense;
        this.nom = nom;
    }

    public int getPlafondDepense() {
        return plafondDepense;
    }

    public void setPlafondDepense(int plafondDepense) {
        this.plafondDepense = plafondDepense;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajouteDecideur(Employe decideur) {
        decideurs.add(decideur);
    }

    public void retireDecideur(Employe decideur) {
        decideurs.remove(decideur);
    }

    protected boolean accordImmediatDepense(int montant) {
        if (montant <= plafondDepense) {
            System.out
                    .println(nom
                            + " a donné son accord pour une dépense de "
                            + montant);
            return true;
        }
        return false;
    }

    public boolean accordDepense(int montant) {
        if (this.accordImmediatDepense(montant))
            return true;
        for (Employe decideur : decideurs)
            if (decideur.accordImmediatDepense(montant))
                return true;
        return false;
    }

}
