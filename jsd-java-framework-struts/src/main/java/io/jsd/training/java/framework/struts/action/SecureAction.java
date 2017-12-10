package io.jsd.training.java.framework.struts.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import io.jsd.training.java.framework.struts.exception.ControllerException;
import io.jsd.training.java.framework.struts.exception.ServiceException;
import io.jsd.training.java.framework.struts.model.Personne;
import io.jsd.training.java.framework.struts.service.PersonneService;

@Component
@ParentPackage("secure")
public class SecureAction extends ActionSupport { //implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	private Personne personne;

	
	private List<Personne> personnes;
//	private PersonneDAO personneDAO = DAOFactory.getPersonneDAO();
	@Autowired
	private PersonneService personneService;
	

	@Action(value = "/personneList", results = @Result(name = "success", location = "/pages/personne-list.jsp"))
	public String getPersonneList() throws ControllerException {
//		personnes = personneDAO.findAll();
		try {
			personnes = personneService.findAll();
			return SUCCESS;
		} catch (ServiceException e) {
			throw new ControllerException("Erreur de getPersonneList dans SecureAction", e);
		}
		
	}
	
	@Action(value="/deletePersonne", results = @Result(name="success", location="/pages/personne-list.jsp"))
	public String deletePersonne() throws ControllerException {
		
		
		try {
			personne = personneService.findById(personne.getId());
			personneService.delete(personne);
			personnes = personneService.findAll();
			return SUCCESS;
		} catch (ServiceException e) {
			throw new ControllerException("Erreur de deletePersonne dans RegisterAction", e);
		}
		
	}
	
	
	
	
	public List<Personne> getPersonnes() {
		return personnes;
	}


	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
}
