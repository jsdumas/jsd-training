package io.jsd.training.webapp.petclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;

public interface ProprietaireDAO extends JpaRepository<Proprietaire, Integer> {

}
