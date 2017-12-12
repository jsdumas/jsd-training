package io.jsd.training.tp.spring.dao.impl;

import org.springframework.stereotype.Repository;

import io.jsd.training.tp.spring.dao.ClientDAO;
import io.jsd.training.tp.spring.dao.entity.Client;

@Repository
public class ClientJPADAO extends GenericJPADAO<Client, Integer> implements ClientDAO{

	public ClientJPADAO() {
		super(Client.class);
	}
	
	

}
