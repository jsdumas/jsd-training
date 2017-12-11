package io.jsd.training.webapp.trainingcenter.javax.jsf;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.jboss.logging.Logger;
import io.jsd.training.webapp.trainingcenter.dao.entity.Evaluation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.javax.ejb.EvaluationService;
import io.jsd.training.webapp.trainingcenter.javax.ejb.ServiceException;

@ManagedBean(name = "dtEvaluationManagedBean")
@RequestScoped
public class EvaluationManagedBean {

	private Logger logger = Logger.getLogger(EvaluationManagedBean.class);

	private Evaluation evaluation;
	private ListDataModel<Evaluation> evaluations;
	private List<String> formationIntitules;
	private Formation formation;


	@Inject
	private EvaluationService evaluationService;


	@PostConstruct
	public void init() throws ServiceException {
		evaluation = new Evaluation();
		evaluations = new ListDataModel<Evaluation>();
		// Mise à jour de la liste et retour de la liste
		evaluations.setWrappedData(evaluationService.findAll());

	}

//	public String create() throws ServiceException {
//		logger.info("FORMATION " + formation);
//
//		if (session.getId() == null) {
//			sessionService.save(session);
//		} else {
//			sessionService.update(session);
//		}
//		sessions.setWrappedData(sessionService.findAll());
//
//		logger.info("FORMATION " + formation);
//
//		return "list-session";
//	}
//
//	public String remove() throws ServiceException {
//		session = sessions.getRowData();
//		
//		evaluationService.deleteBySession(session);
//		
////		sessionService.delete(session);
//		sessions.setWrappedData(sessionService.findAll());
//		return "list-session";
//	}

	// //GETTER SETTER
	public Evaluation getEvaluation() {
		return evaluation;
	}


	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}


	public ListDataModel<Evaluation> getEvaluations() {
		return evaluations;
	}


	public void setEvaluations(ListDataModel<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

}
