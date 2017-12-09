package test.io.jsd.training.codingame.dwaresandgiants;

import java.util.Hashtable;
import java.util.Map;

import io.jsd.training.codingame.dwaresandgiants.Person;

public class InfluencerBuilder {
	
	private Map<Integer, Person> personDirectory;

	public InfluencerBuilder(int influencerNumber) {
		personDirectory = new Hashtable<>();
		initPersonDirectory(influencerNumber);
	}

	private void initPersonDirectory(int influencerNumber) {
		for(int i=1; i<=influencerNumber; i++) {
			personDirectory.put(i, new Person(i));
		}
	}

	public InfluencerBuilder withInheritance(int idPredecessor, int idHeir) {
		Person predecessor = personDirectory.get(idPredecessor);
		Person heir = personDirectory.get(idHeir);
		predecessor.addHeir(heir);
		heir.addAncestor(predecessor);
		return this;
	}

	public Person build() {
		Person ancestor=personDirectory.get(1);
		while(!ancestor.getAncestors().isEmpty()){
			ancestor=ancestor.getAncestors().get(0);
		}
		return ancestor;
	}

}
