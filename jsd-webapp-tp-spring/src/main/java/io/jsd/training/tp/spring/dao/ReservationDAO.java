package io.jsd.training.tp.spring.dao;

import java.util.Date;
import java.util.List;

import io.jsd.training.tp.spring.dao.entity.Client;
import io.jsd.training.tp.spring.dao.entity.Reservation;
import io.jsd.training.tp.spring.dao.entity.Voiture;
import io.jsd.training.tp.spring.exception.DAOException;

public interface ReservationDAO extends GenericDAO<Reservation, Integer>{
	
	public Long countReservation (Integer id) throws DAOException;
	
	public List<Reservation> findReservationByClient (Integer id) throws DAOException;

}
