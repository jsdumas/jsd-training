package io.jsd.training.webapp.trainingcenter.javax.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;
import io.jsd.training.webapp.trainingcenter.dto.FormationDTO;
import io.jsd.training.webapp.trainingcenter.javax.ejb.FormateurService;
import io.jsd.training.webapp.trainingcenter.javax.ejb.FormationService;
import io.jsd.training.webapp.trainingcenter.javax.ejb.ServiceException;

@ManagedBean (name="dtFormationManagedBean")
//@ViewScoped
public class FormationManagedBean {
	
	private Formation formation;
	private ListDataModel<Formation> formations;
	private List<Formateur> formateurs;
	private Formateur formateur;
	private FormationDTO formationDTO;
	private List<String> idFormateurs;
	
	@Inject
	private FormationService formationService;
	@Inject
	private FormateurService formateurService;
	
	private Logger logger = Logger.getLogger(FormationManagedBean.class);
	
	@PostConstruct
	public void init() throws ServiceException{
		formation = new Formation();
		formations = new ListDataModel<Formation>();
		
//		formationDTO = new FormationDTO();
		
		formateurs = formateurService.findAll();
		
		idFormateurs = new ArrayList<String>();
		
		//Mise à jour de la liste et retour de la liste
		formations.setWrappedData(formationService.findAll());
	}
	
	public String create() throws ServiceException{				
		
		formation.setFormateurs(new ArrayList<Formateur>());
		
		for (String id : idFormateurs) {
			Formateur formateur = new Formateur();
			formateur.setId(Integer.valueOf(id));
			formation.getFormateurs().add(formateur);
		}
		
		
		if(formation.getId() == null){
			formationService.save(formation);
		} else  {
			formationService.update(formation);
		}
		formations.setWrappedData(formationService.findAll());
		return "list-formation";
	}
	
	public String remove() throws ServiceException{
		formation = formations.getRowData();
		formationService.delete(formation);
		formations.setWrappedData(formationService.findAll());
		return "list-formation";
	}
	
//	//GETTER SETTER


	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public ListDataModel<Formation> getFormations() {
		return formations;
	}

	public void setFormations(ListDataModel<Formation> formations) {
		this.formations = formations;
	}

	public FormationService getFormationService() {
		return formationService;
	}

	public void setFormationService(FormationService formationService) {
		this.formationService = formationService;
	}

	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public FormationDTO getFormationDTO() {
		return formationDTO;
	}

	public void setFormationDTO(FormationDTO formationDTO) {
		this.formationDTO = formationDTO;
	}

	public List<String> getIdFormateurs() {
		return idFormateurs;
	}

	public void setIdFormateurs(List<String> idFormateurs) {
		this.idFormateurs = idFormateurs;
	}

	
	


}
