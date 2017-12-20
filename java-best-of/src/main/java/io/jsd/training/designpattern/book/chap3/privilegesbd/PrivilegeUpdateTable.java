package io.jsd.training.designpattern.book.chap3.privilegesbd;
public class PrivilegeUpdateTable extends PrivilegeUpdate {
    protected String bd;
    protected String table;

    public PrivilegeUpdateTable(String utilisateur,
            String bd, String table) {
        this.utilisateur = utilisateur;
        this.bd = bd;
        this.table = table;
    }

    public Boolean egale(PrivilegeUpdateTable priv) {
        if (utilisateur == priv.getUtilisateur()
                && bd == priv.getBD()
                && table == priv.getTable())
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
}
