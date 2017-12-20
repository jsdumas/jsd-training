package io.jsd.training.designpattern.hf.combining.decorator.pattern;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.designpattern.combining.decorator.bird.MallardDuck;
import io.jsd.training.designpattern.combining.decorator.bird.Quackable;
import io.jsd.training.designpattern.combining.decorator.bird.RedheadDuck;
import io.jsd.training.designpattern.combining.decorator.pattern.QuackCounter;

public class QuackCounterTest {

	private static final Quackable MALLARD_DUCK = new QuackCounter(new MallardDuck());
	private static final Quackable RED_HEAD_DUCK = new QuackCounter(new RedheadDuck());

	@Test
	public void shouldQuackTwoTimes() {
		MALLARD_DUCK.quack();
		RED_HEAD_DUCK.quack();
		MatcherAssert.assertThat(QuackCounter.getQuacks(), Matchers.equalTo(2));
	}

}
