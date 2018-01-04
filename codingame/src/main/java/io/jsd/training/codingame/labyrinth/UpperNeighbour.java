package io.jsd.training.codingame.labyrinth;

public class UpperNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell upperNeighbour;
	private Labyrinth labyrinth;

	public UpperNeighbour(Cell currentCell, Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
		this.x = currentCell.getX() - 1;
		this.y = currentCell.getY();
		if (isInMap()) {
			this.upperNeighbour = new Cell(x, (y), labyrinth.getCellType(x, y));
		} else {
			this.upperNeighbour = null;
		}
	}

	@Override
	public boolean isInMap() {
		return x >= UPPER_LIMIT;
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
		return upperNeighbour;
	}

	@Override
	public Integer getIdCell() {
		if (upperNeighbour == null) {
			return Integer.MAX_VALUE;
		}
		return upperNeighbour.getId();
	}

}
