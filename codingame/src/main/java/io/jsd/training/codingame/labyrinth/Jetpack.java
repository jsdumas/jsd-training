package io.jsd.training.codingame.labyrinth;

public class Jetpack {
	
	private int energy;
	
	public Jetpack() {
		this.energy=1200;
	}

	public int getEnergy() {
		return energy;
	}

	public void energyDecrease() {
		energy--;
	}

}
