package io.jsd.training.webapp.trainingcenter.ws;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.dao.entity.Session;
import io.jsd.training.webapp.trainingcenter.service.ServiceException;
import io.jsd.training.webapp.trainingcenter.service.SessionService;

@WebService
public class SessionWS {
	
	@Inject
	private SessionService sessionService;
	
	public Session saveSessionFromWebService(Session session) throws ServiceException{
		return sessionService.save(session);
	}

}
