package io.jsd.training.codingame.labyrinth;


public class KirkSituation {
	
	private final Jetpack jetpack;
	private final PositionState currentPosition;
	private final LabyrinthMap labyrinthMap;
	

	public KirkSituation() {
		this.jetpack = new Jetpack();
		this.currentPosition = new PositionState();
		this.labyrinthMap = new LabyrinthMap();
	}

	public Cell getCurrentPosition() {
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
		MapScanner mapScanner = new MapScanner();
		mapScanner.scanLabyrinth(currentPosition.getCurrentPosition(), labyrinth, labyrinthMap);
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
		if(currentPosition.getCurrentCellType().equals(CellType.COMMAND_ROOM)) {
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

}
