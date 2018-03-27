package io.jsd.training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration | @EnableAutoConfiguration | @ComponentScan
// @ComponentScan(basePackages = { "io.jsd.training" })
// @EntityScan(basePackages = { "io.jsd.training.entity" })
// @EnableJpaRepositories(basePackages = { "io.jsd.training.repository" })
public class Application {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<Team>();

		Player player1 = new Player();
		// player1.setId(0L);
		player1.setName("Big Easy");
		player1.setPosition("Showman");
		Player player2 = new Player();
		// player2.setId(1L);
		player2.setName("Buckets");
		player2.setPosition("Guard");
		Player player3 = new Player();
		// player3.setId(2L);
		player3.setName("Dizzy");
		player3.setPosition("Guard");

		Set<Player> players = new HashSet<Player>();
		players.add(player1);
		players.add(player2);
		players.add(player3);

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		team.setPlayers(players);
		list.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		teamRepository.saveAll(list);
	}

}
