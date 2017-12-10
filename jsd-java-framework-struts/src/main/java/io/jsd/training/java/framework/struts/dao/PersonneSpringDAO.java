package io.jsd.training.java.framework.struts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.jsd.training.java.framework.struts.model.Personne;

public interface PersonneSpringDAO extends JpaRepository<Personne, Integer>{
	
	@Query("SELECT p FROM Personne p WHERE p.username  = :username AND p.password = :password")
	public Personne findValideUser (@Param("username") String username,
									@Param("password") String password);
	
	@Query("SELECT p FROM Personne p WHERE p.nom = :name")
	public List<Personne> findByname (@Param("name") String name);
}