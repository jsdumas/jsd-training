package io.jsd.training.codingame.labyrinth;

public class KirkSituation {

	private final Jetpack jetpack;
	private final PositionState currentPosition;

	public KirkSituation() {
		this.jetpack = new Jetpack();
		this.currentPosition = new PositionState();
	}

	public Cell getCurrentCell() {
		return currentPosition.getCell();
	}

	public int getX() {
		return currentPosition.getCurrentX();
	}

	public int getY() {
		return currentPosition.getCurrentY();
	}

	public CellType getCellTypeOfCurrentPosition() {
		return currentPosition.getCellType();
	}

	public int getJetPackEnergy() {
		return jetpack.getEnergy();
	}

	public void energyDecrease() {
		jetpack.energyDecrease();
	}

	public void newPosition(Cell position) {
		currentPosition.setPosition(position);
	}

	public boolean isKirkGetInCommandRoom() {
		if (currentPosition.getCellType().equals(CellType.COMMAND_ROOM)) {
			return true;
		}
		return false;
	}

}
