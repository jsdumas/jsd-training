package io.jsd.training.java.framework.spring.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.java.framework.spring.data.dao.ClientDAO;
import io.jsd.training.java.framework.spring.data.model.Client;

@Service
public class ClientService {

	@Autowired
	private ClientDAO clientDAO;

	@Transactional
	public Client save(Client client) {
		return clientDAO.save(client);
	}

	public List<Client> findByNom(String nom) {
		return clientDAO.findByNom(nom);
	}

	public List<Client> findAll() {
		Page<Client> resultPage = clientDAO.findAll(new PageRequest(0, 5));
		return resultPage.getContent();
	}

}
