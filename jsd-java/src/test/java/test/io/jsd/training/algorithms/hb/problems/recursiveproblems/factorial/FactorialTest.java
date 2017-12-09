package test.io.jsd.training.algorithms.hb.problems.recursiveproblems.factorial;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

import io.jsd.training.algorithms.hb.problems.recursiveproblems.Algorithm;
import io.jsd.training.algorithms.hb.problems.recursiveproblems.factorial.Factorial;
import test.io.jsd.training.algorithms.hb.problems.recursiveproblems.CalculTime;

public class FactorialTest {
	
	private static final Algorithm ALGO = new Factorial();
	private static final CalculTime CALCUL_TIME = new CalculTime(ALGO);
	private static final int NUMBER_TO_FACTOR = 10000;
	
	@Test
	public void factorialWithMemoizationShouldReturn24(){
		assertThat(ALGO.runFast(4), equalTo(24));
	}
	
	@Test
	public void factorialWithoutMemoizationShouldReturn24(){
		assertThat(ALGO.runSlow(4), equalTo(24));
	}
	
	@Test
	public void factorialWithMemoizationShouldBeFasterThanFactorialWithoutMemoization(){
		Long calculTimeWithoutMemoization = CALCUL_TIME.calculSlowTime(NUMBER_TO_FACTOR);
		Long calculTimeWithMemoization = CALCUL_TIME.calculFastTime(NUMBER_TO_FACTOR);
		assertThat(calculTimeWithoutMemoization, greaterThan(calculTimeWithMemoization) );
	}
	
}
