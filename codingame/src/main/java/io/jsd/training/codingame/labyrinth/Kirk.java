package io.jsd.training.codingame.labyrinth;

import java.util.Set;
import java.util.Stack;

public class Kirk extends LabyrinthScanner {

	private final KirkSituation kirkSituation;
	private final Mission findCommandRoom;
	private final Mission getInCommandRoom;
	private final Mission goBackToStartCell;
	private final LabyrinthMap labyrinthMap;
	private Mission mission;

	public Kirk() {
		this.findCommandRoom = new ScanAllCells(this);
		this.getInCommandRoom = new GetInCommandRoom(this);
		this.goBackToStartCell = new GoBackToStartCell(this);
		this.mission = findCommandRoom;
		this.kirkSituation = new KirkSituation();
		this.labyrinthMap = new LabyrinthMap();
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

	public KirkSituation getKirksituation() {
		return kirkSituation;
	}

	public Mission getMission() {
		return mission;
	}

	public void throwMission(Labyrinth labyrinth, Alarm alarm) {
		kirkSituation.energyDecrease();
		breadthFirstSearch(labyrinth, labyrinthMap, getCurrentCell());
		if (labyrinthMap.isCommandRoomPositionKnown()) {
			if (kirkSituation.getCellTypeOfCurrentPosition().equals(CellType.COMMAND_ROOM)) {
				alarm.sartCount();
				mission = goBackToStartCell;
			} else {
				mission = getInCommandRoom;
			}
		}
		labyrinthMap.setPath(mission.throwMission(labyrinth));
	}

	public Stack<Direction> getPath() {
		return labyrinthMap.getPath();
	}

	public void newPosition(Cell cell) {
		kirkSituation.newPosition(cell);
	}

	public boolean isCommandRoomPositionKnown() {
		return labyrinthMap.isCommandRoomPositionKnown();
	}

	public Cell getStartCell() {
		return labyrinthMap.getStartCell();
	}

	public Cell getCommandRoom() {
		return labyrinthMap.getCommandRoom();
	}

	public Set<Cell> getUnknownCells() {
		return labyrinthMap.getUnknownCells();
	}

}
