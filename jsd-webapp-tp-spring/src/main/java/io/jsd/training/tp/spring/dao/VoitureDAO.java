package io.jsd.training.tp.spring.dao;

import java.util.Date;
import java.util.List;

import io.jsd.training.tp.spring.exception.DAOException;
import io.jsd.training.tp.spring.model.Voiture;

public interface VoitureDAO extends GenericDAO<Voiture, Integer>{
	
	public List<Voiture> findAllFreeCar(Date dateDePrise, Date dateDeRetour) throws DAOException;
	public List<Voiture> findByColor(String color) throws DAOException;
	public List<Voiture> findByBrand(String brand) throws DAOException;
	public List<Voiture> findByDate(Date date) throws DAOException;

}
