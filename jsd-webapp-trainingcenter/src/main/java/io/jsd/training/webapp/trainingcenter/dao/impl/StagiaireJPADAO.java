package io.jsd.training.webapp.trainingcenter.dao.impl;

import javax.ejb.Stateless;

import io.jsd.training.webapp.trainingcenter.dao.StagiaireDAO;
import io.jsd.training.webapp.trainingcenter.model.Stagiaire;

@Stateless
public class StagiaireJPADAO extends GenericJPADAO<Stagiaire, Integer> implements StagiaireDAO{
	
	public StagiaireJPADAO() {
		super(Stagiaire.class);
		// TODO Auto-generated constructor stub
	}
}
