package test.io.jsd.training.designpatterns.hf.structural.adapter.ducks.pattern;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.designpatterns.hf.structural.adapter.ducks.bird.MallardDuck;
import io.jsd.training.designpatterns.hf.structural.adapter.ducks.bird.Turkey;
import io.jsd.training.designpatterns.hf.structural.adapter.ducks.pattern.DuckAdapter;

public class DuckAdapterTest {

	private static final MallardDuck DUCK = new MallardDuck();
	private static final Turkey TURKEY_ADAPTED_LIKE_A_DUCK = new DuckAdapter(DUCK);
	private static final String DUCK_QUACK = "Quack like a Mallard Duck.";
	private static final String DUCK_FLY = "I'm flying proudly like a Mallard Duck.";

	@Test
	public void aTurkeyCanQuackLikeADuck() {
		MatcherAssert.assertThat(TURKEY_ADAPTED_LIKE_A_DUCK.gobble(), Matchers.equalTo(DUCK_QUACK));
	}

	@Test
	public void aTurkeyCanFlyLikeADuck() {
		MatcherAssert.assertThat(TURKEY_ADAPTED_LIKE_A_DUCK.fly(), Matchers.equalTo(DUCK_FLY));
	}

}
