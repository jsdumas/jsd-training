package io.jsd.training.java.designpatterns.chapitres.chap2.documentxml;

public class Utilisateur {

	public static void main(String[] args) {
		ElementXML element1 = new ElementXMLSimple("titre");
		element1.setValeur("Guerre et Paix");
		ElementXML element2 = new ElementXMLSimple("auteur");
		element2.setValeur("Léon Tolstoï");
		ElementXML element3 = new ElementXMLSimple("nombrepages");
		element3.setValeur("1572");
		ElementXML livre1 = new ElementXMLCompose("livre");
		livre1.ajouteEnfant(element1);
		livre1.ajouteEnfant(element2);
		livre1.ajouteEnfant(element3);
		ElementXML element4 = new ElementXMLSimple("titre");
		element4.setValeur("La Dame aux camélias");
		ElementXML element5 = new ElementXMLSimple("auteur");
		element5.setValeur("Alexandre Dumas");
		ElementXML element6 = new ElementXMLSimple("editeur");
		element6.setValeur("Lebègue");
		ElementXML element7 = new ElementXMLSimple("dateparution");
		element7.setValeur("1848");
		ElementXML element8 = new ElementXMLCompose("publication");
		element8.ajouteEnfant(element6);
		element8.ajouteEnfant(element7);
		ElementXML livre2 = new ElementXMLCompose("livre");
		livre2.ajouteEnfant(element4);
		livre2.ajouteEnfant(element5);
		livre2.ajouteEnfant(element8);
		ElementXML livres = new ElementXMLCompose("livres");
		livres.ajouteEnfant(livre1);
		livres.ajouteEnfant(livre2);
		Element livre1adaptateur = new ElementAdapter((ElementXMLCompose) livre1);
		int nb = livre1adaptateur.getNombreEnfants();
		System.out.println(nb);
		ElementXML elt = livre1adaptateur.getPremierEnfantAvecTag("auteur");
		System.out.println(elt.getValeur());
	}
}
