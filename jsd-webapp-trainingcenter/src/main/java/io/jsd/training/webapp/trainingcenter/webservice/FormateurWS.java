package io.jsd.training.webapp.trainingcenter.webservice;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.model.Formateur;
import io.jsd.training.webapp.trainingcenter.service.FormateurService;

@WebService
public class FormateurWS {
	
	@Inject
	private FormateurService formateurService;
	
	public Formateur saveFormateurFromWebService(Formateur formateur) throws ServiceException{
		return formateurService.save(formateur);
	}

}
