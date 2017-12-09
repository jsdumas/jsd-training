package test.io.jsd.training.codingame.rollercoaster;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import io.jsd.training.codingame.rollercoaster.GroupOfRiders;
import io.jsd.training.codingame.rollercoaster.RollerCoasterQueue;

public class RollerCoasterQueueBuilder {

	private static final String FILE_NAME = "src/test/resources/groups_of_many_people.txt";
	private final RollerCoasterQueue rollerCoasterQueue;

	public RollerCoasterQueueBuilder() {
		this.rollerCoasterQueue = new RollerCoasterQueue();
	}

	public RollerCoasterQueueBuilder with(GroupOfRiders groupQueue) {
		rollerCoasterQueue.addGroup(groupQueue);
		return this;
	}

	public RollerCoasterQueue build() {
		return rollerCoasterQueue;
	}

	public RollerCoasterQueueBuilder withManyPeople() {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
			String currentLine;
			try {
				int idGroup = 0;
				while ((currentLine = bufferedReader.readLine()) != null) {
					rollerCoasterQueue.addGroup(new GroupOfRiders(idGroup, Long.parseLong(currentLine)));
					idGroup++;
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("withManyPeople " + e);
			}
		} catch (FileNotFoundException e) {
			System.out.println("withManyPeople " + e);
		}
		return this;
	}

}
