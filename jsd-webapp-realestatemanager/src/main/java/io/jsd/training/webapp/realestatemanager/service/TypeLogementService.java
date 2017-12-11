package io.jsd.training.webapp.realestatemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import io.jsd.training.webapp.realestatemanager.dao.TypeLogementDAO;
import io.jsd.training.webapp.realestatemanager.exception.ServiceException;
import io.jsd.training.webapp.realestatemanager.model.Individu;
import io.jsd.training.webapp.realestatemanager.model.TypeLogement;

@Service
public class TypeLogementService {
	
	@Autowired
	private TypeLogementDAO typeLogementDAO;
	
	public List<TypeLogement> findAll() throws ServiceException {
		try {
			return typeLogementDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de TypeLogementService findAll", e);
		}
	}
	
	public TypeLogement findOne(Integer id) throws ServiceException{
		try {
			return typeLogementDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de TypeLogementService findOne", e);
		}
	} 

}
