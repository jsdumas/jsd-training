package io.jsd.training.java.designpattern.book.chap5.compositevisitorgraphe;

import java.util.ArrayList;
import java.util.List;

public class VisiteurChercheNom extends
        VisiteurGraphe<List<Noeud>> {
	protected String nomCherche;

	public VisiteurChercheNom(String nomCherche) {
		super();
		resultat = new ArrayList<Noeud>();
		this.nomCherche = nomCherche;
	}

	@Override
	protected void gereVisite(Compose compose) {
		if (compose.getNom().indexOf(nomCherche) != -1)
			resultat.add(compose);
	}

	@Override
	protected void gereVisite(Feuille feuille) {
		if (feuille.getNom().indexOf(nomCherche) != -1)
			resultat.add(feuille);
	}	
	
}
