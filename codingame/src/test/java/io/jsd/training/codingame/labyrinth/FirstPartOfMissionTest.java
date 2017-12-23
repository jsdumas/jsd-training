package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class FirstPartOfMissionTest extends KirkSetUp{
	
	
	@Test
	public void whenKirkGetCommandRoomThenHeSuccessFirstPartOfMission() {
		state.setPosition(new Position(99,99, COMMAND_ROOM));
		Mission mission = new FirstPartOfMission(kirk);
		assertThat(mission.isMissionSuccessed(), is(true));
	}
	
	@Test
	public void whenKirkIsNotONCommandRoomCellThenHeDoesNotSuccessSecondPartOfMission() {
		state.setPosition(new Position(0,0, START_CELL));
		Mission mission = new FirstPartOfMission (kirk);
		assertThat(mission.isMissionSuccessed(), is(false));
	}
	
}
