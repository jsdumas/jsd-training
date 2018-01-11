package io.jsd.training.codingame.labyrinth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LabyrinthMap {

	private Map<Integer, Cell> cellsMap;
	private Set<Cell> unknownCells;
	private Cell startCell;
	private Cell commandRoom;
	private Stack<Direction> path;

	public LabyrinthMap() {
		this.cellsMap = new HashMap<Integer, Cell>();
		this.unknownCells = new HashSet<Cell>();
		this.path = new Stack<Direction>();
	}

	public Map<Integer, Cell> getAllcells() {
		return cellsMap;
	}

	public void addCell(Cell cell) {
		if (cell == null) {
			return;
		}
		if (cell.getCellType().equals(CellType.START_CELL) && this.startCell == null) {
			this.startCell = cell;
		}
		if (cell.getCellType().equals(CellType.COMMAND_ROOM) && this.commandRoom == null) {
			this.commandRoom = cell;
		}
		if (cell.getCellType().equals(CellType.UNKOWN_CELL)) {
			this.unknownCells.add(cell);
		}
		memorize(cell);
	}

	private void memorize(Cell cell) {
		if (cellsMap.containsKey(cell.getId())) {
			updateCell(cell);
		} else {
			cellsMap.put(cell.getId(), cell);
		}
	}

	private void updateCell(Cell cell) {
		Cell memorizedCell = cellsMap.get(cell.getId());
		CellType memorizedCellType = memorizedCell.getCellType();
		if (memorizedCellType.equals(CellType.UNKOWN_CELL) && !memorizedCellType.equals(cell.getCellType())) {
			memorizedCell.setCellType(cell.getCellType());
			unknownCells.remove(memorizedCell);
		}
	}

	public int getSize() {
		return cellsMap.size();
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

	public boolean areAllCellsScanned() {
		return unknownCells.isEmpty();
	}

	public Set<Cell> getUnknownCells() {
		Set<Cell> cells = new HashSet<Cell>();
		cells.addAll(unknownCells);
		return cells;
	}

	public boolean isExist(Integer cellId) {
		return cellsMap.containsKey(cellId);
	}

	public Cell getCell(Integer cellId) {
		return cellsMap.get(cellId);
	}

	public void setPath(Stack<Direction> path) {
		this.path = path;
	}

	public Stack<Direction> getPath() {
		return path;
	}

	public void removeAllCellsCollections() {
		this.cellsMap = new HashMap<Integer, Cell>();
		this.unknownCells = new HashSet<Cell>();
	}

	public Cell getNeighbourCell(Neighbour neighbour) {
		return getCell(neighbour.getIdCell());
	}

	public void addNeighbourCell(Neighbour neighbour) {
		this.addCell(neighbour.getCell());
	}

}
