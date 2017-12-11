package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import io.jsd.training.webapp.trainingcenter.dao.entity.Evaluation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;

@Stateless
public class EvaluationJPADAO extends GenericJPADAO<Evaluation, Integer>
		implements EvaluationDAO {

	public EvaluationJPADAO() {
		super(Evaluation.class);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext
	private EntityManager entityManager;
	

//	public Evaluation findByID(Integer sessionID,
//			Integer stagiaireID) throws DAOException {
//		try {
//			TypedQuery<Evaluation> query = entityManager
//					.createQuery(
//							"SELECT e FROM Evaluation e "
//							+ "LEFT JOIN e.id id "
//							+ "WHERE id.sessionId = :sessionID AND id.stagiaireId = :stagiaireID",
//							Evaluation.class);
//			
//			query.setParameter("sessionID", sessionID);
//			query.setParameter("stagiaireID", stagiaireID);
//			return query.getSingleResult();
//			
//		} catch (PersistenceException e) {
//			throw new DAOException(
//					"erreur dans methode findByEvaluationID de EvaluationID", e);
//		}
//	}

	public List<Evaluation> findBySession(Session session) throws DAOException {
		try {
			TypedQuery<Evaluation> query = entityManager.createQuery(
					"SELECT e FROM Evaluation e "
					+ "LEFT JOIN e.id id "
					+ "WHERE id.sessionId = :sessionID",
					Evaluation.class);
			query.setParameter("sessionID", session.getId());
			return query.getResultList();
		} catch (PersistenceException e) {
			throw new DAOException(
					"erreur dans methode findBySession dans SessionJPADAP", e);
		}
	}
	
	public void deleteBySession(Session session) throws DAOException {
		try {
			Query query = entityManager.createQuery(
					"DELETE FROM Evaluation e "
					+ "WHERE e.id.sessionId = :sessionID");
			query.setParameter("sessionID", session.getId());
		} catch (PersistenceException e) {
			throw new DAOException(
					"erreur dans methode findBySession dans SessionJPADAP", e);
		}
	}
	

}
