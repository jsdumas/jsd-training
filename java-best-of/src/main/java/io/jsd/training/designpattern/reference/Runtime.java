package io.jsd.training.designpattern.reference;

public class Runtime {

	public static void main(String[] args) {

		MovieCharacter perso = new MovieCharacter();
		Knight chev1 = new Knight();
		// reference ----> implementation
		Movable voiture = new Car();

		faireAvancer(perso);
		faireAvancer(voiture);
		faireAvancer(chev1);
		chev1.avancer(5);
		voiture.moveForward();
		((Car) voiture).setBrand("test");

		if (voiture instanceof Car) {
			// voiture = (Voiture)voiture;
			System.out.println("Marque de la voiture " + ((Car) voiture).getBrand());
		}

	}

	public static void faireAvancer(Movable movable) {
		movable.moveForward();
	}

}
