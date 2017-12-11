package io.jsd.training.webapp.trainingcenter.dto;

public class FormationDTO {
	
	private String intitule;
	private Integer duree;
	private Integer idFormateur;
	private Integer difficulte;
	
	public FormationDTO() {
		// TODO Auto-generated constructor stub
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

	public Integer getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(Integer idFormateur) {
		this.idFormateur = idFormateur;
	}

	public Integer getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(Integer difficulte) {
		this.difficulte = difficulte;
	}
	
	

}
