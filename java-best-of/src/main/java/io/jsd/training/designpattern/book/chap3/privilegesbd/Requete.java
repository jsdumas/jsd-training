package io.jsd.training.designpattern.book.chap3.privilegesbd;
public class Requete {
    protected String utilisateur;
    protected String bd;
    protected String table;
    protected String colonne;
    protected String nouvelleValeur;

    public Requete(String utilisateur, String bd,
            String table, String colonne,
            String nouvelleVal) {
        this.utilisateur = utilisateur;
        this.bd = bd;
        this.table = table;
        this.colonne = colonne;
        this.nouvelleValeur = nouvelleVal;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public String getBD() {
        return bd;
    }

    public String getTable() {
        return table;
    }

    public String getColonne() {
        return colonne;
    }
}
