package io.jsd.training.webapp.trainingcenter.webservice;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.model.Session;
import io.jsd.training.webapp.trainingcenter.service.SessionService;

@WebService
public class SessionWS {
	
	@Inject
	private SessionService sessionService;
	
	public Session saveSessionFromWebService(Session session) throws ServiceException{
		return sessionService.save(session);
	}

}
