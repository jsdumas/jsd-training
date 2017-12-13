package io.jsd.training.tp.spring.dao;

import java.util.List;

import io.jsd.training.tp.spring.dao.entity.Reservation;

public interface ReservationDAO extends GenericDAO<Reservation, Integer>{
	
	public Long countReservation (Integer id) throws DAOException;
	
	public List<Reservation> findReservationByClient (Integer id) throws DAOException;

}
