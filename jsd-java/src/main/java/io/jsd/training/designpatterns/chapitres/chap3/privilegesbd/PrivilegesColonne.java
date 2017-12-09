package io.jsd.training.designpatterns.chapitres.chap3.privilegesbd;
import java.util.*;

public class PrivilegesColonne extends Privileges {
    protected List<PrivilegeUpdateColonne> privileges = new ArrayList<PrivilegeUpdateColonne>();

    public void ajoutePrivilege(
            PrivilegeUpdateColonne privilege) {
        privileges.add(privilege);
    }

    @Override
    public boolean requeteOK(Requete requete) {
        PrivilegeUpdateColonne privilege;
        privilege = new PrivilegeUpdateColonne(requete
                .getUtilisateur(), requete.getBD(),
                requete.getTable(), requete.getColonne());
        for (PrivilegeUpdateColonne priv : privileges) {
            if (privilege.egale(priv)) {
                System.out
                        .println("Requête acceptée, l'utilisateur possède le privilège update sur la colonne");
                return true;
            }
        }
        return false;
    }

}
