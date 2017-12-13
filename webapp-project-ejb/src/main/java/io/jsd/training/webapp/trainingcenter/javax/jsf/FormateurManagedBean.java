package io.jsd.training.webapp.trainingcenter.javax.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;
import io.jsd.training.webapp.trainingcenter.javax.ejb.FormateurService;
import io.jsd.training.webapp.trainingcenter.javax.ejb.ServiceException;



@ManagedBean (name="dtFormateurManagedBean")
//@ViewScoped
public class FormateurManagedBean {
	
	private Formateur formateur;
	private ListDataModel<Formateur> formateurs;
	
	@Inject
	private FormateurService formateurService;
	
	@PostConstruct
	public void init() throws ServiceException{
		formateur = new Formateur();
		formateurs = new ListDataModel<Formateur>();
		//Mise à jour de la liste et retour de la liste
		formateurs.setWrappedData(formateurService.findAll());
	}

	public Formateur getFormateur() {
		return formateur;
	}
	
	public String create() throws ServiceException{
		if(formateur.getId() == null){
			formateurService.save(formateur);
		} else  {
			formateurService.update(formateur);
		}
		formateurs.setWrappedData(formateurService.findAll());
		return "list-formateur";
	}
	
	public String remove() throws ServiceException{
		formateur = formateurs.getRowData();
		formateurService.delete(formateur);
		formateurs.setWrappedData(formateurService.findAll());
		return "list-formateur";
	}
	
	

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public ListDataModel<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(ListDataModel<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

	public FormateurService getFormateurService() {
		return formateurService;
	}

	public void setFormateurService(FormateurService formateurService) {
		this.formateurService = formateurService;
	}
	
	

}
