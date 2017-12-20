package io.jsd.training.designpattern.book.chap3.privilegesbd;
import java.util.*;

public class PrivilegesGlobaux extends Privileges {
    protected List<PrivilegeUpdateGlobal> privileges = new ArrayList<PrivilegeUpdateGlobal>();

    public void ajoutePrivilege(
            PrivilegeUpdateGlobal privilege) {
        privileges.add(privilege);
    }

    @Override
    public boolean requeteOK(Requete requete) {
        PrivilegeUpdateGlobal privilege;
        privilege = new PrivilegeUpdateGlobal(requete
                .getUtilisateur());
        for (PrivilegeUpdateGlobal priv : privileges) {
            if (privilege.egale(priv)) {
                System.out
                        .println("Requête acceptée, l'utilisateur possède le privilège global");
                return true;
            }
        }
        return false;
    }

}
