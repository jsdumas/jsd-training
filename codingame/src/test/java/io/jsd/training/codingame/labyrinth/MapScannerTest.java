package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class MapScannerTest extends GameSetUp {

	@Before
	public void initGrid() {

		unknownGrid[0] = ASTAR_UNKNOWN_LINE.split("");
		unknownGrid[1] = ASTAR_START_CELL_WITH_UKNOWN_CELL.split("");
		unknownGrid[2] = ASTAR_UNKNOWN_LINE.split("");
		unknownLabyrinth = new Labyrinth(unknownGrid);
	}

	@Test
	public void whenKirkScans15CellsThenHeGetsAMapWith15Cells() {
		MapScanner mapScanner = new MapScanner(unknownLabyrinth, new Cell(1, 2, START_CELL));
		mapScanner.scanLabyrinth();
		assertThat(mapScanner.getLabyrinthMap().getSize(), Matchers.is(15));
	}

}
