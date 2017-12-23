package io.jsd.training.codingame.labyrinth;

public class Kirk {

	private final KirkSituation kirkSituation;

	public Kirk() {
		this.kirkSituation = new KirkSituation();
	}

	public Direction mouve(Direction direction) {
		kirkSituation.energyDecrease();
		return direction;
	}

	public Position getPosition() {
		return kirkSituation.getPosition();
	}

	public int getX() {
		return kirkSituation.getX();
	}

	public int getY() {
		return kirkSituation.getY();
	}

	public int getJetPackEnergy() {
		return kirkSituation.getJetPackEnergy();
	}

	public CellType getCellTypeOfCurrentPosition() {
		return kirkSituation.getCellTypeOfCurrentPosition();
	}

	public KirkSituation getKirksituation() {
		return kirkSituation;
	}

}
