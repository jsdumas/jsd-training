package io.jsd.training.java.framework.struts.dao;

public abstract class DAOFactory {
	private static PersonneDAO personneDAO;

	public static PersonneDAO getPersonneDAO() {
		if (personneDAO == null) {
			personneDAO = new PersonneFileDAO();
		}
		return personneDAO;
	}
}