package io.jsd.training.codingame.labyrinth;

public class BottomNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell bottomNeighbour;
	private Labyrinth labyrinth;

	public BottomNeighbour(Cell currentcell, Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
		this.x = currentcell.getX() + 1;
		this.y = currentcell.getY();
		if (isInMap()) {
			this.bottomNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			bottomNeighbour = null;
		}
	}

	@Override
	public boolean isInMap() {
		return x < labyrinth.getLength();
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
		return bottomNeighbour;
	}

	@Override
	public Integer getIdCell() {
		if (bottomNeighbour == null) {
			return Integer.MAX_VALUE;
		}
		return bottomNeighbour.getId();
	}

}
