package io.jsd.training.java.framework.struts.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.java.framework.struts.dao.PersonneSpringDAO;
import io.jsd.training.java.framework.struts.dao.entity.Personne;
import io.jsd.training.java.framework.struts.exception.ServiceException;

@Service
public class PersonneService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PersonneSpringDAO personneSpringDAO;
	
	@Transactional
	public Personne save(Personne personne) throws ServiceException{
		try {
			return personneSpringDAO.save(personne);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de PersonneService save", e);
		}
	}
	
	public List<Personne> findAll() throws ServiceException {
		try {
			return personneSpringDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de PersonneService findAll", e);
		}
		
	}
	
	public Personne findValidUser(String username, String password) throws ServiceException {
		try {
			return personneSpringDAO.findValideUser(username, password);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de PersonneService findValidUser", e);
		}
	}
	
	
	
	public Personne findById(Integer id) throws ServiceException{
		try {
			return personneSpringDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de PersonneService findById", e);
		}
	}
	
	public List<Personne> findByName(String name) throws ServiceException{
		try {
			return personneSpringDAO.findByname(name);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de PersonneService findByName", e);
		}
	}
	
	@Transactional
	public void delete(Personne personne) throws ServiceException{
		
		try {
			personneSpringDAO.delete(personne);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de PersonneService deleteById", e);
		}
	}

}
