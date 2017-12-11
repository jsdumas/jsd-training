package io.jsd.training.tp.spring.dao;

import java.util.Date;
import java.util.List;

import io.jsd.training.tp.spring.exception.DAOException;
import io.jsd.training.tp.spring.model.Client;
import io.jsd.training.tp.spring.model.Reservation;
import io.jsd.training.tp.spring.model.Voiture;

public interface ReservationDAO extends GenericDAO<Reservation, Integer>{
	
	public Long countReservation (Integer id) throws DAOException;
	
	public List<Reservation> findReservationByClient (Integer id) throws DAOException;

}
