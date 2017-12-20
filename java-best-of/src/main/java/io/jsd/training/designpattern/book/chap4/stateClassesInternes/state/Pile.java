package io.jsd.training.designpattern.book.chap4.stateClassesInternes.state;

public class Pile {
	
    public class ParamEntier {
		public Integer valeur;
	}

	protected int tailleMax;
	protected EtatPile etatVide = new EtatVide(this);
	protected EtatPile etatPlein = new EtatPlein(this);
	protected EtatPile etatNormal = new EtatNormal(this);
	protected EtatPile etatCourant = etatVide;
	protected int contenuPile[] = new int[tailleMax];
	protected int sommet = 0;
	
	public Pile(int tailleMax) {
		this.tailleMax = tailleMax;
		contenuPile = new int[tailleMax];
	}

	public void empile(int valeur) {
		EtatPile nouvelEtat = etatCourant.empile(valeur);
		etatCourant = nouvelEtat; 
	}
	
	public Integer depile() {
		ParamEntier paramValeur = new ParamEntier();
		EtatPile nouvelEtat = etatCourant.depile(paramValeur);
		etatCourant = nouvelEtat; 
		return paramValeur.valeur;
	}

    protected boolean peutEmpiler() {
        return etatCourant.peutEmpiler();
    }

    protected boolean peutDepiler() {
        return etatCourant.peutDepiler();
    }

}


