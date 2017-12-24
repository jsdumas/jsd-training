package io.jsd.training.codingame.labyrinth;

import java.util.List;

public class KirkSituation {
	
	private final Jetpack jetpack;
	private final PositionState positionState;
	private final Scanner scanner;
	

	public KirkSituation() {
		this.jetpack = new Jetpack();
		this.positionState = new PositionState();
		this.scanner = new Scanner();
	}

	public Cell geCurrenttPosition() {
		return positionState.getCurrentPosition();
	}

	public int getX() {
		return positionState.getCurrentX();
	}

	public int getY() {
		return positionState.getCurrentY();
	}
	
	public CellType getCellTypeOfCurrentPosition() {
		return positionState.getCurrentCellType();
	}

	public int getJetPackEnergy() {
		return jetpack.getEnergy();
	}

	public void energyDecrease() {
		jetpack.energyDecrease();
	}

	public void newPosition(Cell position) {
		positionState.setPosition(position);
	}

	public List<Vertex> scanLabyrinth(Labyrinth labyrinth) {
		return scanner.scanLabyrinth(positionState.getCurrentPosition(), labyrinth);
	}

	

}
