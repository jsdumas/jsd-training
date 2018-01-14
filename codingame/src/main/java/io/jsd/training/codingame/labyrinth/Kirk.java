package io.jsd.training.codingame.labyrinth;

import java.util.Stack;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;
import io.jsd.training.codingame.labyrinth.bean.Labyrinth;

public class Kirk {

	private final Mission searchCommandRoom;
	private final Mission getInCommandRoom;
	private final Mission goBackToStartCell;
	private final LabyrinthMap labyrinthMap;
	private Mission mission;

	public Kirk(LabyrinthMap labyrinthMap) {
		this.labyrinthMap = labyrinthMap;
		this.searchCommandRoom = new SearchCommandRoom(this.labyrinthMap);
		this.getInCommandRoom = new GetInCommandRoom(this.labyrinthMap);
		this.goBackToStartCell = new GoBackToStartCell(this.labyrinthMap);
		this.mission = searchCommandRoom;
	}

	public Mission getMission() {
		return mission;
	}

	public void throwMission(Labyrinth labyrinth) {
		LabyrinthScanner labyrinthScanner = new LabyrinthScanner(labyrinth, labyrinthMap);
		labyrinthScanner.breadthFirstSearch();
		if (labyrinthMap.isCommandRoomPositionKnown()) {
			if (labyrinthMap.getCellTypeOfCurrentPosition().equals(CellType.COMMAND_ROOM)) {
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

	public boolean isKirkGetInCommandRoom() {
		if (labyrinthMap.getCellTypeOfCurrentPosition().equals(CellType.COMMAND_ROOM)) {
			return true;
		}
		return false;
	}

}
