package io.jsd.training.webapp.realestatemanager.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.webapp.realestatemanager.dao.CommuneDAO;
import io.jsd.training.webapp.realestatemanager.dao.QuartierDAO;
import io.jsd.training.webapp.realestatemanager.dao.entity.Commune;
import io.jsd.training.webapp.realestatemanager.dao.entity.Logement;
import io.jsd.training.webapp.realestatemanager.dao.entity.Quartier;

@Service
public class CommuneService {
	
	@Autowired
	private CommuneDAO communeDAO;
	
	public List<Commune> findAll() throws ServiceException {
		try {
			return communeDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de CommuneService findAll", e);
		}
	}

}
