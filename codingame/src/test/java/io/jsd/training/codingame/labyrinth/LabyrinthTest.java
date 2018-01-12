package io.jsd.training.codingame.labyrinth;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

import io.jsd.training.codingame.labyrinth.bean.Labyrinth;

public class LabyrinthTest extends GameSetUp {

	@Before
	public void initGrid() {
		grid[0] = LINE_5_CHARPS.split("");
		grid[1] = LINE_1_CHARP_1_T_1_EMPTY_1_COMMAND_1_CHARP.split("");
		grid[2] = LINE_5_CHARPS.split("");
		labyrinth = new Labyrinth(grid);
	}

	@Test
	public void whenInitLabyrinthWith5RowsThenLabyrinthRowsIs5() {
		assertThat(labyrinth.getGrid().length, is(3));
	}

	@Test
	public void whenInitLabyrinthWith9ColumnsThenLabyrinthColumnsIs9() {
		assertThat(labyrinth.getGrid()[0].length, is(5));
	}

}
