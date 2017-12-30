package io.jsd.training.codingame.labyrinth;

public class Kirk {

	private final KirkSituation kirkSituation;
	private final Mission findCommandRoom;
	private final Mission getInCommandRoom;
	private final Mission goBackToStartCell;
	private Mission mission;

	public Kirk() {
		this.kirkSituation = new KirkSituation();
		this.findCommandRoom = new FindCommandRoom(this);
		this.getInCommandRoom = new GetInCommandRoom(this);
		this.goBackToStartCell = new GoBackToStartCell(this);
		this.mission = findCommandRoom;
	}

	public Cell getPosition() {
		return kirkSituation.getCurrentPosition();
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

	public Mission getMission() {
		return mission;
	}

	public void throwMission(Labyrinth labyrinth, Alarm alarm) {
		kirkSituation.energyDecrease();
		
		if(knowsCommandRoomPosition()) {
			mission = getInCommandRoom;
		}
		
		if(getCellTypeOfCurrentPosition().equals(CellType.COMMAND_ROOM)) {
			alarm.sartCount();
			mission = goBackToStartCell;
		}
		
		mission.throwMission(labyrinth);
	}

	public Direction getDirection() {
		return mission.getDirection();
	}

	public boolean knowsCommandRoomPosition() {
		if (kirkSituation.isCommandRoomPositionKnown()) {
			return true;
		}
		return false;
	}

	public void newPosition(Cell cell) {
		kirkSituation.newPosition(cell);
	}

	public int getSizeOfLabyrinthMap() {
		return kirkSituation.getSizeOfLabyrinthMap();
	}

	public LabyrinthMap getLabyrinthMap() {
		return kirkSituation.getLabyrinthMap();
	}

	public void scanLabyrinth(Labyrinth labyrinth) {
		kirkSituation.scanLabyrinth(labyrinth);
	}

	public Cell getCommandRoom() {
		return kirkSituation.getCommandRoom();
	}

	public Cell getStartCell() {
		return kirkSituation.getStartCell();
	}

}
