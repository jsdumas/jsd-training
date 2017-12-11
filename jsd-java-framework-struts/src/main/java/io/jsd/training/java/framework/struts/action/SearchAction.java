package io.jsd.training.java.framework.struts.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import io.jsd.training.java.framework.struts.dao.entity.Personne;
import io.jsd.training.java.framework.struts.exception.ServiceException;
import io.jsd.training.java.framework.struts.service.PersonneService;

@Component
public class SearchAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Personne personne;
	private List<Personne> personnes;
	
	@Autowired
	private PersonneService personneService;
	
	
	@Action(value = "/searchForm", results = @Result(name = "success", location = "/pages/ajax-search.jsp"))
	public String getSearchForm() {
		return SUCCESS;
	}
	
	@SkipValidation
	@Action(value = "/updateList", results = @Result(name = "success", location = "/pages/search-result.jsp"))
	public String updateList() throws ServiceException {
		
		personnes = personneService.findAll();
				
		return SUCCESS;
	}
	
	@SkipValidation
	@Action(value = "/findByName", results = @Result(name = "success", location = "/pages/search-result.jsp"))
	public String updateListByName() throws ServiceException {
		
		personnes = personneService.findByName(personne.getNom());
				
		return SUCCESS;
	}
	
	

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

}
