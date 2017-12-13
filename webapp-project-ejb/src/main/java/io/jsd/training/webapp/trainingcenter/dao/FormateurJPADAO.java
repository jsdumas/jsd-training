package io.jsd.training.webapp.trainingcenter.dao;

import javax.ejb.Stateless;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;

@Stateless
public class FormateurJPADAO extends GenericJPADAO<Formateur, Integer> implements FormateurDAO{

	public FormateurJPADAO() {
		super(Formateur.class);
		// TODO Auto-generated constructor stub
	}

}
