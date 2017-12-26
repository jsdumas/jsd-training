package io.jsd.training.codingame.labyrinth;


import java.util.HashMap;
import java.util.Map;

public class Cell {

	private final int x;
	private final int y;
	private final CellType cellType;
	private boolean isScanned;
	private Map<Direction, Cell> neighbours;
	private double howFarAwayThatCellIsFromTheStartingCell;
	private double lowestCostPath;
	private ParentCell parentCellForShortestPath;

	public Cell(int x, int y, CellType cellType) {
		this.x = x;
		this.y = y;
		this.cellType = cellType;
		this.isScanned = false;
		this.neighbours = new HashMap<Direction, Cell>();
	}
	
	
	private boolean hasLeftNeighbour() {
		return (x - 1) >= 0;
	}

	private boolean hasRightNeighbour(int length) {
		return (x + 1) < length;
	}

	private boolean hasUpperNeighbour() {
		return (y - 1) >= 0;
	}

	private boolean hasBottomNeighbour(int colLength) {
		return (y + 1) < colLength;
	}
	
	private CellType getBottomCellType(Labyrinth labyrinth) {
		return labyrinth.getCellType(x, (y+1));
	}

	private CellType getRightCellType(Labyrinth labyrinth) {
		return labyrinth.getCellType((x+1), y);
	}

	private CellType getLeftCellType(Labyrinth labyrinth) {
		return labyrinth.getCellType((x-1), y);
	}

	private CellType getUpperCellType(Labyrinth labyrinth) {
		return labyrinth.getCellType(x, (y-1));
	}
	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public CellType getCellType() {
		return cellType;
	}

	public void scanCell() {
		this.isScanned = true;
	}

	public boolean isScanned() {
		return isScanned;
	}

	public void addNeighbours(LabyrinthMap labyrinthMap, Labyrinth labyrinth) {
		if (hasLeftNeighbour()) {
			Cell leftNeighbour = new Cell((x - 1), y, labyrinth.getCellType((x - 1), y));
			if (!labyrinthMap.contains(leftNeighbour)) {
				labyrinthMap.addCell(leftNeighbour);
				this.neighbours.put(Direction.RIGHT, leftNeighbour);
			}
		}
		if (hasRightNeighbour(labyrinth.getLength())) {
			Cell rightNeighbour = new Cell((x + 1), y, labyrinth.getCellType((x + 1), y));
			if (!labyrinthMap.contains(rightNeighbour)) {
				labyrinthMap.addCell(rightNeighbour);
				this.neighbours.put(Direction.LEFT, rightNeighbour);
			}
		}
		if (hasUpperNeighbour()) {
			Cell upperNeighbour = new Cell(x, (y - 1), labyrinth.getCellType(x, (y - 1)));
			if (!labyrinthMap.contains(upperNeighbour)) {
				labyrinthMap.addCell(upperNeighbour);
				this.neighbours.put(Direction.DOWN, upperNeighbour);
			}
		}
		if (hasBottomNeighbour(labyrinth.getColLength())) {
			Cell bottomNeighbour = new Cell(x, (y + 1), labyrinth.getCellType(x, (y + 1)));
			if (!labyrinthMap.contains(bottomNeighbour)) {
				labyrinthMap.addCell(bottomNeighbour);
				this.neighbours.put(Direction.UP, bottomNeighbour);
			}
		}
	}

	public Map<Direction, Cell> getNeighbours() {
		return neighbours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public boolean hasCommandRoomAtLeftCell(Labyrinth labyrinth) {
		if(hasLeftNeighbour() && getLeftCellType(labyrinth).equals(CellType.COMMAND_ROOM))
			return true;
		return false;
	}
	
	public boolean hasCommandRoomAtUpperCase(Labyrinth labyrinth) {
		if(hasUpperNeighbour() && getUpperCellType(labyrinth).equals(CellType.COMMAND_ROOM))
			return true;
		return false;
	}
	
	public boolean hasCommandRoomAtRightCase(Labyrinth labyrinth) {
		if(hasRightNeighbour(labyrinth.getLength()) && getRightCellType(labyrinth).equals(CellType.COMMAND_ROOM))
			return true;
		return false;
	}
	
	public boolean hasCommandRoomAtBottomCase(Labyrinth labyrinth) {
		if(hasBottomNeighbour(labyrinth.getColLength()) && getBottomCellType(labyrinth).equals(CellType.COMMAND_ROOM))
			return true;
		return false;
	}


	public boolean isLeftCellMouvable(Labyrinth labyrinth) {
		if(hasLeftNeighbour() && !getLeftCellType(labyrinth).equals(CellType.EMPTY_SPACE))
			return true;
		return false;
	}

	public boolean isUpperCellMouvable(Labyrinth labyrinth) {
		if(hasUpperNeighbour() && !getLeftCellType(labyrinth).equals(CellType.EMPTY_SPACE))
			return true;
		return false;
	}

	public boolean isRightCellMouvable(Labyrinth labyrinth) {
		if(hasRightNeighbour(labyrinth.getLength()) && !getLeftCellType(labyrinth).equals(CellType.EMPTY_SPACE))
			return true;
		return false;
	}

	public boolean isBottomCellMouvable(Labyrinth labyrinth) {
		if(hasBottomNeighbour(labyrinth.getColLength()) && !getLeftCellType(labyrinth).equals(CellType.EMPTY_SPACE))
			return true;
		return false;
	}


	public void setgScore(double cost) {
		this.howFarAwayThatCellIsFromTheStartingCell=cost;
	}


	public double getgScore() {
		return howFarAwayThatCellIsFromTheStartingCell;
	}


	public double getfScore() {
		return lowestCostPath;
	}


	public void setfScore(double lowestCostPath) {
		this.lowestCostPath=lowestCostPath;
	}



	public ParentCell getParentCellForShortestPath() {
		return this.parentCellForShortestPath;
	}


	public void setParentCellForShortestPath(ParentCell parentCellForShortestPath) {
		this.parentCellForShortestPath=parentCellForShortestPath;
	}


	public Cell getParentCell() {
		return parentCellForShortestPath.getParentCell();
	}


	public Direction getFrom() {
		return parentCellForShortestPath.getFrom();
	}


	
}
