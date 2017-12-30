package io.jsd.training.codingame.labyrinth;

import org.junit.Before;

public class FindCommandRoomTest extends GameSetUp{
	
	@Before
	public void initGrid() {
		grid[0] = LINE_1.split("");
		grid[1] = LINE_2.split("");
		grid[2] = LINE_3.split("");
		labyrinth = new Labyrinth(grid);
	}
	

}
