package io.jsd.training.webapp.trainingcenter.javax.ws;

import javax.inject.Inject;
import javax.jws.WebService;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;
import io.jsd.training.webapp.trainingcenter.javax.ejb.FormateurService;
import io.jsd.training.webapp.trainingcenter.javax.ejb.ServiceException;

@WebService
public class FormateurWS {
	
	@Inject
	private FormateurService formateurService;
	
	public Formateur saveFormateurFromWebService(Formateur formateur) throws ServiceException{
		return formateurService.save(formateur);
	}

}
