package io.jsd.training.webapp.petclinic.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("CHIEN")
public class Chien extends Animal {


	private static final long serialVersionUID = 1L;

	public Chien() {
		super();
	}

	public Chien(String nom, Date dateDeNaissance) {
		super(nom, dateDeNaissance);
	}

	public Chien(Integer id, String nom, Date dateDeNaissance, Proprietaire proprietaire) {
		super(id, nom, dateDeNaissance, proprietaire);
	} 
	@Override
	public String getTypeLabel() {
		return "chien";
	}

}
