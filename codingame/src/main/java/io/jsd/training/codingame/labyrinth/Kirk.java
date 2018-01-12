package io.jsd.training.codingame.labyrinth;

import java.util.Stack;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;
import io.jsd.training.codingame.labyrinth.bean.Labyrinth;
import io.jsd.training.codingame.labyrinth.bean.PositionState;

public class Kirk {

	private final Mission searchCommandRoom;
	private final Mission getInCommandRoom;
	private final Mission goBackToStartCell;
	private final PositionState currentPosition;
	private final LabyrinthMap labyrinthMap;
	private Mission mission;

	public Kirk(LabyrinthMap labyrinthMap) {
		this.labyrinthMap = labyrinthMap;
		this.searchCommandRoom = new SearchCommandRoom(this);
		this.getInCommandRoom = new GetInCommandRoom(this);
		this.goBackToStartCell = new GoBackToStartCell(this);
		this.mission = searchCommandRoom;
		this.currentPosition = new PositionState();
	}

	public Mission getMission() {
		return mission;
	}

	public void throwMission(Labyrinth labyrinth) {
		LabyrinthScanner labyrinthScanner = new LabyrinthScanner(labyrinth, labyrinthMap, getCurrentCell());
		labyrinthScanner.breadthFirstSearch();
		if (labyrinthMap.isCommandRoomPositionKnown()) {
			if (getCellTypeOfCurrentPosition().equals(CellType.COMMAND_ROOM)) {
				mission = goBackToStartCell;
			} else {
				mission = getInCommandRoom;
			}
		}
		labyrinthMap.setPath(mission.throwMission());
	}

	public Stack<Direction> getPath() {
		return labyrinthMap.getPath();
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
