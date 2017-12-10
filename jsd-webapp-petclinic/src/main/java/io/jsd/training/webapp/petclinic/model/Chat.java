package io.jsd.training.webapp.petclinic.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHAT")
public class Chat extends Animal {


	private static final long serialVersionUID = 1L;

	public Chat() {
		super();
	}

	public Chat(String nom, Date dateDeNaissance) {
		super(nom, dateDeNaissance);
	}
	
	public Chat(Integer id, String nom, Date dateDeNaissance, Proprietaire proprietaire) {
		super(id, nom, dateDeNaissance, proprietaire);
	}
	
	@Override
	public String getTypeLabel() {
		return "chat";
	}


}