package io.jsd.training.webapp.realestatemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.jsd.training.webapp.realestatemanager.model.TypeLogement;

public interface TypeLogementDAO extends JpaRepository<TypeLogement, Integer> {

}
