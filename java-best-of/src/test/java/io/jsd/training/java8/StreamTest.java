package io.jsd.training.java8;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class StreamTest {

	private List<String> strings = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");
	private List<Commande> commandes = Arrays.asList(//
			new Commande(new Client("Jean")), //
			new Commande(new Client("Jacques")), //
			new Commande(new Client("Jules")), //
			new Commande(new Client("Justin")), //
			new Commande(new Client("Justin")));

	class Commande {
		private Client client;

		public Commande(Client client) {
			this.client = client;
		}

		public Client getClient() {
			return client;
		}

	}

	class Client {

		private final String name;

		public Client(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Client other = (Client) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private StreamTest getOuterType() {
			return StreamTest.this;
		}

	}

	@Test
	public void whenFilteringListOnCharAndTransformFirstLetterInUpperCaseAndSortThenReturnSortedListWithRightCharAndRightUpperCase() {
		List<String> result = strings.stream()
				// filtrage
				.filter(x -> x.contains("cha"))
				// mapping : reformatage des chaînes de caractères
				.map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
				// tri par ordre alphabétique
				.sorted().collect(Collectors.toList());
		// .forEach( System.out::println );
		assertThat(result, contains("Cachalot", "Chameau", "Chat"));
	}

	// Opérations intermédiaires

	// Stateless effectue un traitement sur les éléments du stream un à un sans
	// avoir à prendre en compte les autres éléments du stream.
	@Test
	public void whenStreamMapThenOperationIsStateless() {
		List<Client> clients = commandes.stream()//
				.map(c -> c.getClient())//
				.collect(Collectors.toList());
		assertThat(clients.get(0).getName(), Matchers.equalTo("Jean"));
		assertThat(clients.get(1).getName(), Matchers.equalTo("Jacques"));
		assertThat(clients.get(2).getName(), Matchers.equalTo("Jules"));
		assertThat(clients.get(3).getName(), Matchers.equalTo("Justin"));
		assertThat(clients.get(4).getName(), Matchers.equalTo("Justin"));
		assertThat(clients.size(), equalTo(5));
	}

	// Les opérations stateful quant à elles, ont généralement besoin de connaître
	// l’ensemble du stream pour donner un résultat (par exemple Stream.distinct ou
	// Stream.sorted).
	// Par conséquent, paralléliser un tel traitement risque bien souvent de baisser
	// nos performances au lieu de les améliorer.
	@Test
	public void whenStreamDistinctThenDeleteAllDuplicates() {
		List<Client> clients = commandes.stream()//
				.map(c -> c.getClient())//
				.distinct()//
				.collect(Collectors.toList());
		assertThat(clients.size(), equalTo(4));
	}

	// Opérations terminales

	// Nous disposons de deux types de réductions dans l’API Stream. Les opération
	// de réductions simples et les réductions mutables.

	// Les réductions simples sont celles auxquelles on pourrait penser en premier
	// lieu : La somme d’éléments (Stream.sum), le maximum (Stream.max), ou le
	// nombre d’éléments (Stream.count) sont des réductions simples. Dans sa forme
	// générale, elle se défini de la façon suivante :

}
