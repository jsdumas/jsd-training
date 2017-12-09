package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import javax.ejb.Stateless;

import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.model.Evaluation;
import io.jsd.training.webapp.trainingcenter.model.EvaluationID;
import io.jsd.training.webapp.trainingcenter.model.Formation;
import io.jsd.training.webapp.trainingcenter.model.Session;

public interface EvaluationDAO extends GenericDAO<Evaluation, Integer> {
	
	List<Evaluation> findBySession(Session session) throws DAOException;
	void deleteBySession(Session session) throws DAOException;
//	Evaluation findByID(Integer sessionID, Integer stagiaireID) throws DAOException;
}
