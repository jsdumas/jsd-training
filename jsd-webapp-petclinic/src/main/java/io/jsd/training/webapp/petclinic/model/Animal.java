package io.jsd.training.webapp.petclinic.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ANIMAL_TYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("ANIMAL")

public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nom;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateDeNaissance;

	@ManyToOne
	@JoinColumn(nullable=false)
	private Proprietaire proprietaire;
	
	public String getTypeLabel() {
		return "animal";
	}

	public Animal() {
		super();
	}

	public Animal(String nom, Date dateDeNaissance) {
		super();
		this.nom = nom;
		this.dateDeNaissance = dateDeNaissance;
	}

	public Animal(Integer id, String nom, Date dateDeNaissance, Proprietaire proprietaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateDeNaissance = dateDeNaissance;
		this.proprietaire=proprietaire;
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

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateDeNaissance == null) ? 0 : dateDeNaissance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime
				* result
				+ ((proprietaire.getId() == null) ? 0 : proprietaire.getId()
						.hashCode());
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
		Animal other = (Animal) obj;
		if (dateDeNaissance == null) {
			if (other.dateDeNaissance != null)
				return false;
		} else if (!dateDeNaissance.equals(other.dateDeNaissance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (proprietaire.getId() == null) {
			if (other.proprietaire.getId() != null)
				return false;
		} else if (proprietaire.getId() != other.proprietaire.getId())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", dateDeNaissance="
				+ dateDeNaissance + ", id_proprietaire=" + proprietaire.getId()
				+ ", type=" + getClass().getSimpleName() + "]";
	}

}
