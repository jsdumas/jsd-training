package io.jsd.training.codingame.labyrinth;

import java.util.Stack;

public class KirkSituation {

	private final Jetpack jetpack;
	private final PositionState previousPosition;
	private final PositionState currentPosition;
	private LabyrinthMap labyrinthMap;
	private Stack<Direction> path;

	public KirkSituation() {
		this.jetpack = new Jetpack();
		this.previousPosition = new PositionState();
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
		previousPosition.setPosition(currentPosition.getCell());
		currentPosition.setPosition(position);
	}

	public boolean isCommandRoomPositionKnown() {
		return labyrinthMap.isCommandRoomPositionKnown();
	}

	public LabyrinthMap getLabyrinthMap() {
		return labyrinthMap;
	}

	public int getSizeOfLabyrinthMap() {
		return labyrinthMap.getSize();
	}

	public boolean isKirkGetInCommandRoom() {
		if (currentPosition.getCellType().equals(CellType.COMMAND_ROOM)) {
			return true;
		}
		return false;
	}

	public Cell getCommandRoom() {
		return labyrinthMap.getCommandRoom();
	}

	public Cell getStartCell() {
		return labyrinthMap.getStartCell();
	}

	public Cell getPreviousCell() {
		return previousPosition.getCell();
	}

	public void setCommandRoom(Cell cell) {
		labyrinthMap.setCommandRoom(cell);
	}

	public boolean areAllCellsScanned() {
		return labyrinthMap.areAllCellsScanned();
	}

	public void setLabyrinthMap(LabyrinthMap labyrinthMap) {
		this.labyrinthMap = labyrinthMap;
	}

	public void setPath(Stack<Direction> path) {
		this.path = path;
	}

	public Stack<Direction> getPath() {
		return path;
	}

}
