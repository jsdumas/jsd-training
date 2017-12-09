package io.jsd.training.webapp.trainingcenter.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formateur extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String entreprise;
	private String poste;
	
	
	public Formateur() {
		// TODO Auto-generated constructor stub
	}


	public Formateur(Integer id, String entreprise, String poste) {
		super();
		this.id = id;
		this.entreprise = entreprise;
		this.poste = poste;
	}


	@Override
	public String toString() {
		return "Formateur [id=" + id + ", entreprise=" + entreprise
				+ ", poste=" + poste + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((entreprise == null) ? 0 : entreprise.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formateur other = (Formateur) obj;
		if (entreprise == null) {
			if (other.entreprise != null)
				return false;
		} else if (!entreprise.equals(other.entreprise))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}


	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	
	
	
	
	
	
	
	

}