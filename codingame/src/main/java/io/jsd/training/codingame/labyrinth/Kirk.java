package io.jsd.training.codingame.labyrinth;

public class Kirk {

	private final KirkState state;

	public Kirk(KirkState state) {
		this.state = state;
	}

	public Direction mouve(Direction direction) {
		state.energyDecrease();
		return direction;
	}

	public Position getPosition() {
		return state.getPosition();
	}

	public int getX() {
		return state.getX();
	}

	public int getY() {
		return state.getX();
	}

	public int getJetPackEnergy() {
		return state.getJetPackEnergy();
	}

}
