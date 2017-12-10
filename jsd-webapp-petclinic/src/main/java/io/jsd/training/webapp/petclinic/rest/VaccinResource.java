package io.jsd.training.webapp.petclinic.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.model.Vaccin;
import io.jsd.training.webapp.petclinic.service.VaccinService;


@Api(value = "vaccin", description = "Operations on the vaccines") // documentation
@RestController
@RequestMapping("/vaccin")
public class VaccinResource {
	@Autowired
	private VaccinService vaccinService;
	
	@ApiOperation(value = "Save a given vaccine")
	@RequestMapping(method = RequestMethod.POST)
	public Vaccin saveFromRest(Vaccin vaccin) throws ServiceException {
		return vaccinService.save(vaccin);
	}

	@ApiOperation(value = "Find a vaccine, knowing its id")
	@RequestMapping(method = RequestMethod.GET, value ="/id/{id}")
	public Vaccin findFromRest(@ApiParam(name="id", value="The id of the vaccine to be found", required=true) @PathVariable Integer id) throws ServiceException {
		return vaccinService.find(id);
	}

	@ApiOperation(value = "Find all the vaccines")
	@RequestMapping(method = RequestMethod.GET)
	List<Vaccin> findAllFromRest() throws ServiceException {
		return vaccinService.findAll();
	}
	
	@ApiOperation(value = "Update a given vaccine")
	@RequestMapping(method = RequestMethod.PUT)
	public Vaccin updateFromRest(Vaccin vaccin) throws ServiceException {
		return vaccinService.update(vaccin);
	}
	
	@ApiOperation(value = "Delete a vaccine, knowing its id")
	@RequestMapping(method = RequestMethod.DELETE, value ="/id/{id}")
	public void deleteFromRest(@ApiParam(name="id", value="The id of the vaccine to be deleted", required=true)@PathVariable Integer id) throws ServiceException {
		Vaccin vaccin = new Vaccin();
		vaccin.setId(id);
		
		vaccinService.remove(vaccin);
	}
}