package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;

public interface SessionDAO extends GenericDAO<Session, Integer>{
	
	List<Session> findByFormation(Formation formation) throws DAOException;

}
