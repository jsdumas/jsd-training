package io.jsd.training.webapp.petclinic.spring.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.dao.entity.Vaccin;
import io.jsd.training.webapp.petclinic.dto.AnimalDTO;
import io.jsd.training.webapp.petclinic.spring.service.AnimalService;
import io.jsd.training.webapp.petclinic.spring.service.ProprietaireService;
import io.jsd.training.webapp.petclinic.spring.service.ServiceException;
import io.jsd.training.webapp.petclinic.spring.service.VaccinService;
import io.jsd.training.webapp.petclinic.utils.SaveFile;

@Controller
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	@Autowired
	private ProprietaireService proprietaireService;

	@Autowired
	private VaccinService vaccinService;

	Logger logger = LoggerFactory.getLogger(AnimalController.class);

	@RequestMapping("list.do")
	public ModelAndView listAnimal() {
		try {
			return new ModelAndView(//
					"list-animal", //
					"animals",//
					animalService.findAll()//
					);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "edit.do", method = GET)
	public ModelAndView initSaveAnimal() {
		AnimalDTO animalDTO = new AnimalDTO();

		try {
			animalDTO.setProprietaires(proprietaireService.findAll());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return new ModelAndView("edit-animal", "animalDTO", animalDTO);
	}

	@RequestMapping(value = "edit.do", method = POST)
	public ModelAndView saveAnimal(//
			HttpServletRequest request,//
			HttpServletResponse response,//
			@RequestParam("file") MultipartFile file, AnimalDTO animalDTO, BindingResult result//
			) {
		if (!result.hasErrors()) {
			Animal animal = animalDTO.newAnimal();
			try {
				animal.setProprietaire(proprietaireService.find(animalDTO.getProprietaireId()));
				animal = animalService.save(animal);

				if (!file.isEmpty()) {
					// Creating the directory to store file
					String rootPath = request.getServletContext().getRealPath("/");
					File dir = new File(rootPath + File.separator + "upload" + File.separator + "animal");
					if (!dir.exists())
						dir.mkdirs();
					// Create the file on server
					String serverFile = dir.getAbsolutePath() + File.separator
							+ animal.getId() + ".jpeg";
					logger.debug("File path " + serverFile);
					if (!SaveFile.handleFileUpload(file, serverFile))
						return new ModelAndView("edit-animal", "animalDTO",
								animalDTO);
				}

			} catch (ServiceException e) {
				e.printStackTrace();
			}

			return listAnimal();
		} else {
			return new ModelAndView("edit-animal", "animalDTO", animalDTO);
		}
	}

	@RequestMapping(value = "remove.do", method = GET)
	public ModelAndView removeAnimal(HttpServletRequest request,
			HttpServletResponse response, Integer id) {
		try {
			Animal animal = animalService.find(id);

			List<Vaccin> vaccins = vaccinService.findByAnimal(animal.getId());
			
			if (vaccins.size() != 0) {
				System.out.println("dans if");
				ModelAndView modelAndView = new ModelAndView("list-animal",
						"animals", animalService.findAll());
				modelAndView.addObject("msgErreur", "Impossible de supprimer un animal avec des vaccins!");
				return modelAndView;
			}

			String rootPath = request.getServletContext().getRealPath("/");
			String serverFile = rootPath + File.separator + "upload"
					+ File.separator + "animal" + File.separator
					+ animal.getId() + ".jpeg";

			animalService.remove(animal);
			File file = Paths.get(serverFile).toFile();

			if (file.exists()) {
				Files.delete(file.toPath());
			}
		} catch (ServiceException | IOException e) {
			try {
				animalService.remove(animalService.find(id));
			} catch (ServiceException e1) {
				e1.printStackTrace();
			}	
		}
		return listAnimal();

	}

	@RequestMapping(value = "update.do", method = GET)
	public ModelAndView initUpdateAnimal(Integer id) {
		try {
			AnimalDTO animalDTO = new AnimalDTO(animalService.find(id));
			animalDTO.setProprietaires(proprietaireService.findAll());
			return new ModelAndView("edit-animal", "animalDTO", animalDTO);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;

	}

}