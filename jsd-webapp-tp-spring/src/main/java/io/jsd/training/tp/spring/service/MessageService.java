package io.jsd.training.tp.spring.service;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.tp.spring.dao.MessageDAO;
import io.jsd.training.tp.spring.exception.DAOException;
import io.jsd.training.tp.spring.model.Message;

@Service
public class MessageService {
	
	@Autowired
	private MessageDAO messageDAO;
	
	@Transactional
	public Message save(Message message) throws ServiceException {
		try {
			return messageDAO.save(message);
		} catch (DAOException e) {
			throw new ServiceException("Erreur dans save de MessageService ", e);
		}
	}
}
