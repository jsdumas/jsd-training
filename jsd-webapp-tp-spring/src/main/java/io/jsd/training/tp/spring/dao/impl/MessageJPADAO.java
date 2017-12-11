package io.jsd.training.tp.spring.dao.impl;

import org.springframework.stereotype.Repository;

import io.jsd.training.tp.spring.dao.MessageDAO;
import io.jsd.training.tp.spring.dao.entity.Message;

@Repository
public class MessageJPADAO extends GenericJPADAO<Message, Integer> implements MessageDAO {

	public MessageJPADAO() {
		super(Message.class);
	}
	
	

}
