package test.io.jsd.training.codingame.dwaresandgiants;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.codingame.dwaresandgiants.DwaresStandingOnTheShouldersOfGiants;
import io.jsd.training.codingame.dwaresandgiants.Person;

public class DwaresStandingOnTheShouldersOfGiantsTest {
	
	private static final Person PERSON_ONE = new InfluencerBuilder(4).withInheritance(1,2).withInheritance(1,3).withInheritance(3,4).build();
	private static final Person PERSON_TEN = new InfluencerBuilder(11).withInheritance(1,2).withInheritance(1,3).withInheritance(3,4).
			withInheritance(2,4).withInheritance(2,5).withInheritance(10,11).withInheritance(10,1).withInheritance(10,3).build();
	private static final DwaresStandingOnTheShouldersOfGiants DWARES = new DwaresStandingOnTheShouldersOfGiants();
	
	@Test
	public void shouldReturnThree() {
		MatcherAssert.assertThat(DWARES.findTheLongestInfluenceInheritance(PERSON_ONE), Matchers.is(3));
	}
	
	@Test
	public void shouldReturnFour() {
		MatcherAssert.assertThat(DWARES.findTheLongestInfluenceInheritance(PERSON_TEN), Matchers.is(4));
	}
}
