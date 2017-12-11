package io.jsd.training.webapp.petclinic.spring.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import io.jsd.training.webapp.petclinic.dto.ExportDTO;

public class ExportDTOValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ExportDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ExportDTO exportDTO = (ExportDTO) target;

		try {
			Integer var = Integer.parseInt(exportDTO.getResultNumber());

			if (var <= 0) {
				errors.rejectValue("resultNumber", "Superieur0");
			}
		} catch (NumberFormatException e) {
			errors.rejectValue("resultNumber", "Notinteger");
		}

	}

}
