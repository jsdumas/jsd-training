package test.io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import org.junit.Test;

import io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi.Plate;
import io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi.TowerOfHanoi;

public class TowerOfHanoiTest {

	private static final Plate SMALL_PLATE = new Plate(3);
	private static final Plate MEDIUM_PLATE = new Plate(2);
	private static final Plate LARGE_PLATE = new Plate(1);
	private static final TowerOfHanoiBuilder TOWER_OF_HANOI_BUILDER = new TowerOfHanoiBuilder();

	@Test
	public void shouldMovePlateFromAToC() {
		TowerOfHanoi towerOfHanoi = TOWER_OF_HANOI_BUILDER.withPlate(LARGE_PLATE).withPlate(MEDIUM_PLATE).withPlate(SMALL_PLATE).build();
		towerOfHanoi.solveHanoiProblem(3);
		assertThat(towerOfHanoi.getRodeTo(), contains(LARGE_PLATE, MEDIUM_PLATE, SMALL_PLATE));
	}

	// Plate 1 from A to C
	// Plate 2 from A to B
	// Plate 1 from C to B
	// Plate 3 from A to C
	// Plate 1 from B to A
	// Plate 2 from B to C
	// Plate 1 from A to C
}
