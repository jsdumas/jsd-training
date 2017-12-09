package io.jsd.training.webapp.trainingcenter.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.jsd.training.webapp.trainingcenter.model.Formateur;
import io.jsd.training.webapp.trainingcenter.model.Formation;

public class SessionDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	private List<Formation> formations;
	private List<Formateur> formateurs;
	private Date dateDeDebut;
	private Date dateDeFin;
	


	public SessionDTO() {
		
	}
	
	


	@Override
	public String toString() {
		return "SessionDTO [formations=" + formations + ", formateurs="
				+ formateurs + ", dateDeDebut=" + dateDeDebut + ", dateDeFin="
				+ dateDeFin + "]";
	}




	public List<Formation> getFormations() {
		return formations;
	}


	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public List<Formateur> getFormateurs() {
		return formateurs;
	}


	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}


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

	
	

}
