package io.jsd.training.webapp.trainingcenter.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.DAOException;
import io.jsd.training.webapp.trainingcenter.dao.FormateurDAO;
import io.jsd.training.webapp.trainingcenter.dao.FormationDAO;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;

@Stateless
public class FormateurService {

	
	@Inject
	private FormateurDAO formateurDAO;
	@Inject
	private FormationService formationService;

	
	
	//après la création de l'EJB : @PostConstruct /// avant la destruction de l'EJB : @Predistroy
		@PostConstruct
		public void init(){
			System.out.println("initialisation");
		}
		
		public Formateur save(Formateur formateur) throws ServiceException{
			try {
				return formateurDAO.save(formateur);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans FormateurService : save ", e);
			}
		}
		
		public List<Formateur> findAll() throws ServiceException{
			try {
				return formateurDAO.findAll();
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans FormateurService : findAll", e);
			}
		}
		
		public void delete(Formateur formateur) throws ServiceException{
			formationService.deleteDependanceFormateur(formateur);
			try {
				formateurDAO.remove(find(formateur));
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans FormateurService : delete", e);
			}
		}
		
		public Formateur update (Formateur formateur) throws ServiceException{
			try {
				formateurDAO.update(formateur);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans FormateurService : update", e);
			}
			return formateur;
		}

		public Formateur findById(Integer id) throws ServiceException{
			try {
				return formateurDAO.findById(id);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans FormateurService : findById", e);
			}
		}
		
		public Formateur find(Formateur formateur) throws ServiceException{
			try {
				return formateurDAO.findById(formateur.getId());
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans FormateurService : findById", e);
			}
		}
	
}
