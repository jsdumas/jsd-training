package io.jsd.training.codingame.labyrinth;

public class RightNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell cell;
	private final Cell rightNeighbour;
	private Labyrinth labyrinth;

	public RightNeighbour(Cell cell, Labyrinth labyrinth) {
		this.cell = cell;
		this.labyrinth = labyrinth;
		this.x=cell.getX();
		this.y=cell.getY()+1;
		if(isExist()) {
		this.rightNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			this.rightNeighbour = null;
		}
	}

	@Override
	public boolean isExist() {
		return y < labyrinth.getColLength();
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			if (!labyrinthMap.contains(rightNeighbour)) {
				labyrinthMap.addCell(rightNeighbour);
				cell.putNeighbour(Direction.LEFT, rightNeighbour);
			}
		}
	}

	@Override
	public boolean isMouvable(Cell previousCell, Labyrinth labyrinth) {
		boolean isPreviousCell=false;
		if(previousCell!=null) {
			isPreviousCell=previousCell.equals(rightNeighbour);
		}
		if(isExist() && getCellType().equals(CellType.EMPTY_SPACE) && !isPreviousCell)
			return true;
		return false;
	}

	@Override
	public CellType getCellType() {
		return labyrinth.getCellType(x, y);
	}

	@Override
	public boolean isCommandRoom() {
		return getCellType().equals(CellType.COMMAND_ROOM);
	}
	
}
