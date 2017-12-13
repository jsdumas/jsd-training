package io.jsd.training.tp.spring.dao;

public class DAOException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DAOException(String message, Throwable e){
		super(message, e);
	}

}
