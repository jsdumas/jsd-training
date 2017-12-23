package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class SecondPartOfMissionTest extends KirkSetUp{
	
	
	@Before
	public void setUp() {
		state.setPosition(new Position(0,0, START_CELL));
	}
	
	@Test
	public void whenKirkGetBackStartCellThenHeSuccessSecondPartOfMission() {
		Mission mission = new SecondPartOfMission(kirk);
		assertThat(mission.isMissionSuccessed(), is(true));
	}

}
