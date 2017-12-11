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

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.service.AnimalService;


@Api(value = "animal", description = "Operations on the animals") // documentation
@RestController
@RequestMapping("/animal")
public class AnimalResource {
	@Autowired
	private AnimalService animalService;
	
	@ApiOperation(value = "Save a given animal")
	@RequestMapping(method = RequestMethod.POST)
	public Animal saveFromRest(Animal animal) throws ServiceException {
		return animalService.save(animal);
	}

	@ApiOperation(value = "Find an animal, knowing its id")
	@RequestMapping(method = RequestMethod.GET, value ="/id/{id}")
	public Animal findFromRest(@ApiParam(name="id", value="The id of the animal to be found", required=true) @PathVariable Integer id) throws ServiceException {
		return animalService.find(id);
	}

	@ApiOperation(value = "Find all the animals")
	@RequestMapping(method = RequestMethod.GET)
	List<Animal> findAllFromRest() throws ServiceException {
		return animalService.findAll();
	}
	
	@ApiOperation(value = "Update a given animal")
	@RequestMapping(method = RequestMethod.PUT)
	public Animal updateFromRest(Animal animal) throws ServiceException {
		return animalService.update(animal);
	}
	
	@ApiOperation(value = "Delete an animal, knowing its id")
	@RequestMapping(method = RequestMethod.DELETE, value ="/id/{id}")
	public void deleteFromRest(@ApiParam(name="id", value="The id of the animal to be deleted", required=true)@PathVariable Integer id) throws ServiceException {
		Animal animal = animalService.find(id);
		animalService.remove(animal);
	}
}