package io.jsd.training.codingame.labyrinth;

public class PositionState {
	
	private Cell cell;
	
	public void setPosition(Cell cell) {
		this.cell = cell;
	}

	public Cell getCell() {
		return cell;
	}

	public int getCurrentX() {
		return cell.getX();
	}

	public int getCurrentY() {
		return cell.getY();
	}

	public CellType getCellType() {
		return cell.getCellType();
	}

}
