package io.jsd.training.java.designpattern.book.chap3.privilegesbd;
public class PrivilegeUpdateBD extends PrivilegeUpdate {
    protected String bd;

    public PrivilegeUpdateBD(String utilisateur, String bd) {
        this.utilisateur = utilisateur;
        this.bd = bd;
    }

    public Boolean egale(PrivilegeUpdateBD priv) {
        if (utilisateur == priv.getUtilisateur()
                && bd == priv.getBD())
            return true;
        else
            return false;
    }

    public String getBD() {
        return bd;
    }
}
