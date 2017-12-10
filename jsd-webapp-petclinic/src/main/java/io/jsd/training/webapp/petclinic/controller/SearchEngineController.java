package io.jsd.training.webapp.petclinic.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.model.Animal;
import io.jsd.training.webapp.petclinic.service.AnimalService;

@Controller
@RequestMapping("/search-engine")
public class SearchEngineController {

	@Autowired
	private AnimalService animalService;

	Logger logger = LoggerFactory.getLogger(SearchEngineController.class);

	@RequestMapping(value = "search-animal.do", method = RequestMethod.GET)
	public ModelAndView initAnimalSearchEngine() {

		try {
			return new ModelAndView("search-animal", "animals",
					animalService.findAll());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "ajaxListingNomProp.do", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<Animal> listingByNomProp(@RequestParam ("nom_proprietaire") String nomProp) {
		try {
			logger.debug("controller ajax");
			List<Animal> findAllNomProprietaire = animalService
					.findAllNomProprietaire(nomProp);
			logger.debug(findAllNomProprietaire.toString());
			return findAllNomProprietaire;
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	@RequestMapping(value = "ajaxListingTypeAnim.do", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<Animal> listingByTypeAnim(@RequestParam ("type_animal") String typeAnim) {
		try {
			logger.debug("controller ajax");
			List<Animal> findAllTypeAnimal = animalService
					.findAllTypeAnimal(typeAnim);
			logger.debug(findAllTypeAnimal.toString());
			return findAllTypeAnimal;
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	@RequestMapping(value = "ajaxListingAgeAnim.do", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<Animal> listingByAgeAnim(@RequestParam ("age_animal") Integer ageAnim) {
		try {
			logger.debug("controller ajax");
			List<Animal> findAllAgeAnimal = animalService
					.findAllAgeAnimal(ageAnim);
			return findAllAgeAnimal;
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
