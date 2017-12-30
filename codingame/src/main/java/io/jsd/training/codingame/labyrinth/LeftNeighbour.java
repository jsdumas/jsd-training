package io.jsd.training.codingame.labyrinth;

public class LeftNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell cell;
	private final Cell leftNeighbour;
	private Labyrinth labyrinth;

	public LeftNeighbour(Cell cell, Labyrinth labyrinth) {
		this.cell = cell;
		this.labyrinth = labyrinth;
		this.x = cell.getX();
		this.y = cell.getY() - 1;
		if (isExist()) {
			this.leftNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			this.leftNeighbour = null;
		}
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
				cell.putNeighbour(Direction.RIGHT, leftNeighbour);
			}
		}
	}

	@Override
	public boolean isMouvable(Cell previousCell, Labyrinth labyrinth) {
		boolean isPreviousCell=false;
		if(previousCell!=null) {
			isPreviousCell=previousCell.equals(leftNeighbour);
		}
		if (isExist() && getCellType().equals(CellType.EMPTY_SPACE) && !isPreviousCell)
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
