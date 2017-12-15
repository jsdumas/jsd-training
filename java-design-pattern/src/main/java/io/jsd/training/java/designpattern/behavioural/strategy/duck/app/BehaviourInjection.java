package io.jsd.training.java.designpattern.behavioural.strategy.duck.app;

import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.fly.FlyRocketPowered;
import io.jsd.training.java.designpattern.behavioural.strategy.duck.bird.ModelDuck;

public class BehaviourInjection {

	public static void main(String[] args) {

		ModelDuck model = new ModelDuck();

		model.performFly();
		// Inject a new FlyBehaviour
		model.setFlyBehavior(new FlyRocketPowered());
		// Now FlyBehaviour of ModelDuck is different
		model.performFly();
	}
}
