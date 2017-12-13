package io.jsd.training.webapp.trainingcenter.javax.ws;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.javax.ejb.FormationService;
import io.jsd.training.webapp.trainingcenter.javax.ejb.ServiceException;

@WebService
public class FormationWS {

	@Inject
	private FormationService formationService;
	
	public Formation saveFormationFromWebService(Formation formation) throws ServiceException{
		return formationService.save(formation);
	}
}
