package io.jsd.training.codingame.labyrinth;

public class UpperNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell upperNeighbour;
	private final Cell currentCell;
	private Labyrinth labyrinth;

	public UpperNeighbour(Cell currentCell, Labyrinth labyrinth) {
		this.currentCell = currentCell;
		this.labyrinth = labyrinth;
		this.x = currentCell.getX() - 1;
		this.y = currentCell.getY();
		if (isExist()) {
			this.upperNeighbour = new Cell(x, (y), labyrinth.getCellType(x, y));
		} else {
			this.upperNeighbour = null;
		}
		this.currentCell.putNeighbour(Direction.DOWN, upperNeighbour);
	}

	@Override
	public boolean isExist() {
		return x >= UPPER_LIMIT;
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			if (!labyrinthMap.contains(upperNeighbour)) {
				labyrinthMap.addCell(upperNeighbour);
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
