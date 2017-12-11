package io.jsd.training.webapp.petclinic.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.webapp.petclinic.dao.MessageDAO;
import io.jsd.training.webapp.petclinic.dao.entity.Message;


@Service
public class MessageService {
	
	@Autowired
	private MessageDAO messageDAO;
	
	public static List<Message> listeMessage;
	
	Logger logger = LoggerFactory.getLogger(MessageService.class);
	
	@Transactional
	public Message save(Message message) throws ServiceException {
		try {
			if(listeMessage == null)
			{
				findAll();
			}
			
			Message save = messageDAO.save(message);
			listeMessage.add(save);
			return save;

		} catch (DataAccessException e) {
			throw new ServiceException("error save", e);
		}
	}

	public List<Message> findAll() throws ServiceException {
		try {
			
			if (listeMessage == null) {
				listeMessage = messageDAO.findAll();
			}
			return listeMessage;
			
		} catch (DataAccessException e) {
			throw new ServiceException("error findAll", e);
		}
	}
}
