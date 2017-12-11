package io.jsd.training.webapp.trainingcenter.ws;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.ejb.FormationService;
import io.jsd.training.webapp.trainingcenter.ejb.ServiceException;

@WebService
public class FormationWS {

	@Inject
	private FormationService formationService;
	
	public Formation saveFormationFromWebService(Formation formation) throws ServiceException{
		return formationService.save(formation);
	}
}
