package io.jsd.training.webapp.petclinic.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TORTUE")
public class Tortue extends Animal {


	private static final long serialVersionUID = 1L;

	public Tortue() {
		super();
	}

	public Tortue(String nom, Date dateDeNaissance) {
		super(nom, dateDeNaissance);
	}
	
	public Tortue(Integer id, String nom, Date dateDeNaissance, Proprietaire proprietaire) {
		super(id, nom, dateDeNaissance, proprietaire);
	}

	@Override
	public String getTypeLabel() {
		return "tortue";
	}

}