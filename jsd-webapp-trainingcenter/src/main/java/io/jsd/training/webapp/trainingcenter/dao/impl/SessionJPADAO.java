package io.jsd.training.webapp.trainingcenter.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import io.jsd.training.webapp.trainingcenter.dao.SessionDAO;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;
import io.jsd.training.webapp.trainingcenter.exception.DAOException;

@Stateless
public class SessionJPADAO extends GenericJPADAO<Session, Integer> implements SessionDAO{
	
	public SessionJPADAO() {
		super(Session.class);
		// TODO Auto-generated constructor stub
	}
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Session> findByFormation(Formation formation) throws DAOException {
		try{
			TypedQuery<Session> query = entityManager.createQuery("select s from Session s "
					+ " WHERE s.formation.id = :formationID", Session.class);
			query.setParameter("formationID", formation.getId());
			return query.getResultList();
		} catch (PersistenceException e){
			throw new DAOException("erreur dans methode findByFormation dans SessionJPADAP", e);
		}
	}

}
