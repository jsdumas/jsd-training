package io.jsd.training.java.framework.struts.dao;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import io.jsd.training.java.framework.struts.dao.entity.Personne;
import io.jsd.training.java.framework.struts.exception.ControllerException;

public interface PersonneDAO {
	Integer create(Personne personne) throws Exception;

	Personne update(Personne personne) throws Exception;

	void remove(Personne personne) throws Exception;

	Personne find(Integer id) throws Exception;

	List<Personne> findAll() throws Exception;

	Long countPersonne() throws Exception;

	Personne findValidUser(String username, String password) throws Exception;
}