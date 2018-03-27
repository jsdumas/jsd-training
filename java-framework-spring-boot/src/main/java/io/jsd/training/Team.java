package io.jsd.training;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author jsdumas
 *
 */
@Entity
public class Team {

	private Long idTeam;
	private String name;
	private String location;
	private String mascot;
	private Set<Player> players;

	@Id
	@GeneratedValue
	public Long getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Long idTeam) {
		this.idTeam = idTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Player.class)
	@JoinColumn(name = "id")
	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}
