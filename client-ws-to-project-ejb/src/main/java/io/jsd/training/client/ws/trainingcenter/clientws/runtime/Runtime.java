package io.jsd.training.client.ws.trainingcenter.clientws.runtime;

import io.jsd.training.client.ws.trainingcenter.clients.webservice.Formateur;
import io.jsd.training.client.ws.trainingcenter.clients.webservice.FormateurWS;
import io.jsd.training.client.ws.trainingcenter.clients.webservice.FormateurWSService;
import io.jsd.training.client.ws.trainingcenter.clients.webservice.Formation;
import io.jsd.training.client.ws.trainingcenter.clients.webservice.FormationWS;
import io.jsd.training.client.ws.trainingcenter.clients.webservice.FormationWSService;
import io.jsd.training.client.ws.trainingcenter.clients.webservice.ServiceException_Exception;


public class Runtime {

	public static void main(String[] args) throws ServiceException_Exception  {
		
		FormateurWSService formateurWSService = new FormateurWSService();
		FormateurWS port = formateurWSService.getPort(FormateurWS.class);
		
		Formateur formateur = new Formateur();
		formateur.setNom("Dimeo");
		formateur.setPrenom("Romuald");
		formateur.setEntreprise("Renault");
		formateur.setPoste("Chef d'atelier");
		
		formateur = port.saveFromWebService(formateur);
		
		
		FormationWSService formationWSService = new FormationWSService();
		FormationWS portFormation = formationWSService.getPort(FormationWS.class);
		
		Formation formation = new Formation();
//		io.jsd.training.client.ws.trainingcenter..clients.webservice.formation.Formateur formateur1 = new io.jsd.training.client.ws.trainingcenter..clients.webservice.formation.Formateur();
//		formateur1.setNom("bidon");
		formation.setDifficulte(5);
		formation.setDuree(5);
		formation.setIntitule("GWT");
		formation.getFormateurs().add(formateur);
		
		portFormation.saveFromWebService(formation);

	}

}
