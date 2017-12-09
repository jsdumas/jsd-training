package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import javax.ejb.Stateless;

import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.model.Session;

public interface GenericDAO<T, K> {
	
	T save(T t) throws DAOException;
	T update(T t) throws DAOException;
	void remove(T t) throws DAOException;
	void removeById(K id) throws DAOException;
	T findById(K id) throws DAOException;
	List<T> findAll() throws DAOException;
}
