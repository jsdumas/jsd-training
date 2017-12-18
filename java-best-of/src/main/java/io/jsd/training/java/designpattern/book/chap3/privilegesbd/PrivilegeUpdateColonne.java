package io.jsd.training.java.designpattern.book.chap3.privilegesbd;
public class PrivilegeUpdateColonne extends
        PrivilegeUpdate {
    protected String bd;
    protected String table;
    protected String colonne;

    public PrivilegeUpdateColonne(String utilisateur,
            String bd, String table, String colonne) {
        this.utilisateur = utilisateur;
        this.bd = bd;
        this.table = table;
        this.colonne = colonne;
    }

    public Boolean egale(PrivilegeUpdateColonne priv) {
        if (utilisateur == priv.getUtilisateur()
                && bd == priv.getBD()
                && table == priv.getTable()
                && colonne == priv.getColonne())
            return true;
        else
            return false;
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
