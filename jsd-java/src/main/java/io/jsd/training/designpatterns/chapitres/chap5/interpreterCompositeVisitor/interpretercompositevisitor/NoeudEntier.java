package io.jsd.training.designpatterns.chapitres.chap5.interpreterCompositeVisitor.interpretercompositevisitor;

public class NoeudEntier implements Noeud {
	
	protected int valeur;

	public NoeudEntier(int valeur) {
		super();
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	@Override
	public void ajouteSousNoeudGauche(Noeud sousNoeud) {
	}

	@Override
	public void ajouteSousNoeudDroit(Noeud sousNoeud) {
	}

	@Override
	public Noeud getSousNoeudDroit() {
		return null;
	}

	@Override
	public Noeud getSousNoeudGauche() {
		return null;
	}

	@Override
	public int accepteVisiteurExpression(VisiteurExpression visiteurExpression) {
		return visiteurExpression.visite(this);
	}

}
