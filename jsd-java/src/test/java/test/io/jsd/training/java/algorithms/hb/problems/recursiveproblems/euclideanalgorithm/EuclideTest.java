package test.io.jsd.training.java.algorithms.hb.problems.recursiveproblems.euclideanalgorithm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import io.jsd.training.java.algorithms.hb.problems.recursiveproblems.euclideanalgorithm.Euclide;

public class EuclideTest {
	
	private static final Euclide EUCLIDE = new Euclide();
	
	@Test
	public void recursiveEuclideMethodShouldReturn10(){
		assertThat(EUCLIDE.gcdRecursive(10, 20), equalTo(10));
	}
	
	@Test
	public void iterativeEuclideMethodShouldReturn10(){
		assertThat(EUCLIDE.gcdIterative(10, 20), equalTo(10));
	}

}
