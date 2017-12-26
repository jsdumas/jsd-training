package io.jsd.training.codingame.labyrinth;

public interface Mission {

	void throwMission(Labyrinth labyrinth, Alarm alarm);
	Direction getDirection();

}

