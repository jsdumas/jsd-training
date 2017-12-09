package io.jsd.training.java.designpatterns.chapitres.chap5.compositevisitorstrategy;

public class Strategie2 implements
		StrategieVisiteur<Strategie2.Resultat> {

	public class Resultat {
		private int nbrFichiers, nbrRepertoires;

		public Resultat(int nbrFichiers, int nbrRepertoires) {
			super();
			this.nbrFichiers = nbrFichiers;
			this.nbrRepertoires = nbrRepertoires;
		}

		public int getNbrFichiers() {
			return nbrFichiers;
		}

		public int getNbrRepertoires() {
			return nbrRepertoires;
		}

	}

	protected int nbrFichiers = 0;
	protected int nbrRepertoires = 0;

    @Override
    public void gere(Fichier fichier) {
        nbrFichiers++;
    }

    @Override
    public void gere(Repertoire repertoire) {
        nbrRepertoires++;
    }

	@Override
	public Resultat getResultat() {
		return new Resultat(nbrFichiers, nbrRepertoires);
	}

}
