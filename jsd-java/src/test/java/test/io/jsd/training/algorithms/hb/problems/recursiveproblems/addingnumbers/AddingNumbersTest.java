package test.io.jsd.training.algorithms.hb.problems.recursiveproblems.addingnumbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.jsd.training.algorithms.hb.problems.recursiveproblems.Algorithm;
import io.jsd.training.algorithms.hb.problems.recursiveproblems.addingnumbers.AddingNumbers;
import test.io.jsd.training.algorithms.hb.problems.recursiveproblems.CalculTime;

public class AddingNumbersTest {
	
	private static final Algorithm ALGO = new AddingNumbers();
	private static final CalculTime CALCUL_TIME = new CalculTime(ALGO);
	private static final int NUMBER_TO_SUM = 3;
	private static final int RESULT = 6;
	private static final int FASTER_NUMBER = 1000;
	
	@Test
	public void shouldSumIterationReturn6(){
		assertThat(ALGO.runFast(NUMBER_TO_SUM), is(equalTo(RESULT)));
	}
	
	@Test
	public void shouldSumRecursionReturn6(){
		assertThat(ALGO.runSlow(NUMBER_TO_SUM), is(equalTo(RESULT)));
	}
	
	@Test
	public void recursionShouldBeSlowerThanIteration(){
		Long recursionTime = CALCUL_TIME.calculSlowTime(FASTER_NUMBER);
		Long iterationTime = CALCUL_TIME.calculFastTime(FASTER_NUMBER);
		assertThat(recursionTime, greaterThan(iterationTime));
	}

}
