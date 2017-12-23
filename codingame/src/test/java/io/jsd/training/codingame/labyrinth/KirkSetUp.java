package io.jsd.training.codingame.labyrinth;

public abstract class KirkSetUp {
	
	protected final Jetpack jetpack = new Jetpack();
	protected final KirkState state = new KirkState(jetpack);
	protected final Kirk kirk = new Kirk(state);

}
