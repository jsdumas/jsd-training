package io.jsd.training.webapp.petclinic.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.dao.entity.Message;
import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;
import io.jsd.training.webapp.petclinic.service.MessageService;
import io.jsd.training.webapp.petclinic.service.ServiceException;

@Component
public class MessageAspect {

	@Autowired
	private MessageService messageService;

	Logger logger = LoggerFactory.getLogger(MessageAspect.class);

	public void afterServiceCreate(Object mResult) throws ServiceException {

		Message message = new Message();
		Animal animal;
		Proprietaire proprietaire;

		if (mResult instanceof Animal) {
			animal = (Animal) mResult;
			logger.info("Création d'un animal de type " + animal.getClass().getSimpleName());
			message.setType("Création  d'un animal de type " + animal.getClass().getSimpleName());
			message.setMessage(animal.getClass().getSimpleName() + " créé");
			messageService.save(message);

		} else if (mResult instanceof Proprietaire) {
			proprietaire = (Proprietaire) mResult;
			logger.info("Création de " + proprietaire.getLastName());
			message.setType("Création d'un " + proprietaire.getClass().getSimpleName());
			message.setMessage(proprietaire.getLastName() + " créé");
			messageService.save(message);
		}
	}

	public void afterServiceRemove(JoinPoint joinpoint) throws ServiceException {
		Object[] mResult = joinpoint.getArgs();
		Message message = new Message();
		Animal animal;
		Proprietaire proprietaire;

		if (mResult[0] instanceof Animal) {
			animal = (Animal) mResult[0];
			logger.info("Suppression de " + animal.getNom());
			message.setType("Suppression de " + animal.getNom() + " de type " + animal.getClass().getSimpleName());
			message.setMessage(animal.getClass().getSimpleName() + " supprimé");
			messageService.save(message);

		} else if (mResult[0] instanceof Proprietaire) {
			proprietaire = (Proprietaire) mResult[0];
			logger.info("Suppression de " + proprietaire.getLastName());
			message.setType("Suppression d'un " + proprietaire.getClass().getSimpleName());
			message.setMessage(proprietaire.getLastName() + " supprimé");
			messageService.save(message);
		}
	}

	public void afterServiceUpdate(Object result) throws ServiceException {
		Message message = new Message();
		Animal animal;
		Proprietaire proprietaire;

		if (result instanceof Animal) {
			animal = (Animal) result;
			logger.info("Mise à jour de " + animal.getNom());
			message.setType("Mise à jour de " + animal.getNom() + " de type " + animal.getClass().getSimpleName());
			message.setMessage(animal.getClass().getSimpleName() + " mis à jour");
			messageService.save(message);

		} else if (result instanceof Proprietaire) {
			proprietaire = (Proprietaire) result;
			logger.info("Mise à jour de " + proprietaire.getLastName());
			message.setType("Mise à jour d'un " + proprietaire.getClass().getSimpleName());
			message.setMessage(proprietaire.getLastName() + " mis à jour");
			messageService.save(message);
		}
	}

}
