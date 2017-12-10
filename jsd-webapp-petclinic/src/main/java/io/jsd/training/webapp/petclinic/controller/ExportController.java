package io.jsd.training.webapp.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.dto.ExportDTO;
import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.service.AnimalService;
import io.jsd.training.webapp.petclinic.service.ProprietaireService;

@Controller
@RequestMapping("/export")
public class ExportController {

	@Autowired
	private AnimalService animalService;

	@Autowired
	private ProprietaireService proprietaireService;

	@RequestMapping(value = "export.do", method = RequestMethod.GET)
	public ModelAndView exportAnimal() {
		ExportDTO exportDTO = new ExportDTO();
		return new ModelAndView("export", "exportDTO", exportDTO);
	}

	@RequestMapping(value = "export.do", method = RequestMethod.POST)
	public ModelAndView exportAnimalToDirectory(Model model,
			@ModelAttribute("exportDTO") ExportDTO exportDTO,
			BindingResult result) {

		ExportDTOValidator exportDTOValidator = new ExportDTOValidator();
		exportDTOValidator.validate(exportDTO, result);

		if (result.hasErrors()) {
			return new ModelAndView("export", "exportDTO", exportDTO);
		}

		String choice = exportDTO.getChoice();
		Integer resultNumber = Integer.parseInt(exportDTO.getResultNumber());
		switch (choice) {
		case "Animal":
			animalService.downloadExportedFile(resultNumber);
			break;

		case "Proprietaire":
			proprietaireService.downloadExportedFile(resultNumber);
			break;
		default:
			break;
		}

		return new ModelAndView("export", "exportDTO", exportDTO);
	}
}
