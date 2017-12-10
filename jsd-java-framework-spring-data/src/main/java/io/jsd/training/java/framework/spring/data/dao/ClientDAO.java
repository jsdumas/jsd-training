package io.jsd.training.java.framework.spring.data.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.jsd.training.java.framework.spring.data.model.Client;

@Repository
public interface ClientDAO extends CrudRepository<Client, Long>{
	
	Page<Client> findAll(Pageable page);
	
//	@Query("select c from Client c where c.nom = :nom")
	List<Client> findByNom(String nom);
	
	@Query("select c from Client c where c.prenom = :prenom")
	List<Client> findByPrenomClient(@Param("prenom") String prenom);

}
