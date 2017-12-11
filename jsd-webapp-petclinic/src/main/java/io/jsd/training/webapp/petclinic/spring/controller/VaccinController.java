package io.jsd.training.webapp.petclinic.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.dao.entity.Vaccin;
import io.jsd.training.webapp.petclinic.dto.VaccinDTO;
import io.jsd.training.webapp.petclinic.service.AnimalService;
import io.jsd.training.webapp.petclinic.service.ServiceException;
import io.jsd.training.webapp.petclinic.service.VaccinService;

@Controller
@RequestMapping("/vaccin")
public class VaccinController {

	@Autowired
	private VaccinService vaccinService;
	@Autowired
	private AnimalService animalService;

	Logger logger = LoggerFactory.getLogger(VaccinController.class);

	@RequestMapping("list.do")
	public ModelAndView listVaccin() {
		try {
			return new ModelAndView("list-vaccin", "vaccins", vaccinService.findAll());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value="edit.do", method=RequestMethod.GET)
	public ModelAndView initSaveVaccin() {
		VaccinDTO vaccinDTO = new VaccinDTO();

		try {
			vaccinDTO.setAnimals(animalService.findAll());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ModelAndView("edit-vaccin", "vaccinDTO", vaccinDTO);
	}

	@RequestMapping(value="edit.do", method=RequestMethod.POST)
	public ModelAndView saveVaccin(VaccinDTO vaccinDTO, BindingResult result)
	{       
		if(!result.hasErrors())
		{

			Vaccin vaccin = vaccinDTO.newVaccin();

			try {
				vaccin.setAnimal(animalService.find(vaccinDTO.getAnimalId()));
				vaccinService.save(vaccin);
			} catch (ServiceException e) {
				e.printStackTrace();
			}

			return listVaccin();
		}
		else {
			return new ModelAndView("edit-vaccin", "vaccinDTO", vaccinDTO);
		}
	}

	@RequestMapping(value="remove.do", method=RequestMethod.GET)
	public ModelAndView removePersonne(Integer id)
	{
		try {
			vaccinService.remove(vaccinService.find(id));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return listVaccin();
	}

	@RequestMapping(value="update.do", method=RequestMethod.GET)
	public ModelAndView initUpdateVaccin(Integer id)
	{
		try {
			VaccinDTO vaccinDTO = new VaccinDTO(vaccinService.find(id));
			vaccinDTO.setAnimals(animalService.findAll());
			return new ModelAndView("edit-vaccin", "vaccinDTO", vaccinDTO);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public ModelAndView updateVaccin(VaccinDTO vaccinDTO, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try {
				vaccinService.save(vaccinDTO.newVaccin());
			} catch (ServiceException e) {
				e.printStackTrace();
			}
			return listVaccin();
		}
		else
			return new ModelAndView("edit-vaccin", "vaccinDTO", vaccinDTO);

	}



}
