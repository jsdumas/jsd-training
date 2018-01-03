package io.jsd.training.codingame.labyrinth;

public class BottomNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell bottomNeighbour;
	private final Cell currentCell;
	private Labyrinth labyrinth;

	public BottomNeighbour(Cell currentcell, Labyrinth labyrinth) {
		this.currentCell = currentcell;
		this.labyrinth = labyrinth;
		this.x = currentcell.getX() + 1;
		this.y = currentcell.getY();
		if (isExist()) {
			this.bottomNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			bottomNeighbour = null;
		}
		this.currentCell.putNeighbour(Direction.UP, bottomNeighbour);
	}

	@Override
	public boolean isExist() {
		return x < labyrinth.getLength();
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			if (!labyrinthMap.contains(bottomNeighbour)) {
				labyrinthMap.addCell(bottomNeighbour);
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
