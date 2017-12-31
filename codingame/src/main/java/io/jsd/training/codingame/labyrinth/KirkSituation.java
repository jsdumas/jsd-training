package io.jsd.training.codingame.labyrinth;


public class KirkSituation {
	
	private final Jetpack jetpack;
	private final PositionState previousPosition;
	private final PositionState currentPosition;
	private final LabyrinthMap labyrinthMap;
	

	public KirkSituation() {
		this.jetpack = new Jetpack();
		this.previousPosition = new PositionState();
		this.currentPosition = new PositionState();
		this.labyrinthMap = new LabyrinthMap();
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

	public void scanLabyrinth(Labyrinth labyrinth) {
		MapScanner mapScanner = new MapScanner();
		mapScanner.scanLabyrinth(currentPosition.getCell(), labyrinth, labyrinthMap);
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
		if(currentPosition.getCellType().equals(CellType.COMMAND_ROOM)) {
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

}
