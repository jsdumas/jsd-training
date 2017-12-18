package io.jsd.training.codingame.labyrinth;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class LabyrinthTest {
	
	private final static int ROWS = 15;
	private final static int COLUMNS = 30;
	private final static int ALARM = 7;
	private final Labyrinth labyrinth = new Labyrinth(ROWS, COLUMNS, ALARM);
	
	
	@Test
	public void whenInitLabyrinthWithAlarmAt7ThenLabyrinthRowsIs7() {
		assertThat(labyrinth.getAlarm(), Matchers.is(ALARM));
	}
	
	@Test
	public void whenInitLabyrinthWith15RowsThenLabyrinthRowsIs15() {
		MatcherAssert.assertThat(labyrinth.getRows(), Matchers.is(ROWS));
	}
	
	@Test
	public void whenInitLabyrinthWith30ColumnsThenLabyrinthColumnsIs30() {
		MatcherAssert.assertThat(labyrinth.getColumns(), Matchers.is(COLUMNS));
	}

}
