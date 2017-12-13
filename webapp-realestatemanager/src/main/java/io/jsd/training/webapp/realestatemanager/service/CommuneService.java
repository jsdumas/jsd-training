package io.jsd.training.webapp.realestatemanager.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import io.jsd.training.webapp.realestatemanager.dao.CommuneDAO;
import io.jsd.training.webapp.realestatemanager.dao.entity.Commune;

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
