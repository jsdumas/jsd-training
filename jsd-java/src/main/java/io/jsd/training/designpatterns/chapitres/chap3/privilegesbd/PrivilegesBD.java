package io.jsd.training.designpatterns.chapitres.chap3.privilegesbd;
import java.util.*;

public class PrivilegesBD extends Privileges {
    protected List<PrivilegeUpdateBD> privileges = new ArrayList<PrivilegeUpdateBD>();

    public void ajoutePrivilege(
            PrivilegeUpdateBD privilege) {
        privileges.add(privilege);
    }

    @Override
    public boolean requeteOK(Requete requete) {
        PrivilegeUpdateBD privilege;
        privilege = new PrivilegeUpdateBD(requete
                .getUtilisateur(), requete.getBD());
        for (PrivilegeUpdateBD priv : privileges) {
            if (privilege.egale(priv)) {
                System.out
                        .println("Requête acceptée, l'utilisateur possède le privilège update sur la base");
                return true;
            }
        }
        return false;
    }
}
