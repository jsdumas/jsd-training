package io.jsd.training.webapp.realestatemanager.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.jsd.training.webapp.realestatemanager.model.Commune;

public interface CommuneDAO extends JpaRepository<Commune, Integer> {
	
	@Query("SELECT c FROM Commune c WHERE c.nomCommune = :nomCommune")
	Commune findByNomCommune(@Param("nomCommune") String nomCommune);

}
