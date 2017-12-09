package io.jsd.training.webapp.trainingcenter.dao.impl;

import javax.ejb.Stateless;

import io.jsd.training.webapp.trainingcenter.dao.FormateurDAO;
import io.jsd.training.webapp.trainingcenter.dao.FormationDAO;
import io.jsd.training.webapp.trainingcenter.model.Formateur;
import io.jsd.training.webapp.trainingcenter.model.Formation;

@Stateless
public class FormateurJPADAO extends GenericJPADAO<Formateur, Integer> implements FormateurDAO{

	public FormateurJPADAO() {
		super(Formateur.class);
		// TODO Auto-generated constructor stub
	}

}
