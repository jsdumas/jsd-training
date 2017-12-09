package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.model.Formation;
import io.jsd.training.webapp.trainingcenter.model.Session;

public interface SessionDAO extends GenericDAO<Session, Integer>{
	
	List<Session> findByFormation(Formation formation) throws DAOException;

}
