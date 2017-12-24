package io.jsd.training.chapitres.chap7.composite;

public class Fichier implements Noeud {

	@Override
	public long nombreFichiers() {
		return 1; // y compris le fichier lui-meme
	}

	@Override
	public long nombreRepertoires() {
		return 0;
	}
}
