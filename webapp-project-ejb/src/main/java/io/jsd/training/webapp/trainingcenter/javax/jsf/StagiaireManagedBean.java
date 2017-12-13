package io.jsd.training.webapp.trainingcenter.javax.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import io.jsd.training.webapp.trainingcenter.dao.entity.Stagiaire;
import io.jsd.training.webapp.trainingcenter.javax.ejb.ServiceException;
import io.jsd.training.webapp.trainingcenter.javax.ejb.StagiaireService;

@ManagedBean (name="dtStagiaireManagedBean")
//@ViewScoped
public class StagiaireManagedBean {
	
private Stagiaire stagiaire;
	
	private ListDataModel<Stagiaire> stagiaires;
	
	@Inject
	private StagiaireService stagiaireService;
	
	@PostConstruct
	public void init() throws ServiceException{
		stagiaire = new Stagiaire();
		stagiaires = new ListDataModel<Stagiaire>();
		//Mise à jour de la liste et retour de la liste
		stagiaires.setWrappedData(stagiaireService.findAll());
	}
	
	public String create() throws ServiceException{
		if(stagiaire.getId() == null){
			stagiaireService.save(stagiaire);
		} else  {
			stagiaireService.update(stagiaire);
		}
		stagiaires.setWrappedData(stagiaireService.findAll());
		return "list-stagiaire";
	}
	
	public String remove() throws ServiceException{
		stagiaire = stagiaires.getRowData();
		stagiaireService.delete(stagiaire);
		stagiaires.setWrappedData(stagiaireService.findAll());
		return "list-stagiaire";
	}

	public Stagiaire getStagiaire() {
		return stagiaire;
	}

	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}

	public ListDataModel<Stagiaire> getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(ListDataModel<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}

	public StagiaireService getStagiaireService() {
		return stagiaireService;
	}

	public void setStagiaireService(StagiaireService stagiaireService) {
		this.stagiaireService = stagiaireService;
	}
	
	

}
