package io.jsd.training.webapp.trainingcenter.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.DAOException;
import io.jsd.training.webapp.trainingcenter.dao.StagiaireDAO;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;
import io.jsd.training.webapp.trainingcenter.dao.entity.Stagiaire;

@Stateless
public class StagiaireService {
	
	@Inject
	private StagiaireDAO stagiaireDAO;
	
	//après la création de l'EJB : @PostConstruct /// avant la destruction de l'EJB : @Predistroy
		@PostConstruct
		public void init(){
			System.out.println("initialisation");
		}
		
		public Stagiaire save(Stagiaire stagiaire) throws ServiceException{
			try {
				return stagiaireDAO.save(stagiaire);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans StagiaireService : save ", e);
			}
		}
		
		public List<Stagiaire> findAll() throws ServiceException{
			try {
				return stagiaireDAO.findAll();
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans StagiaireService : findAll", e);
			}
		}
		
		
		
		public void delete(Stagiaire stagiaire) throws ServiceException{
			try {
				stagiaireDAO.remove(find(stagiaire));
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans StagiaireService : delete", e);
			}
		}
		
		
		public Stagiaire update (Stagiaire stagiaire) throws ServiceException{
			try {
				stagiaireDAO.update(stagiaire);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans StagiaireService : update", e);
			}
			return stagiaire;
		}

		public Stagiaire findById(Integer id) throws ServiceException{
			try {
				return stagiaireDAO.findById(id);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans StagiaireService : findById", e);
			}
		}
		
		public Stagiaire find(Stagiaire stagiaire) throws ServiceException{
			try {
				return stagiaireDAO.findById(stagiaire.getId());
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans StagiaireService : findById", e);
			}
		}

}
