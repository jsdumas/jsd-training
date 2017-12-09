package io.jsd.training.algorithms.chapitres.chap6.ensembles;

public class Ensemble implements InterfaceEnsemble {
	int tailleEnsemble;
	int[] ensemble;

	public Ensemble(int tailleMaximaleEnsemble) {
		tailleEnsemble = 0;
		ensemble = new int[tailleMaximaleEnsemble];
	}

	@Override
	public boolean insere(int valeur) {
		int j = 0;
		while ((j < tailleEnsemble) && (ensemble[j] != valeur))
			j++;
		// insertion de la valeur si elle n'a pas ete trouvee
		if (j == tailleEnsemble) {
			if (tailleEnsemble == ensemble.length)
				return false;
			ensemble[tailleEnsemble] = valeur;
			tailleEnsemble++;
		}
		return true;
	}

	@Override
	public boolean supprime(int valeur) {
		int i = 0;
		while ((i < tailleEnsemble) && (ensemble[i] != valeur))
			i++;
		if (i < tailleEnsemble) {
			tailleEnsemble--;
			for (int j = i; j < tailleEnsemble; j++)
				ensemble[j] = ensemble[j + 1];
			return true;
		}
		return false;
	}

	@Override
	public void affiche() {
		for (int i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}
