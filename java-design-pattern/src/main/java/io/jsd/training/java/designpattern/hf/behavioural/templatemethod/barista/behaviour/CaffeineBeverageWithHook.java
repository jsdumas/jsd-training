package io.jsd.training.java.designpattern.hf.behavioural.templatemethod.barista.behaviour;

public abstract class CaffeineBeverageWithHook {

	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	protected abstract void brew();

	protected abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	boolean customerWantsCondiments() {
		return true;
	}
}
