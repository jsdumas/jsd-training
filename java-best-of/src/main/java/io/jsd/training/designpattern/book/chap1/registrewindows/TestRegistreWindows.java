package io.jsd.training.designpattern.book.chap1.registrewindows;
public class TestRegistreWindows {

    public static void main(String[] args) {
        RegistreWindows leRegistreWindows = RegistreWindows
                .Instance();
        System.out
                .println("Nom de la première instance du registre: "
                        + leRegistreWindows.getNom());
        leRegistreWindows.setNom("Registre Windows");
        System.out
                .println("Nouveau nom de la première instance du registre: "
                        + leRegistreWindows.getNom());
        RegistreWindows leRegistreWindows2 = RegistreWindows
                .Instance();
        System.out
                .println("Nom de la seconde instance du registre: "
                        + leRegistreWindows2.getNom());
    }
}
