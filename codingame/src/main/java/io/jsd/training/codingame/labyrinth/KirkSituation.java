package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;

public class KirkSituation {
	
	private final Jetpack jetpack;
	private final PositionState currentPosition;
	private final Scanner scanner;
	private LabyrinthMap labyrinthMap;
	

	public KirkSituation() {
		this.jetpack = new Jetpack();
		this.currentPosition = new PositionState();
		this.scanner = new Scanner();
		this.labyrinthMap = new LabyrinthMap();
	}

	public Cell geCurrenttPosition() {
		return currentPosition.getCurrentPosition();
	}

	public int getX() {
		return currentPosition.getCurrentX();
	}

	public int getY() {
		return currentPosition.getCurrentY();
	}
	
	public CellType getCellTypeOfCurrentPosition() {
		return currentPosition.getCurrentCellType();
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

	public void scanLabyrinth(Labyrinth labyrinth) {
		labyrinthMap = scanner.scanLabyrinth(currentPosition.getCurrentPosition(), labyrinth);
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
		if(currentPosition.getCurrentCellType().equals(COMMAND_ROOM)) {
			return true;
		}
		return false;
	}

	

}
