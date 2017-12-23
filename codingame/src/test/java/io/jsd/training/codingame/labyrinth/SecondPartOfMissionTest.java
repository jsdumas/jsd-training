package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SecondPartOfMissionTest extends KirkSetUp{
	
	
	
	@Test
	public void whenKirkGetBackStartCellThenHeSuccessSecondPartOfMission() {
		state.setPosition(new Position(0,0, START_CELL));
		Mission mission = new SecondPartOfMission(kirk);
		assertThat(mission.isMissionSuccessed(), is(true));
	}
	
	@Test
	public void whenKirkIsNotONStartCellThenHeDoesNotSuccessSecondPartOfMission() {
		state.setPosition(new Position(0,0, COMMAND_ROOM));
		Mission mission = new SecondPartOfMission(kirk);
		assertThat(mission.isMissionSuccessed(), is(false));
	}

}
