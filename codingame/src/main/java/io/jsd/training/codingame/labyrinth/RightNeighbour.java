package io.jsd.training.codingame.labyrinth;

public class RightNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell rightNeighbour;
	private Labyrinth labyrinth;

	public RightNeighbour(Cell currentCell, Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
		this.x = currentCell.getX();
		this.y = currentCell.getY() + 1;
		if (isInMap()) {
			this.rightNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			this.rightNeighbour = null;
		}
	}

	@Override
	public boolean isInMap() {
		return y < labyrinth.getColLength();
	}

	@Override
	public boolean isMouvable(Labyrinth labyrinth) {
		if (isInMap() && getCellType().equals(CellType.EMPTY_SPACE))
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

	@Override
	public Cell getCell() {
		return rightNeighbour;
	}

	@Override
	public Integer getIdCell() {
		if (rightNeighbour == null) {
			return Integer.MAX_VALUE;
		}
		return rightNeighbour.getId();
	}

}
