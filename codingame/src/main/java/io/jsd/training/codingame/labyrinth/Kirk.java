package io.jsd.training.codingame.labyrinth;

public class Kirk {

	private final KirkSituation kirkSituation;
	private final Mission findCommadRoom;
	private final Mission getInCommandRoom;
	private final Mission goBackToStartCell;
	private Mission mission;

	public Kirk() {
		this.kirkSituation = new KirkSituation();
		this.findCommadRoom = new FindCommandRoom(this);
		this.getInCommandRoom = new GetInCommandRoom(this);
		this.goBackToStartCell = new GoBackToStartCell(this);
		this.mission = findCommadRoom;
	}

	public Direction mouve(Direction direction) {
		kirkSituation.energyDecrease();
		return direction;
	}

	public Cell getPosition() {
		return kirkSituation.geCurrenttPosition();
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
	
	private void firstMissionFinished() {
		this.mission = getInCommandRoom;
	}

	private void secondMissionFinished(Alarm alarm) {
		alarm.sartCount();
		this.mission = goBackToStartCell;
	}

	public void scanLabyrinth(Labyrinth labyrinth, Alarm alarm) {
		kirkSituation.scanLabyrinth(labyrinth);
		if(knowsCommandRoomPosition()) {
			firstMissionFinished();
		}
		if(isKirkGetInCommandRoom()) {
			secondMissionFinished(alarm);
		}
	}

	private boolean isKirkGetInCommandRoom() {
		if(kirkSituation.isKirkGetInCommandRoom()) {
			return true;
		}
		return false;
	}

	public boolean knowsCommandRoomPosition() {
		if(kirkSituation.isCommandRoomPositionKnown()) {
			return true;
		}
		return false;
	}

	public void newPosition(Cell cell) {
		kirkSituation.newPosition(cell);
	}

	public boolean isFindCommandCellFinished() {
		return findCommadRoom.isMissionSuccessed();
	}

	public int getSizeOfLabyrinthMap() {
		return kirkSituation.getSizeOfLabyrinthMap();
	}

	public LabyrinthMap getLabyrinthMap() {
		return kirkSituation.getLabyrinthMap();
	}

}
