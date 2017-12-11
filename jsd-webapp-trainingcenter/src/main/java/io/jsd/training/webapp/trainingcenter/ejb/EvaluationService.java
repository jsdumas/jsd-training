package io.jsd.training.webapp.trainingcenter.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.DAOException;
import io.jsd.training.webapp.trainingcenter.dao.EvaluationDAO;
import io.jsd.training.webapp.trainingcenter.dao.entity.Evaluation;
import io.jsd.training.webapp.trainingcenter.dao.entity.EvaluationID;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;

@Stateless
public class EvaluationService {
	
	@Inject
	private EvaluationDAO evaluationDAO;
	
	//après la création de l'EJB : @PostConstruct /// avant la destruction de l'EJB : @Predistroy
			@PostConstruct
			public void init(){
				System.out.println("initialisation");
			}
			
			
			public Evaluation save(Evaluation evaluation) throws ServiceException{
				try {
					return evaluationDAO.save(evaluation);
				} catch (DAOException e) {
					throw new ServiceException ("Erreur dans EvaluationService : save ", e);
				}
			}
			
			public List<Evaluation> findAll() throws ServiceException{
				try {
					return evaluationDAO.findAll();
				} catch (DAOException e) {
					throw new ServiceException ("Erreur dans EvaluationService : findAll", e);
				}
			}
			
			
//			public void delete(Evaluation evaluation) throws ServiceException{
//				try {
//					evaluationDAO.remove(find(evaluation));
//				} catch (DAOException e) {
//					throw new ServiceException ("Erreur dans EvaluationService : delete", e);
//				}
//			}
			
			
			public Evaluation update (Evaluation evaluation) throws ServiceException{
				try {
					evaluationDAO.update(evaluation);
				} catch (DAOException e) {
					throw new ServiceException ("Erreur dans EvaluationService : update", e);
				}
				return evaluation;
			}

//			public Evaluation find(List<Evaluation> evaluations) throws ServiceException{
//				try {
//					return evaluationDAO.findByID(evaluation.getId().getSessionId(), evaluation.getId().getStagiaireId());
//				} catch (DAOException e) {
//					throw new ServiceException ("Erreur dans EvaluationService : findById", e);
//				}
//			}
			
			public List<Evaluation> findBySession(Session session) throws ServiceException{
				try {
					return evaluationDAO.findBySession(session);
				} catch (DAOException e) {
					throw new ServiceException ("Erreur dans SessionService : findByFormation", e);
				}
			}
			
			public void deleteBySession(Session session) throws ServiceException{
				try {
					evaluationDAO.deleteBySession(session);
				} catch (DAOException e) {
					throw new ServiceException ("Erreur dans SessionService : findByFormation", e);
				}
			}
			
			public void deleteDependanceSession(Session session) throws ServiceException{
				List<Evaluation> evaluations = findBySession(session);
				for (Evaluation e : evaluations) {
					e.setSession(null);
				}
			}

}
