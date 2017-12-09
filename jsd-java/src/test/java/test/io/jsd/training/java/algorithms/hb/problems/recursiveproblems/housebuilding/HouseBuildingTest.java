package test.io.jsd.training.java.algorithms.hb.problems.recursiveproblems.housebuilding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

import io.jsd.training.java.algorithms.hb.problems.recursiveproblems.Algorithm;
import io.jsd.training.java.algorithms.hb.problems.recursiveproblems.housebuilding.HouseBuilding;
import test.io.jsd.training.java.algorithms.hb.problems.recursiveproblems.CalculTime;

public class HouseBuildingTest {
	
	private final static Algorithm ALGO = new HouseBuilding();
	private static final CalculTime CALCUL_TIME = new CalculTime(ALGO);
	private static final int NUMBER_STAGE_TO_BUILD = 1000 ;
	
	@Test
	public void headRecursionShouldBeSlowerThanTailRecursion(){
		Long headRecursionTime = CALCUL_TIME.calculSlowTime(NUMBER_STAGE_TO_BUILD);
		Long tailRecursionTime = CALCUL_TIME.calculFastTime(NUMBER_STAGE_TO_BUILD);
		assertThat(headRecursionTime , greaterThan(tailRecursionTime));
	}

}
