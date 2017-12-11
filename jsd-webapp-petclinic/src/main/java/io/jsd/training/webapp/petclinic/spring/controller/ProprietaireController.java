package io.jsd.training.webapp.petclinic.spring.controller;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;
import io.jsd.training.webapp.petclinic.service.AnimalService;
import io.jsd.training.webapp.petclinic.service.ProprietaireService;
import io.jsd.training.webapp.petclinic.service.ServiceException;
import io.jsd.training.webapp.petclinic.utils.SaveFile;

@Controller
@RequestMapping("/proprietaire")
public class ProprietaireController {
	
	@Autowired
	private ProprietaireService proprietaireService;
	
	@Autowired
	private AnimalService animalService;
	
	Logger logger = LoggerFactory.getLogger(ProprietaireController.class);
	
	@RequestMapping("list.do")
	public ModelAndView listProprietaire(){
		try {
			return new ModelAndView("list-proprietaire", "proprietaires", proprietaireService.findAll());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="edit.do", method=RequestMethod.GET)
    public ModelAndView initSaveProprietaire()
    {
       
        return new ModelAndView("edit-proprietaire", "proprietaire", new Proprietaire());
       
    }
   
    @RequestMapping( value="edit.do", method=RequestMethod.POST)
    public ModelAndView saveProprietaire(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile file, Proprietaire proprietaire, BindingResult result)
    {       
    	
        if(!result.hasErrors())
        {
        	
        	try {
				if(proprietaire.getId()==null) {
        			proprietaireService.save(proprietaire);
        		} else {
        			proprietaireService.update(proprietaire);
        		}
				
				if (!file.isEmpty()) {
					// Creating the directory to store file
					String rootPath = request.getServletContext().getRealPath(
							"/");
					File dir = new File(rootPath + File.separator + "upload"
							+ File.separator + "proprietaire");
					if (!dir.exists())
						dir.mkdirs();
					// Create the file on server
					String serverFile = dir.getAbsolutePath() + File.separator
							+ proprietaire.getId() + ".jpeg";
					logger.debug("File path " + serverFile);
					if (!SaveFile.handleFileUpload(file, serverFile))
						return new ModelAndView("edit-proprietaire",
								"proprietaire", proprietaire);
				}
				
				
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return listProprietaire();
        }
        else
            return new ModelAndView("edit-proprietaire", "proprietaire", proprietaire);
       
    }
    
	@RequestMapping(value="remove.do", method=RequestMethod.GET)
    public ModelAndView removeProprietaire(HttpServletRequest request, HttpServletResponse response, Integer id)
    {
     		try {
    			Proprietaire proprietaire = proprietaireService.find(id);
    			
    			List<Animal> animaux = animalService.findByProprietaire(id);
    			
    			if (animaux.size() != 0) {
    				System.out.println("dans if");
    				ModelAndView modelAndView = new ModelAndView("list-proprietaire", "proprietaires", proprietaireService.findAll());
    				modelAndView.addObject("msgErreur1", "Impossible de supprimer un proprietaire avec des animaux!");
    				return modelAndView;
    			}
    			
    			
    			String rootPath = request.getServletContext().getRealPath("/");
    	        String serverFile = rootPath + File.separator + "upload" + File.separator + "proprietaire"
    	                + File.separator + proprietaire.getId() + ".jpeg";
    			
				proprietaireService.remove(proprietaire);
				
				File file = Paths.get(serverFile).toFile();
    	        
    	        if(file.exists())
    	        {
    	        	Files.delete(file.toPath());
    	        }
    	        
			} catch (ServiceException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		            
     		return listProprietaire();
    }
    
    @RequestMapping(value="update.do", method=RequestMethod.GET)
    public ModelAndView initUpdateProprietaire(Integer id)
    {
            try {
            	logger.debug(proprietaireService.find(id).toString());
				return new ModelAndView("edit-proprietaire", "proprietaire", proprietaireService.find(id));
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
            
    }
}
