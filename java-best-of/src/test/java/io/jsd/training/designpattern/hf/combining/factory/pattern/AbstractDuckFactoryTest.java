package io.jsd.training.designpattern.hf.combining.factory.pattern;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.designpattern.combining.factory.bird.Quackable;

public class AbstractDuckFactoryTest {

	private static final List<Quackable> QUACKABLE_TEAM = new QuackableBuilder().withMallardDuck().withRedHeadDuck().withDuckCall()
			.withRubberDuck().withGoose().build();
	private static final QuackSimulator QUACK_SIMULATOR = new QuackSimulator(QUACKABLE_TEAM);

	@Test
	public void shouldQuack4Time() {
		MatcherAssert.assertThat(QUACK_SIMULATOR.getNumberOfQuackWhenEachDuckQuackOneTime(), Matchers.equalTo(4));
	}

}
