package io.jsd.training.codingame.labyrinth;

public class RightNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell currentCell;
	private final Cell rightNeighbour;
	private Labyrinth labyrinth;

	public RightNeighbour(Cell currentCell, Labyrinth labyrinth) {
		this.currentCell = currentCell;
		this.labyrinth = labyrinth;
		this.x = currentCell.getX();
		this.y = currentCell.getY() + 1;
		if (isExist()) {
			this.rightNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			this.rightNeighbour = null;
		}
		this.currentCell.putNeighbour(Direction.LEFT, rightNeighbour);
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
			}
		}
	}

	@Override
	public boolean isMouvable(Labyrinth labyrinth) {
		if (isExist() && getCellType().equals(CellType.EMPTY_SPACE))
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
