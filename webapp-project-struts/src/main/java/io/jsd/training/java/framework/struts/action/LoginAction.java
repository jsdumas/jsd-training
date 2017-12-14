package io.jsd.training.java.framework.struts.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import io.jsd.training.java.framework.struts.dao.entity.Personne;
import io.jsd.training.java.framework.struts.service.PersonneService;
import io.jsd.training.java.framework.struts.service.ServiceException;

//import com.opensymphony.xwork2.Action;
//import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.validation.SkipValidation;

@Component
public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Personne personne;
	private SessionMap<String, Object> session;
//	private PersonneDAO personneDAO = DAOFactory.getPersonneDAO();
	@Autowired
	private PersonneService personneService;
	
	
	@Action(value = "/loginForm", results = @Result(name = "success", location = "/pages/loginForm.jsp"))
	public String getLoginForm() {
		return SUCCESS;
	}
	
	
	
	@Action(value = "/login", results = {@Result(name = "success", location = "/pages/login-success.jsp"),
										@Result(name = "error", location = "/pages/login-notrecorded.jsp")})
	public String getLogIn() throws ControllerException {
		
		String username = personne.getUsername();
		String password = personne.getPassword();
		
//		if(personneDAO.findValidUser(username, password) == null){
//			addActionMessage("Le username " + personne.getUsername() + " n'existe pas dans le csv");
//			return ERROR;
//		}
		
		try {
			if(personneService.findValidUser(username, password) == null){
				addActionError("Le username " + personne.getUsername() + " n'existe pas dans la base de données");
				return ERROR;
			}
				
				session.put("USER", personne);
				addActionMessage("vous avez bien été identifié "
						+ personne.getUsername());
				return SUCCESS;
		} catch (ServiceException e) {
			throw new ControllerException("Erreur de getLogIn dans LoginAction", e);
		}	
	}
	
	
	
	@SkipValidation
	@Action(value = "/logout", results = @Result(name = "success", location = "/pages/loginForm.jsp"))
	public String logOut() {
		session.invalidate();
		return SUCCESS;
	}

//	@Override
//	public String execute() throws Exception {
//		session.put("USER", personne);
//		addActionMessage("vous avez bien été identifié " + personne.getUsername());
//		return Action.SUCCESS;
//	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=(SessionMap<String, Object>) session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
