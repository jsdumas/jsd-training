package test.io.jsd.training.java.designpattern.reference;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.java.designpattern.reference.Car;
import io.jsd.training.java.designpattern.reference.Knight;
import io.jsd.training.java.designpattern.reference.Movable;
import io.jsd.training.java.designpattern.reference.Move;
import io.jsd.training.java.designpattern.reference.MovieCharacter;

public class MoveTest {

	private static final Move MOVE = new Move();
	private static final MovieCharacter CHAR = new MovieCharacter();
	private static final String MAKE_CHARACTER_MOVE_FORWARD = "Make character move forward";
	private static final String KNIGHT_MOVE_FORWARD = "Knight move forward";
	private static final String CAR_MOVE_FORWARD = "Car move forward";
	private static final Knight KNIGHT = new Knight();
	// reference ----> implementation
	private static final Movable CAR = new Car();
	private static final String FORD = "Ford";

	@Test
	public void whenMakeCharacterMoveForwardThenPrintMakeCharacterMoveForward() {
		MatcherAssert.assertThat(MOVE.makeMoveForward(CHAR), Matchers.equalTo(MAKE_CHARACTER_MOVE_FORWARD));
	}

	@Test
	public void whenMakeCarMoveForwardThenPrintCarMoveForward() {
		MatcherAssert.assertThat(MOVE.makeMoveForward(CAR), Matchers.equalTo(CAR_MOVE_FORWARD));
	}

	@Test
	public void whenCarMoveForwardThenPrintCarMoveForward() {
		MatcherAssert.assertThat(CAR.moveForward(), Matchers.equalTo(CAR_MOVE_FORWARD));
	}

	@Test
	public void whenCarChangeBrandToFordThenPrintFord() {
		((Car) CAR).setBrand(FORD);
		MatcherAssert.assertThat(((Car) CAR).getBrand(), Matchers.equalTo(FORD));
	}

	@Test
	public void whenMakeKnightMoveForwardThenPrintKnightMoveForward() {
		MatcherAssert.assertThat(MOVE.makeMoveForward(KNIGHT), Matchers.equalTo(KNIGHT_MOVE_FORWARD));
	}

}
