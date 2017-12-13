package io.jsd.training.java.designpattern.chapitres.chap3.privilegesbd;
public class Utilisateur {

    public static void main(String[] args) {
        PrivilegesGlobaux privilegesGlobaux = new PrivilegesGlobaux();
        PrivilegesBD privilegesBD = new PrivilegesBD();
        PrivilegesTable privilegesTable = new PrivilegesTable();
        PrivilegesColonne privilegesColonne = new PrivilegesColonne();
        privilegesGlobaux.setSuivant(privilegesBD);
        privilegesBD.setSuivant(privilegesTable);
        privilegesTable.setSuivant(privilegesColonne);
        PrivilegeUpdateGlobal privilege1 = new PrivilegeUpdateGlobal(
                "Administrateur");
        privilegesGlobaux.ajoutePrivilege(privilege1);
        PrivilegeUpdateBD privilege2 = new PrivilegeUpdateBD(
                "Chef", "Comptes");
        privilegesBD.ajoutePrivilege(privilege2);
        PrivilegeUpdateColonne privilege3 = new PrivilegeUpdateColonne(
                "Client", "Comptes", "Clients", "Adresse");
        privilegesColonne.ajoutePrivilege(privilege3);

        Requete requete1 = new Requete("Administrateur",
                "Comptes", "Clients", "Solde", "19300.45");
        privilegesGlobaux.accepteRequete(requete1);
        Requete requete2 = new Requete("Chef", "Gestion",
                "Clients", "Solvable", "true");
        privilegesGlobaux.accepteRequete(requete2);
        Requete requete3 = new Requete("Client",
                "Comptes", "Clients", "Adresse",
                "18 rue de la paix, Paris");
        privilegesGlobaux.accepteRequete(requete3);
        Requete requete4 = new Requete("Client",
                "Comptes", "Clients", "Solde",
                "1000000.00");
        privilegesGlobaux.accepteRequete(requete4);
    }
}
