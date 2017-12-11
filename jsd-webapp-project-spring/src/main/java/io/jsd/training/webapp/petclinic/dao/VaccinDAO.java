package io.jsd.training.webapp.petclinic.dao;

import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.jsd.training.webapp.petclinic.dao.entity.Vaccin;

public interface VaccinDAO extends JpaRepository<Vaccin, Integer> {
	@Query(
			"select a from Vaccin a"
					+ " where a.animal.id = :id"
			)
	List<Vaccin> findByAnimal(@Param("id") Integer id) throws DataAccessException;
	
	@Query(
			"select a from Vaccin a"
					+ " where a.rappel = :date"
			)
	List<Vaccin> findAllOfRappel(@Param("date") Date date) throws DataAccessException;
}
