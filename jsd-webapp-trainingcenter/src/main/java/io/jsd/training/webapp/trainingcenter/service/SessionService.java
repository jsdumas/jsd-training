package io.jsd.training.webapp.trainingcenter.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.SessionDAO;
import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.model.Formation;
import io.jsd.training.webapp.trainingcenter.model.Session;

@Stateless
public class SessionService {
	
	@Inject
	private SessionDAO sessionDAO;
	
	//après la création de l'EJB : @PostConstruct /// avant la destruction de l'EJB : @Predistroy
		@PostConstruct
		public void init(){
			System.out.println("initialisation");
		}
		
		public Session save(Session session) throws ServiceException{
			try {
				return sessionDAO.save(session);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans SessionService : save ", e);
			}
		}
		
		public List<Session> findAll() throws ServiceException{
			try {
				return sessionDAO.findAll();
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans SessionService : findAll", e);
			}
		}
		
		
		public void delete(Session session) throws ServiceException{
			try {
				sessionDAO.remove(findById(session));
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans SessionService : delete", e);
			}
		}
		
		
		public Session update (Session session) throws ServiceException{
			try {
				sessionDAO.update(session);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans SessionService : update", e);
			}
			return session;
		}

		public Session findById(Session session) throws ServiceException{
			try {
				return sessionDAO.findById(session.getId());
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans SessionService : findById", e);
			}
		}
		
		public List<Session> findByFormation(Formation formation) throws ServiceException{
			try {
				return sessionDAO.findByFormation(formation);
			} catch (DAOException e) {
				throw new ServiceException ("Erreur dans SessionService : findByFormation", e);
			}
		}
		
		public void deleteDependanceFormation(Formation formation) throws ServiceException{
			List<Session> sessions = findByFormation(formation);
			for (Session s : sessions) {
				s.setFormation(null);
			}
		}

}
