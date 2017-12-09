package io.jsd.training.webapp.trainingcenter.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import io.jsd.training.webapp.trainingcenter.dao.FormationDAO;
import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.model.Formateur;
import io.jsd.training.webapp.trainingcenter.model.Formation;
import io.jsd.training.webapp.trainingcenter.model.Session;

//Pool d'instance de variable sans état
@Stateless
public class FormationJPADAO extends GenericJPADAO<Formation, Integer> implements FormationDAO{

	public FormationJPADAO() {
		super(Formation.class);
		// TODO Auto-generated constructor stub
	}
		
		@PersistenceContext
		private EntityManager entityManager;
		
		@Override
		public List<Formation> findByFormateur(Formateur formateur) throws DAOException {
			try{
				TypedQuery<Formation> query = entityManager.createQuery("select f from Formation f "
						+ " WHERE f.formateurs.id = :formateurID", Formation.class);
				query.setParameter("formateurID", formateur.getId());
				return query.getResultList();
			} catch (PersistenceException e){
				throw new DAOException("erreur dans methode findByFormation dans SessionJPADAP", e);
			}
		}

	
	

}