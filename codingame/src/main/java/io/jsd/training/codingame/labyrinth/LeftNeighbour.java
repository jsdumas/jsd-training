package io.jsd.training.codingame.labyrinth;

public class LeftNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell leftNeighbour;
	private Labyrinth labyrinth;

	public LeftNeighbour(Cell currentCell, Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
		this.x = currentCell.getX();
		this.y = currentCell.getY() - 1;
		if (isInMap()) {
			this.leftNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			this.leftNeighbour = null;
		}
	}

	@Override
	public boolean isInMap() {
		return y >= LEFT_LIMIT;
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
		return leftNeighbour;
	}

	@Override
	public Integer getIdCell() {
		if (leftNeighbour == null) {
			return Integer.MAX_VALUE;
		}
		return leftNeighbour.getId();
	}

}
