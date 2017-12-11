package io.jsd.training.webapp.trainingcenter.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;
import io.jsd.training.webapp.trainingcenter.dto.SessionDTO;
import io.jsd.training.webapp.trainingcenter.ejb.EvaluationService;
import io.jsd.training.webapp.trainingcenter.ejb.FormateurService;
import io.jsd.training.webapp.trainingcenter.ejb.FormationService;
import io.jsd.training.webapp.trainingcenter.ejb.ServiceException;
import io.jsd.training.webapp.trainingcenter.ejb.SessionService;

@ManagedBean(name = "dtSessionManagedBean")
@RequestScoped
public class SessionManagedBean {

	private Logger logger = Logger.getLogger(SessionManagedBean.class);

	private Session session;
	private ListDataModel<Session> sessions;
	private ListDataModel<Formation> formations;
	private List<String> formationIntitules;
	private SessionDTO sessionDTO;
	private Formation formation;
	private Formateur formateur;
	private List<String> ids;

	@Inject
	private SessionService sessionService;
	@Inject
	private FormateurService formateurService;
	@Inject
	private FormationService formationService;
	@Inject
	private EvaluationService evaluationService;

	@PostConstruct
	public void init() throws ServiceException {
		session = new Session();
		formation = new Formation();
		formateur = new Formateur();
		ids = new ArrayList<String>();

		sessions = new ListDataModel<Session>();
		// Mise à jour de la liste et retour de la liste
		sessions.setWrappedData(sessionService.findAll());

		sessionDTO = new SessionDTO();
		sessionDTO.setFormations(formationService.findAll());
		sessionDTO.setFormateurs(formateurService.findAll());

		logger.info(sessionDTO);
	}

	public String create() throws ServiceException {
		logger.info("FORMATION " + formation);
	

//		formation.setFormateurs(new ArrayList<Formateur>());

//		for (String id : ids) {
//			Formateur formateur = new Formateur();
//			formateur.setId(Integer.valueOf(id));
//			formateur = formateurService.findById(formateur);
//			formation.getFormateurs().add(formateur);
//		}

		if (session.getId() == null) {
			sessionService.save(session);
		} else {
			sessionService.update(session);
		}
		sessions.setWrappedData(sessionService.findAll());

		logger.info("FORMATION " + formation);

		return "list-session";
	}

	public String remove() throws ServiceException {
		session = sessions.getRowData();
		
//		evaluationService.deleteBySession(session);
		
		sessionService.delete(session);
		sessions.setWrappedData(sessionService.findAll());
		return "list-session";
	}

	// //GETTER SETTER
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public ListDataModel<Session> getSessions() {
		return sessions;
	}

	public void setSessions(ListDataModel<Session> sessions) {
		this.sessions = sessions;
	}

	public SessionDTO getSessionDTO() {
		return sessionDTO;
	}

	public void setSessionDTO(SessionDTO sessionDTO) {
		this.sessionDTO = sessionDTO;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public ListDataModel<Formation> getFormations() {
		return formations;
	}

	public void setFormations(ListDataModel<Formation> formations) {
		this.formations = formations;
	}

	public List<String> getFormationIntitules() {
		return formationIntitules;
	}

	public void setFormationIntitules(List<String> formationIntitules) {
		this.formationIntitules = formationIntitules;
	}

	public SessionService getSessionService() {
		return sessionService;
	}

	public void setSessionService(SessionService sessionService) {
		this.sessionService = sessionService;
	}

	public FormationService getFormationService() {
		return formationService;
	}

	public void setFormationService(FormationService formationService) {
		this.formationService = formationService;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

}
