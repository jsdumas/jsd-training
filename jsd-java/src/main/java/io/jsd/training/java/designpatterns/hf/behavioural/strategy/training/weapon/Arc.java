package io.jsd.training.java.designpatterns.hf.behavioural.strategy.training.weapon;

import io.jsd.training.java.designpatterns.hf.behavioural.strategy.training.action.Attaquer;

public class Arc implements Attaquer {

	protected int nbVies = 1;

	@Override
	public void attaquer() {
		System.out.println("Attaquer à l'arc");

	}

	@Override
	public int getNbVie() {
		// TODO Auto-generated method stub
		return this.nbVies;
	}

	@Override
	public void setNbVie(int i) {
		this.nbVies = i;

	}

}
