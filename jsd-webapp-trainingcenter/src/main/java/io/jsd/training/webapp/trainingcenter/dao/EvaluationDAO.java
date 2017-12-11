package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import javax.ejb.Stateless;

import io.jsd.training.webapp.trainingcenter.dao.entity.Evaluation;
import io.jsd.training.webapp.trainingcenter.dao.entity.EvaluationID;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;
import io.jsd.training.webapp.trainingcenter.exception.DAOException;

public interface EvaluationDAO extends GenericDAO<Evaluation, Integer> {
	
	List<Evaluation> findBySession(Session session) throws DAOException;
	void deleteBySession(Session session) throws DAOException;
//	Evaluation findByID(Integer sessionID, Integer stagiaireID) throws DAOException;
}
