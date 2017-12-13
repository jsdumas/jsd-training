package io.jsd.training.client.jms.trainingcenter.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Session implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
//	private Formateur formateur;
//	private Formation formation;
//	private List<Stagiaire> stagiaires;
	private Date dateDeDebut;
	private Date dateDeFin;
//	private List<Evaluation> evaluations;
	
	public Session() {
	}
//	public Session(Integer id, Formateur formateur, Formation formation,
//			List<Stagiaire> stagiaires, Date dateDeDebut, Date dateDeFin,
//			List<Evaluation> evaluations) {
//		super();
//		this.id = id;
//		this.formateur = formateur;
//		this.formation = formation;
//		this.stagiaires = stagiaires;
//		this.dateDeDebut = dateDeDebut;
//		this.dateDeFin = dateDeFin;
//		this.evaluations = evaluations;
//	}

	public Session(Integer id, Date dateDeDebut, Date dateDeFin) {
		super();
		this.id = id;
		this.dateDeDebut = dateDeDebut;
		this.dateDeFin = dateDeFin;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateDeDebut == null) ? 0 : dateDeDebut.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Session other = (Session) obj;
		if (dateDeDebut == null) {
			if (other.dateDeDebut != null)
				return false;
		} else if (!dateDeDebut.equals(other.dateDeDebut))
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

//	public Formateur getFormateur() {
//		return formateur;
//	}
//
//	public void setFormateur(Formateur formateur) {
//		this.formateur = formateur;
//	}
//
//	public Formation getFormation() {
//		return formation;
//	}
//
//	public void setFormation(Formation formation) {
//		this.formation = formation;
//	}
//
//	public List<Stagiaire> getStagiaires() {
//		return stagiaires;
//	}
//
//	public void setStagiaires(List<Stagiaire> stagiaires) {
//		this.stagiaires = stagiaires;
//	}

	public Date getDateDeDebut() {
		return dateDeDebut;
	}

	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}

	public Date getDateDeFin() {
		return dateDeFin;
	}

	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}

//	public List<Evaluation> getEvaluations() {
//		return evaluations;
//	}
//
//	public void setEvaluations(List<Evaluation> evaluations) {
//		this.evaluations = evaluations;
//	}

}
