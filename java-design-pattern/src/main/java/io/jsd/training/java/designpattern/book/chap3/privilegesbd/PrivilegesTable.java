package io.jsd.training.java.designpattern.book.chap3.privilegesbd;
import java.util.*;

public class PrivilegesTable extends Privileges {
    protected List<PrivilegeUpdateTable> privileges = new ArrayList<PrivilegeUpdateTable>();

    public void ajoutePrivilege(
            PrivilegeUpdateTable privilege) {
        privileges.add(privilege);
    }

    @Override
    public boolean requeteOK(Requete requete) {
        PrivilegeUpdateTable privilege;
        privilege = new PrivilegeUpdateTable(requete
                .getUtilisateur(), requete.getBD(),
                requete.getTable());
        for (PrivilegeUpdateTable priv : privileges) {
            if (privilege.egale(priv)) {
                System.out
                        .println("Requête acceptée, l'utilisateur possède le privilège update sur la table");
                return true;
            }
        }
        return false;
    }
}
