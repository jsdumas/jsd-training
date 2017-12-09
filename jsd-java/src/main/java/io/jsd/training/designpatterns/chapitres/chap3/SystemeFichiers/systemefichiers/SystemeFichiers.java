package io.jsd.training.designpatterns.chapitres.chap3.SystemeFichiers.systemefichiers;
public class SystemeFichiers implements Iterable<Dossier> {
    protected Dossier[] dossiers = new Dossier[100];
    protected int index = 0;
    private String nom;

    public SystemeFichiers(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void ajouteDossier(String nom, int nbFichiers,
            double taille) {
        Dossier dossier = new Dossier(nom, nbFichiers,
                taille);
        dossiers[index] = dossier;
        index++;
    }

    public IterateurSystemeFichiers iterator() {
        return new IterateurSystemeFichiers(dossiers);
    }

}