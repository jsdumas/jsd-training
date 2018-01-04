package io.jsd.training.codingame.labyrinth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LabyrinthMap {

	private final Map<Integer, Cell> cellsMap;
	private final Set<Cell> unknownCells;
	private Cell startCell;
	private Cell commandRoom;

	public LabyrinthMap() {
		this.cellsMap = new HashMap<Integer, Cell>();
		this.unknownCells = new HashSet<Cell>();
	}

	public Map<Integer, Cell> getAllcells() {
		return cellsMap;
	}

	public void addCell(Cell cell) {
		if (cell == null) {
			return;
		}
		if (cell.getCellType().equals(CellType.UNKOWN_CELL)) {
			unknownCells.add(cell);
		}
		cellsMap.put(cell.getId(), cell);
	}

	public int getSize() {
		return cellsMap.size();
	}

	public boolean contains(Cell cell) {
		if (cell == null) {
			return false;
		}
		return cellsMap.containsKey(cell.getId());
	}

	public void setStartCell(Cell startCell) {
		this.startCell = startCell;
	}

	public Cell getStartCell() {
		return this.startCell;
	}

	public void setCommandRoom(Cell commandRoom) {
		this.commandRoom = commandRoom;
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
//		for (Map.Entry<Integer, Cell> item : cellsMap.entrySet()) {
//			Cell cell = item.getValue();
//			if (cell.getCellType().equals(CellType.UNKOWN_CELL)) {
//				return false;
//			}
//		}
//		return true;
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

}
