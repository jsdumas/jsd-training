package io.jsd.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsd.training.entity.Team;

@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@GetMapping("/teams")
	public List<Team> getTeams() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setId(0l);
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);

		team = new Team();
		team.setId(1l);
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		return list;
	}

}
