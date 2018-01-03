package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;

public class LabyrinthMap {
	
	private final Set<Cell> allcells;
	private final Set<Cell> unknownCells;
	private Cell startCell;
	private Cell commandRoom;
	
	
	public LabyrinthMap() {
		this.allcells = new HashSet<Cell>();
		this.unknownCells = new HashSet<Cell>();
	}

	public Set<Cell> getAllcells() {
		return allcells;
	}


	public void addCell(Cell cell) {
		if(cell.getCellType().equals(CellType.UNKOWN_CELL)) {
			unknownCells.add(cell);
		}
		allcells.add(cell);
	}


	public int getSize() {
		return allcells.size();
	}


	public boolean contains(Cell cell) {
		return allcells.contains(cell);
	}

	public void setStartCell(Cell startCell) {
		this.startCell=startCell;
	}
	
	public Cell getStartCell() {
		return this.startCell;
	}

	public void setCommandRoom(Cell commandRoom) {
		this.commandRoom=commandRoom;
	}
	
	public Cell getCommandRoom() {
		return this.commandRoom;
	}

	public boolean isCommandRoomPositionKnown() {
		if(commandRoom==null) {
			return false;
		}
		return true;
	}

	public boolean areAllCellsScanned() {
		for(Cell cell : allcells) {
			if(cell.getCellType().equals(CellType.UNKOWN_CELL)) {
				return false;
			}
		}
		return true;
	}
	
	public Set<Cell> getUnknownCells() {
		Set<Cell> cells = new HashSet<Cell>();
		cells.addAll(unknownCells);
		return cells;
	}

}
