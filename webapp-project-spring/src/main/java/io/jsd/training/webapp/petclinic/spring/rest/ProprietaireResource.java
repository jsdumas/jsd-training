package io.jsd.training.webapp.petclinic.spring.rest;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;
import io.jsd.training.webapp.petclinic.spring.service.ProprietaireService;
import io.jsd.training.webapp.petclinic.spring.service.ServiceException;


@Api(value = "proprietaire", description = "Operations on the owners")
@RestController
@RequestMapping("/proprietaire")
public class ProprietaireResource {
	@Autowired
	private ProprietaireService proprietaireService;
	
	@ApiOperation(value = "Save a given owner")
	@RequestMapping(method = POST)
	public Proprietaire saveFromRest(Proprietaire proprietaire) throws ServiceException {
		return proprietaireService.save(proprietaire);
	}

	@ApiOperation(value = "Find an owner, knowing their id")
	@RequestMapping(//
			method = GET, //
			value ="/id/{id}")
	public Proprietaire findFromRest(//
			@ApiParam(name="id", value="The id of the owner to be found", required=true)//
			@PathVariable Integer id//
			) throws ServiceException {
		return proprietaireService.find(id);
	}

	@ApiOperation(value = "Find all the owners")
	@RequestMapping(method = GET)
	List<Proprietaire> findAllFromRest() throws ServiceException {
		return proprietaireService.findAll();
	}
	
	@ApiOperation(value = "Update a given owner")
	@RequestMapping(method = PUT)
	public Proprietaire updateFromRest(Proprietaire proprietaire) throws ServiceException {
		return proprietaireService.update(proprietaire);
	}
	
	@ApiOperation(value = "Delete an owner, knowing their id")
	@RequestMapping(//
			method = DELETE, //
			value ="/id/{id}")
	public void deleteFromRest(//
			@ApiParam(name="id", value="The id of the owner to be deleted", required=true)//
			@PathVariable Integer id//
			) throws ServiceException {
		Proprietaire proprietaire = new Proprietaire();
		proprietaire.setId(id);
		
		proprietaireService.remove(proprietaire);
	}
}