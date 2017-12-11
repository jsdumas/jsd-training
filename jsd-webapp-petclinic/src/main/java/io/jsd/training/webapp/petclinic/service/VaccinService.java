package io.jsd.training.webapp.petclinic.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.webapp.petclinic.dao.VaccinDAO;
import io.jsd.training.webapp.petclinic.dao.entity.Vaccin;
import io.jsd.training.webapp.petclinic.utils.MailUtils;

@Service
public class VaccinService {

	@Autowired
	private VaccinDAO vaccinDAO;

	@Autowired
	private MailUtils mailUtils;

	Logger logger = LoggerFactory.getLogger(VaccinService.class);

	@Transactional
	public Vaccin save(Vaccin vaccin) throws ServiceException {
		try {
			return vaccinDAO.save(vaccin);

		} catch (DataAccessException e) {
			throw new ServiceException("error save", e);
		}
	}

	@Transactional
	public Vaccin update(Vaccin vaccin)
			throws ServiceException {
		try {

			return vaccinDAO.save(vaccin);
		} catch (DataAccessException e) {
			throw new ServiceException("error update", e);
		}
	}

	public Vaccin find(Integer id) throws ServiceException {
		try {

			return vaccinDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException("error find", e);
		}
	}

	public List<Vaccin> findAll() throws ServiceException {
		try {

			return vaccinDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("error findAll", e);
		}
	}

	@Transactional
	public void remove(Vaccin vaccin) throws ServiceException {
		try {

			vaccinDAO.delete(vaccin);
		} catch (DataAccessException e) {
			throw new ServiceException("error remove", e);
		}
	}
	
	public List<Vaccin> findAllOfRappel(Date date) throws ServiceException {
		try {
			return vaccinDAO.findAllOfRappel(date);
		} catch (DataAccessException e) {
			throw new ServiceException("error findAllOfRappel", e);
		}
	}
	
	@Scheduled(cron = "0 30 0 ? * *")// à 00:30 chaque jour
	public void rappel() throws ServiceException {
		Calendar rappel = new GregorianCalendar();
		rappel.setTime(new Date());
		rappel.set(Calendar.HOUR_OF_DAY, 0);
		rappel.set(Calendar.MINUTE, 0);
		rappel.set(Calendar.SECOND, 0);
		rappel.set(Calendar.MILLISECOND, 0);

		rappel.add(Calendar.DATE, 30);
		
		logger.debug("rappel -----> " + rappel.getTime());
		
		for (Vaccin vaccin: this.findAllOfRappel(rappel.getTime())) {
			if (!vaccin.getEmailSent()) {
				String to = vaccin.getAnimal().getProprietaire().getEmail();
				String subject = "Message de rappel de vaccin pour " + vaccin.getAnimal().getNom();
				String msg = "Bonjour,"
						+ "\n"
						+ "\nNous vous informons qu'il ne reste plus que 30 jours avant le rappel du vaccin de type "
						+ vaccin.getType() + " de votre "
						+ vaccin.getAnimal().getTypeLabel() + " " + vaccin.getAnimal().getNom() + "."
						+ "\n"
						+ "\nBien cordialement,"
						+ "\n"
						+ "\nL'équipe Petclinic.";
						
				mailUtils.sendMail(to, subject, msg);
				
				vaccin.setEmailSent(true);
				this.update(vaccin);
				
				logger.debug("subject -----> " + subject);
			}
		}
	}
	
	public List<Vaccin> findByAnimal(Integer id) throws ServiceException {
		try {
			return vaccinDAO.findByAnimal(id);
		} catch (DataAccessException e) {
			throw new ServiceException("error findAllOfRappel", e);
		}
	}
	
}
