package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class FirstPartOfMissionTest extends KirkSetUp{
	
	@Before
	public void setUp() {
		state.setPosition(new Position(99,99, COMMAND_ROOM));
	}
	
	@Test
	public void whenKirkGetCommandRoomThenHeSuccessFirstPartOfMission() {
		Mission mission = new FirstPartOfMission(kirk);
		assertThat(mission.isMissionSuccessed(), is(true));
	}
	
}
