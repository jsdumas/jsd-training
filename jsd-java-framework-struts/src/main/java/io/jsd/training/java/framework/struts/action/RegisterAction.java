package io.jsd.training.java.framework.struts.action;

import java.io.File;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;








//import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import io.jsd.training.java.framework.struts.dao.DAOFactory;
import io.jsd.training.java.framework.struts.dao.PersonneDAO;
import io.jsd.training.java.framework.struts.dao.entity.Personne;
import io.jsd.training.java.framework.struts.exception.ControllerException;
import io.jsd.training.java.framework.struts.exception.ServiceException;
import io.jsd.training.java.framework.struts.service.PersonneService;

@Component
public class RegisterAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Personne personne;
//	private PersonneDAO personneDAO = DAOFactory.getPersonneDAO();
	@Autowired
	private PersonneService personneService;
	private Logger logger = Logger.getLogger(RegisterAction.class);
	
	
	
	@SkipValidation
	@Action(value="/register", results = @Result(name="success", location="/pages/register.jsp"))
	public String register(){
		return SUCCESS;
	}
	
	@Action(value="/registration", results = {@Result(name="success", location="/pages/registration-ok.jsp"),
											@Result(name="input", location="/pages/register.jsp"),
											@Result(name="error", location="/pages/register-error.jsp")})
	public String registration() throws ControllerException{
		addActionMessage("enregistrement de " + personne.getUsername()
				+ " correctement effectué");
		
//		if(personne.getUsername()!=null){
//			addActionError("une erreur");
//			return ERROR;
//		}
		
//		personneDAO.create(personne);
		try {
			logger.debug("Id de personne update " + personne.getId());
			personneService.save(personne);
		} catch (ServiceException e) {
			throw new ControllerException(
					"Erreur de registration dans RegisterAction ", e);
		}
		
		return SUCCESS;
	}
	
	@SkipValidation
	@Action(value="/updatePersonne", results = @Result(name="success", location="/pages/register.jsp"))
	public String updatePersonne() throws ControllerException {
		
		try {
			personne = personneService.findById(personne.getId());
			return SUCCESS;
		} catch (ServiceException e) {
			throw new ControllerException("Erreur de deletePersonne dans RegisterAction", e);
		}
		
	}


//	@Override
//	public String execute() throws Exception {
//		addActionMessage("enregistrement de " + personne.getUsername()
//				+ " correctement effectué");
////		if(personne.getUsername()!=null){
////			addActionError("Erreur d'enregistrement de " + personne.getUsername());
////			return Action.ERROR;
////		}
//		
//		personneDAO.create(personne);
//				
//		return Action.SUCCESS;
//	}

	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
