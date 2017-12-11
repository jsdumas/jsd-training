package io.jsd.training.webapp.trainingcenter.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import io.jsd.training.webapp.trainingcenter.dao.entity.Personne;
import io.jsd.training.webapp.trainingcenter.dao.entity.Stagiaire;
import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.service.StagiaireService;



@ApplicationPath("rest")
@Path("stagiaire")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class StagiaireRessource extends Application{
	
	private Logger logger = Logger.getLogger(StagiaireRessource.class);

	@Inject
	private StagiaireService stagiaireService;
	
	@GET
	@Path("id/{id}")
	public Stagiaire getFromRestByID(@PathParam("id") Integer id) throws ServiceException{
		Stagiaire stagiaire = new Stagiaire();
		stagiaire.setId(id);
		return stagiaireService.find(stagiaire);
	}
	
	@GET //Sans path permet de récupérer toute la liste
	public List<Stagiaire> findAllFromRest() throws ServiceException{
		return stagiaireService.findAll();
	}
	
	@POST
	public Personne saveFromRest (Stagiaire stagiaire) throws ServiceException{
		return stagiaireService.save(stagiaire);
	}
	
	@DELETE
	@Path("id/{id}")
	public void deleteFromRest(@PathParam("id") Integer id) throws ServiceException{
		logger.debug("id :" + id);
		Stagiaire stagiaire = new Stagiaire();
		stagiaire.setId(id);
		stagiaireService.delete(stagiaire);
	}
	
	@PUT
//	@Path("id/{id}")
	public Personne updateFromRest (Stagiaire stagiaire) throws ServiceException{
//		Stagiaire stagiaire = stagiaireService.findById(id);
		return stagiaireService.update(stagiaire);
	}
}
