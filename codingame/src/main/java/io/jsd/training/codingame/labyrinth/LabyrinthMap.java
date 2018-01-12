package io.jsd.training.codingame.labyrinth;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;

public class LabyrinthMap {

	private final int rows;
	private final int columns;
	private final Map<Integer, Cell> cellsMap;
	private Cell startCell;
	private Cell commandRoom;
	private Stack<Direction> path;

	public LabyrinthMap(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.cellsMap = new HashMap<Integer, Cell>();
		this.path = new Stack<Direction>();
		initCells();
		linkNeighbours();
	}

	private void linkNeighbours() {
		for (Entry<Integer, Cell> entry : cellsMap.entrySet()) {
			Neighbours neighbours = new Neighbours(entry.getValue(), cellsMap);
			neighbours.addToCell();
		}

	}

	private void initCells() {
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < columns; y++) {
				Cell cell = new Cell(x, y, CellType.UNKOWN_CELL);
				this.cellsMap.put(cell.getId(), cell);
			}
		}
	}

	public void scanCell(Cell currentCell) {
		if (currentCell.getCellType().equals(CellType.START_CELL) && this.startCell == null) {
			this.startCell = currentCell;
		}
		if (currentCell.getCellType().equals(CellType.COMMAND_ROOM) && this.commandRoom == null) {
			this.commandRoom = currentCell;
		}
		Cell cellToUpdate = cellsMap.get(currentCell.getId());
		cellToUpdate.scanCell(currentCell.getCellType());
	}

	public Cell getStartCell() {
		return this.startCell;
	}

	public Cell getCommandRoom() {
		return this.commandRoom;
	}

	public boolean isCommandRoomPositionKnown() {
		if (commandRoom == null) {
			return false;
		}
		return true;
	}

	public void setPath(Stack<Direction> path) {
		this.path = path;
	}

	public Stack<Direction> getPath() {
		return path;
	}

}
