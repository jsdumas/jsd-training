package io.jsd.training.java.designpattern.hf.behavioural.strategy.training.weapon;

import io.jsd.training.java.designpattern.hf.behavioural.strategy.training.action.Attaquer;

public class Epee implements Attaquer {

	protected int nbVies = 2;

	@Override
	public void attaquer() {
		System.out.println("Attaque à l'épée");

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
