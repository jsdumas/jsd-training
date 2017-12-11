package io.jsd.training.webapp.trainingcenter.ws;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.service.FormationService;

@WebService
public class FormationWS {

	@Inject
	private FormationService formationService;
	
	public Formation saveFormationFromWebService(Formation formation) throws ServiceException{
		return formationService.save(formation);
	}
}
