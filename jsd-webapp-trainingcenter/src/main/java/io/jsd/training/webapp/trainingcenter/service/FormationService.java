package io.jsd.training.webapp.trainingcenter.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.FormationDAO;
import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.model.Formateur;
import io.jsd.training.webapp.trainingcenter.model.Formation;
import io.jsd.training.webapp.trainingcenter.model.Session;

@Stateless
public class FormationService {

	@Inject
	private FormationDAO formationDAO;
	@Inject
	private FormateurService formateurService;
	@Inject
	private SessionService sessionService;

	// après la création de l'EJB : @PostConstruct /// avant la destruction de
	// l'EJB : @Predistroy
	@PostConstruct
	public void init() {
		System.out.println("initialisation");
	}

	public Formation save(Formation formation) throws ServiceException {
		for (Formateur f : formation.getFormateurs()) {
			f = formateurService.update(f);

		}

		try {
			return formationDAO.save(formation);
		} catch (DAOException e) {
			throw new ServiceException("Erreur dans FormationService : save ",
					e);
		}
	}

	public List<Formation> findAll() throws ServiceException {
		try {
			return formationDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException(
					"Erreur dans FormationService : findAll", e);
		}
	}

	public void delete(Formation formation) throws ServiceException {
		sessionService.deleteDependanceFormation(formation);
		
		try {
			formationDAO.remove(find(formation));
		} catch (DAOException e) {
			throw new ServiceException("Erreur dans FormationService : delete",
					e);
		}
	}

	public Formation update(Formation formation) throws ServiceException {
		try {
			formationDAO.update(formation);
		} catch (DAOException e) {
			throw new ServiceException("Erreur dans FormationService : update",
					e);
		}
		return formation;
	}

	public Formation find(Formation formation) throws ServiceException {
		try {
			return formationDAO.findById(formation.getId());
		} catch (DAOException e) {
			throw new ServiceException(
					"Erreur dans FormationService : findById", e);
		}
	}
	
	
	public List<Formation> findByFormateur(Formateur formateur) throws ServiceException{
		try {
			return formationDAO.findByFormateur(formateur);
		} catch (DAOException e) {
			throw new ServiceException ("Erreur dans FormationService : findByFormateur", e);
		}
	}
	
	
	public void deleteDependanceFormateur(Formateur formateur) throws ServiceException{
		List<Formation> formations = findByFormateur(formateur);
		for (Formation f : formations) {
			if(f.getFormateurs().contains(formateur)){
				f.getFormateurs().remove(formateur);
				this.update(f);
			}
		}
	}
	

}
