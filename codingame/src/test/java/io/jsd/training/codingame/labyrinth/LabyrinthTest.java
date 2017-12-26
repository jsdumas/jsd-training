package io.jsd.training.codingame.labyrinth;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class LabyrinthTest extends GameSetUp{

	@Before
	public void initGrid() {
		grid[0] = LINE_0.split("");
		grid[1] = LINE_1.split("");
		grid[2] = LINE_2.split("");
		grid[3] = LINE_3.split("");
		grid[4] = LINE_4.split("");
		labyrinth = new Labyrinth(grid);
	}

	@Test
	public void whenInitLabyrinthWithAlarmAt7ThenLabyrinthRowsIs7() {
		assertThat(alarm.getCount(), is(ALARM_COUNT));
	}

	@Test
	public void whenInitLabyrinthWith5RowsThenLabyrinthRowsIs5() {
		assertThat(labyrinth.getGrid().length, is(ROWS));
	}

	@Test
	public void whenInitLabyrinthWith9ColumnsThenLabyrinthColumnsIs9() {
		assertThat(labyrinth.getGrid()[0].length, is(COLUMNS));
	}
	
}
