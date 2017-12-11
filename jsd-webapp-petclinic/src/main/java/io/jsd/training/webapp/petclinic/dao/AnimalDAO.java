package io.jsd.training.webapp.petclinic.dao;

import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;

public interface AnimalDAO extends JpaRepository<Animal, Integer> {
	@Query(
			"select a from Animal a"
					+ " where a.proprietaire.id = :id"
			)
	List<Animal> findByProprietaire(@Param("id") Integer id) throws DataAccessException;

	@Query("Select a From Animal a Join a.proprietaire p Where p.lastName Like CONCAT('%',:nomProprietaire,'%')")
	List<Animal> findAllNomProprietaire(@Param("nomProprietaire") String nomProprietaire);

	@Query("Select a From Animal a Where a.class = :typeAnimal")
	List<Animal> findAllTypeAnimal(@Param("typeAnimal") String typeAnimal);

	@Query("Select a From Animal a Where SUBSTRING(a.dateDeNaissance, 1, 4)  = SUBSTRING(:dateDeNaissanceAnimal, 1, 4)")
	List<Animal> findAllAgeAnimal(@Param("dateDeNaissanceAnimal")  Date dateDeNaissanceAnimal);

}
