package io.jsd.training.webapp.trainingcenter.dao.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Formation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String intitule;
	private Integer duree;
	@ManyToMany
	private List<Formateur> formateurs;
	private Integer difficulte;
	
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public Formation(Integer id, String intitule, Integer duree,
			List<Formateur> formateurs, Integer difficulte) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.duree = duree;
		this.formateurs = formateurs;
		this.difficulte = difficulte;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", intitule=" + intitule + ", duree="
				+ duree + ", difficulte=" + difficulte + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((intitule == null) ? 0 : intitule.hashCode());
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
		Formation other = (Formation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intitule == null) {
			if (other.intitule != null)
				return false;
		} else if (!intitule.equals(other.intitule))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

	public Integer getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(Integer difficulte) {
		this.difficulte = difficulte;
	}

}
