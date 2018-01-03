package io.jsd.training.codingame.labyrinth;

public class LeftNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell currentCell;
	private final Cell leftNeighbour;
	private Labyrinth labyrinth;

	public LeftNeighbour(Cell currentCell, Labyrinth labyrinth) {
		this.currentCell = currentCell;
		this.labyrinth = labyrinth;
		this.x = currentCell.getX();
		this.y = currentCell.getY() - 1;
		if (isExist()) {
			this.leftNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			this.leftNeighbour = null;
		}
		this.currentCell.putNeighbour(Direction.RIGHT, leftNeighbour);
	}

	@Override
	public boolean isExist() {
		return y >= LEFT_LIMIT;
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			if (!labyrinthMap.contains(leftNeighbour)) {
				labyrinthMap.addCell(leftNeighbour);
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
