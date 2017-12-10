package io.jsd.training.webapp.petclinic.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHEVAL")
public class Cheval extends Animal {


	private static final long serialVersionUID = 1L;

	public Cheval() {
		super();
	}

	public Cheval(String nom, Date dateDeNaissance) {
		super(nom, dateDeNaissance);
	}

	public Cheval(Integer id, String nom, Date dateDeNaissance, Proprietaire proprietaire) {
		super(id, nom, dateDeNaissance, proprietaire);
	}
	
	@Override
	public String getTypeLabel() {
		return "cheval";
	}

}