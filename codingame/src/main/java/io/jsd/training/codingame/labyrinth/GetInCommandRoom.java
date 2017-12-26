package io.jsd.training.codingame.labyrinth;

public class GetInCommandRoom implements Mission {
	
	private final Kirk kirk;
	private Direction direction;
	
	public GetInCommandRoom(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public void throwMission(Labyrinth labyrinth, Alarm alarm) {
		setDirection(labyrinth);
		kirk.secondMissionFinished(alarm);
	}

	public void setDirection(Labyrinth labyrinth) {
		direction = null;
		Cell currentCell = kirk.getPosition();
		if(currentCell.hasCommandRoomAtLeftCell(labyrinth)) {
			direction =  Direction.LEFT;
		} else  if(currentCell.hasCommandRoomAtUpperCase(labyrinth)) {
			direction =  Direction.UP;
		} else  if(currentCell.hasCommandRoomAtRightCase(labyrinth)) {
			direction =  Direction.RIGHT;
		} else  if(currentCell.hasCommandRoomAtBottomCase(labyrinth)) {
			direction =  Direction.DOWN;
		}
	}


	@Override
	public Direction getDirection() {
		return direction;
	}

}
