package io.jsd.training.webapp.petclinic.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.dao.entity.Vaccin;

public class VaccinDTO {
	
	private Integer id;
	private String type;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date inoculation;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date rappel;
	private List<Animal> animals;
	
	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	private Integer animalId;
	
	public VaccinDTO() {}
	
	public VaccinDTO(Vaccin vaccin) {
		this.id = vaccin.getId();
		this.type = vaccin.getType();
		this.inoculation = vaccin.getInoculation();
		this.rappel = vaccin.getRappel();
		
		if (vaccin.getAnimal() != null) this.animalId = vaccin.getAnimal().getId();
	}
	
	public Vaccin newVaccin() {
		return new Vaccin(id, type, inoculation, rappel);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getInoculation() {
		return inoculation;
	}

	public void setInoculation(Date inoculation) {
		this.inoculation = inoculation;
	}

	public Date getRappel() {
		return rappel;
	}

	public void setRappel(Date rappel) {
		this.rappel = rappel;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}
	
}
