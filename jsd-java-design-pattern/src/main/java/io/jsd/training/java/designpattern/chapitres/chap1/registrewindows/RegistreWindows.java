package io.jsd.training.java.designpattern.chapitres.chap1.registrewindows;
public class RegistreWindows {
    protected String nom = "Regedit";
    private static RegistreWindows instance = null;

    private RegistreWindows() {
    }

    public static RegistreWindows Instance() {
        if (instance == null)
            instance = new RegistreWindows();
        return instance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}