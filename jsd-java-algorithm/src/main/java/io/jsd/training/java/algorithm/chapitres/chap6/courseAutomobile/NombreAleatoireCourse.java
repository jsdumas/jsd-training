package io.jsd.training.java.algorithm.chapitres.chap6.courseAutomobile;

import java.util.Random;

public class NombreAleatoireCourse {
	Random r = new Random();

	public NombreAleatoireCourse() {
		r.setSeed(System.currentTimeMillis());
	}

	public int calcule(int borneInf, int borneSup) {
		return borneInf + (int) (r.nextDouble() * (borneSup - borneInf + 1));
	}
}
