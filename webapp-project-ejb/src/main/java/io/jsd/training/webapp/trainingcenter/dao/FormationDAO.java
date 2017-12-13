package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import io.jsd.training.webapp.trainingcenter.dao.entity.Formateur;
import io.jsd.training.webapp.trainingcenter.dao.entity.Formation;

public interface FormationDAO extends GenericDAO<Formation, Integer> {

		List<Formation> findByFormateur(Formateur formateur)throws DAOException;
//		void deleteDependanceFormateur(Formateur formateur) throws ServiceException;


}
