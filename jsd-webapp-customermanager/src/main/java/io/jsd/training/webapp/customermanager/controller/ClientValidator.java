package io.jsd.training.webapp.customermanager.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import io.jsd.training.webapp.customermanager.model.Client;

@Component
public class ClientValidator implements Validator {

	public boolean supports(Class<?> obj) {
		if (obj.getName().equals(Client.class.getName())) {
			return true;
		}
		return false;
	}

	public void validate(Object obj, Errors errors) {

		if (supports(obj.getClass())) {
			Client client = (Client) obj;
			if (client.getTotalFacture() < 0) {
				//totalFacture : propriété de Client
				//errors.totalFacture : clé des fichiers properties
				//message par défaut
				errors.rejectValue("totalFacture", "errors.totalFacture",
						"Héhé erreur sur le total");
			}
		}

	}

}
