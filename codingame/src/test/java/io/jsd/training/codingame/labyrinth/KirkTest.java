package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.Direction.LEFT;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class KirkTest {
	
	private static final Kirk KIRK = new Kirk();

	@Test
	public void whenKirkMoveLeftThenitShouldPrintLeft() {
		MatcherAssert.assertThat(KIRK.mouveLeft(), Matchers.equalTo(LEFT));
	}
	
	@Test
	public void whenKirkMoveUpThenitShouldPrintUp() {
		MatcherAssert.assertThat(KIRK.mouveUp(), Matchers.equalTo(Direction.UP));
	}
	
	@Test
	public void whenKirkMoveRightThenitShouldPrintRight() {
		MatcherAssert.assertThat(KIRK.mouveRight(), Matchers.equalTo(Direction.RIGHT));
	}
	
	@Test
	public void whenKirkMoveDownThenitShouldPrintDown() {
		MatcherAssert.assertThat(KIRK.mouveDown(), Matchers.equalTo(Direction.DOWN));
	}
}
