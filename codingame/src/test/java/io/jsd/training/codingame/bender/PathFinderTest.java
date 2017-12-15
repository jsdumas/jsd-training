package io.jsd.training.codingame.bender;

import static io.jsd.training.codingame.bender.Path.TO_EAST_INLINE_FROM_START;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import io.jsd.training.codingame.bender.Direction;
import io.jsd.training.codingame.bender.MemorisePath;
import io.jsd.training.codingame.bender.PathFinderFactory;

public class PathFinderTest {

	private static final PathFinderFactory PATH_FINDER_FACTORY = new PathFinderFactory();
	private static final MemorisePath PATH_IS_LOOP_BECAUSE_OF_TIME_OUT = PATH_FINDER_FACTORY.getPath(Path.LOOP_BECAUSE_OF_TIME_OUT);
	private static final MemorisePath PATH_TO_SOUTH_FROM_START = PATH_FINDER_FACTORY.getPath(Path.TO_SOUTH_FROM_START);
	private static final MemorisePath PATH_TO_EAST_FROM_START = PATH_FINDER_FACTORY.getPath(Path.TO_EAST_FROM_START);
	private static final MemorisePath PATH_IS_LOOP_BECAUSE_OF_CHARP = PATH_FINDER_FACTORY.getPath(Path.LOOP_BECAUSE_OF_CHARP);
	private static final MemorisePath PATH_IS_LOOP_BECAUSE_OF_X = PATH_FINDER_FACTORY.getPath(Path.LOOP_BECAUSE_OF_X);
	private static final MemorisePath PATH_TO_SOUTH_FROM_S_MODIFIER = PATH_FINDER_FACTORY.getPath(Path.TO_SOUTH_FROM_S_MODIFIER);
	private static final MemorisePath PATH_TO_EAST_FROM_E_MODIFIER = PATH_FINDER_FACTORY.getPath(Path.TO_EAST_FROM_E_MODIFIER);
	private static final MemorisePath PATH_TO_NORTH_FROM_N_MODIFIER = PATH_FINDER_FACTORY.getPath(Path.TO_NORTH_FROM_N_MODIFIER);
	private static final MemorisePath PATH_TO_WEST_FROM_W_MODIFIER = PATH_FINDER_FACTORY.getPath(Path.TO_WEST_FROM_W_MODIFIER);
	private static final MemorisePath PATH_TO_WEST_FROM_INVERSOR = PATH_FINDER_FACTORY.getPath(Path.TO_WEST_FROM_INVERSOR);
	private static final MemorisePath PATH_TO_SOUTH_FROM_BIER = PATH_FINDER_FACTORY.getPath(Path.TO_SOUTH_FROM_BIER);
	private static final MemorisePath PATH_TO_SOUTH_FROM_T = PATH_FINDER_FACTORY.getPath(Path.TO_SOUTH_FROM_T);
	private static final MemorisePath PATH_TO_EAST_INLINE = PATH_FINDER_FACTORY.getPath(TO_EAST_INLINE_FROM_START);

	@Test
	public void whenBenderWalkMoreThenFiveSecondThenHeWalkOnLoop() {
		assertThat(PATH_IS_LOOP_BECAUSE_OF_TIME_OUT.printDirection(), equalTo(Direction.LOOP.toString()));
	}

	@Test
	public void whenBenderIsOnStartCaseThenHeShouldWalkToSouth() {
		assertThat(PATH_TO_SOUTH_FROM_START.printDirection(), equalTo(Direction.SOUTH.toString()));
	}

	@Test
	public void whenBenderIsOnStartAndSouthWestNorthCasesAreObstaclesThenHeShouldWalkToEAST() {
		assertThat(PATH_TO_EAST_FROM_START.printDirection(), equalTo(Direction.EAST.toString() + "\n" + Direction.EAST.toString() + "\n"
				+ Direction.EAST.toString()));
	}

	@Test
	public void whenBenderCanNotWalkToNextCaseBecauseOfCharpCasesAreaThenBenderWalkOnLoop() {
		assertThat(PATH_IS_LOOP_BECAUSE_OF_CHARP.printDirection(), equalTo(Direction.LOOP.toString()));
	}

	@Test
	public void whenBenderCanNotWalkToNextCaseBecauseOfXCasesAreaThenBenderWalkOnLoop() {
		assertThat(PATH_IS_LOOP_BECAUSE_OF_X.printDirection(), equalTo(Direction.LOOP.toString()));
	}

	@Test
	public void whenBenderWalkOnSouthModifierCaseThenBenderWalkToSouth() {
		assertThat(PATH_TO_SOUTH_FROM_S_MODIFIER.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.SOUTH.toString()));
	}

	@Test
	public void whenBenderWalkOnEastModifierCaseThenBenderWalkToEast() {
		assertThat(PATH_TO_EAST_FROM_E_MODIFIER.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.EAST.toString()));
	}

	@Test
	public void whenBenderWalkOnNorthModifierCaseThenBenderWalkToNorth() {
		assertThat(PATH_TO_NORTH_FROM_N_MODIFIER.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.EAST.toString()
				+ "\n" + Direction.NORTH.toString()));
	}

	@Test
	public void whenBenderWalkOnWestModifierCaseThenBenderWalkToWest() {
		assertThat(PATH_TO_WEST_FROM_W_MODIFIER.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.WEST.toString()));
	}

	@Test
	public void whenBenderWalkOnInversorCaseThenBenderWalkToWest() {
		assertThat(PATH_TO_WEST_FROM_INVERSOR.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.WEST.toString()));
	}

	@Test
	public void whenBenderWalkOnBierCaseThenBenderWalkToSouth() {
		assertThat(PATH_TO_SOUTH_FROM_BIER.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.SOUTH.toString() + "\n"
				+ Direction.SOUTH.toString()));
	}

	@Test
	public void whenBenderWalkOnTeleporterCaseThenBenderWalkToSouth() {
		assertThat(PATH_TO_SOUTH_FROM_T.printDirection(), equalTo(Direction.SOUTH.toString() + "\n" + Direction.SOUTH.toString()));
	}

	@Test
	public void givenSouthWestAndNorthCasesAreCharpTypeCasesWhenBenderIsOnStartCaseThenBenderWalkInLineToEast() {
		assertThat(PATH_TO_EAST_INLINE.printDirection(), equalTo(Direction.EAST.toString() + "\n" + Direction.EAST.toString() + "\n"
				+ Direction.EAST.toString()));
	}

}
