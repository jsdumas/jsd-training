package io.jsd.training.webapp.petclinic.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.dao.entity.Chat;
import io.jsd.training.webapp.petclinic.dao.entity.Cheval;
import io.jsd.training.webapp.petclinic.dao.entity.Chien;
import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;
import io.jsd.training.webapp.petclinic.dao.entity.Tortue;

public class AnimalDTO {
	private String type;
	
	private Integer id;
	private String nom;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateDeNaissance;
	private List<Proprietaire> proprietaires;
	private Integer proprietaireId;
	
	public AnimalDTO() {

	}
	
	public AnimalDTO(Animal animal) {
		this.type = animal.getTypeLabel();
		
		this.id = animal.getId();
		this.nom = animal.getNom();
		this.dateDeNaissance = animal.getDateDeNaissance();
		if (animal.getProprietaire() != null) this.proprietaireId = animal.getProprietaire().getId();
	}

	public Animal newAnimal() {
		Animal res = null;
		
		switch (this.type) {
		case "chat":
			res = new Chat();
			break;
		case "cheval":
			res = new Cheval();
			break;
		case "chien":
			res = new Chien();
			break;
		default:
			res = new Tortue();
			break;
		}
		
		res.setId(id);
		res.setNom(nom);
		res.setDateDeNaissance(dateDeNaissance);
		
		return res;
	}
	
	public List<Proprietaire> getProprietaires() {
		return proprietaires;
	}

	public void setProprietaires(List<Proprietaire> proprietaires) {
		this.proprietaires = proprietaires;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public Integer getProprietaireId() {
		return proprietaireId;
	}

	public void setProprietaireId(Integer proprietaireId) {
		this.proprietaireId = proprietaireId;
	}
}
