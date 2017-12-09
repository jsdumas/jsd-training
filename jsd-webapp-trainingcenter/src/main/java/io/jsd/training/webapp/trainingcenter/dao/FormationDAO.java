package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import io.jsd.training.webapp.trainingcenter.exception.DAOException;
import io.jsd.training.webapp.trainingcenter.exception.ServiceException;
import io.jsd.training.webapp.trainingcenter.model.Formateur;
import io.jsd.training.webapp.trainingcenter.model.Formation;

public interface FormationDAO extends GenericDAO<Formation, Integer> {

		List<Formation> findByFormateur(Formateur formateur)throws DAOException;
//		void deleteDependanceFormateur(Formateur formateur) throws ServiceException;


}
