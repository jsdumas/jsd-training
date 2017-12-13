package io.jsd.training.java.framework.struts.dao;

import java.util.List;

import io.jsd.training.java.framework.struts.dao.entity.Personne;

public interface PersonneDAO {
	Integer create(Personne personne) throws Exception;

	Personne update(Personne personne) throws Exception;

	void remove(Personne personne) throws Exception;

	Personne find(Integer id) throws Exception;

	List<Personne> findAll() throws Exception;

	Long countPersonne() throws Exception;

	Personne findValidUser(String username, String password) throws Exception;
}