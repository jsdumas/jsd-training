package io.jsd.training.codingame.labyrinth;

import java.util.Set;
import java.util.Stack;

public class Kirk {

	private final KirkSituation kirkSituation;
	private final Mission findCommandRoom;
	private final Mission getInCommandRoom;
	private final Mission goBackToStartCell;
	private Mission mission;

	public Kirk() {
		this.kirkSituation = new KirkSituation();
		this.findCommandRoom = new ScanAllCells(this);
		this.getInCommandRoom = new GetInCommandRoom(this);
		this.goBackToStartCell = new GoBackToStartCell(this);
		this.mission = findCommandRoom;
	}

	public Cell getCurrentCell() {
		return kirkSituation.getCurrentCell();
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
		// if (!kirkSituation.isCommandRoomPositionKnown()) {
		MapScanner mapScanner = new MapScanner(labyrinth, getCurrentCell());
		mapScanner.scanLabyrinth();
		LabyrinthMap labyrinthMap = mapScanner.getLabyrinthMap();
		setLabyrinthMap(labyrinthMap);
		// }
		if (kirkSituation.isCommandRoomPositionKnown()) {
			if (getCellTypeOfCurrentPosition().equals(CellType.COMMAND_ROOM)) {
				alarm.sartCount();
				mission = goBackToStartCell;
			} else {
				mission = getInCommandRoom;
			}
		}
		kirkSituation.setPath(mission.throwMission(labyrinth));
	}

	public Stack<Direction> getPath() {
		return kirkSituation.getPath();
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

	public Cell getCommandRoom() {
		return kirkSituation.getCommandRoom();
	}

	public Cell getStartCell() {
		return kirkSituation.getStartCell();
	}

	public void setLabyrinthMap(LabyrinthMap labyrinthMap) {
		kirkSituation.setLabyrinthMap(labyrinthMap);
	}

	public boolean isCommandRoomPositionKnown() {
		return kirkSituation.isCommandRoomPositionKnown();
	}

	public Set<Cell> getUnknownCells() {
		return kirkSituation.getUnknownCells();
	}

}
