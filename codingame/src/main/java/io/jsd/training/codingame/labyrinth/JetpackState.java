package io.jsd.training.codingame.labyrinth;

public class JetpackState {
	
	private final Jetpack jetpack;
	
	public JetpackState() {
		this.jetpack = new Jetpack();
	}

	public int getEnergy() {
		return jetpack.getEnergy();
	}

	public void energyDecrease() {
		jetpack.energyDecrease();
	}

}
