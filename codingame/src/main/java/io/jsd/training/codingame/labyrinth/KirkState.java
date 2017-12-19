package io.jsd.training.codingame.labyrinth;

public class KirkState {
	
	private final Jetpack jetpack;
	private Position position;
	

	public KirkState(Jetpack jetpack) {
		this.jetpack = jetpack;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position=position;
	}
	
	public int getX() {
		return position.getX();
	}

	public int getY() {
		return position.getX();
	}

	public Jetpack getJetpack() {
		return jetpack;
	}

	public int getJetPackEnergy() {
		return jetpack.getEnergy();
	}

	public void energyDecrease() {
		jetpack.energyDecrease();
	}

}
