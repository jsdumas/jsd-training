package io.jsd.training.webapp.petclinic.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.webapp.petclinic.dao.AnimalDAO;
import io.jsd.training.webapp.petclinic.dao.VaccinDAO;
import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.model.Animal;
import io.jsd.training.webapp.petclinic.utils.DateUtils;

@Service
public class AnimalService {

	@Autowired
	private AnimalDAO animalDAO;
	@Autowired
	private VaccinDAO vaccinDAO;

	@Transactional
	public Animal save(Animal animal) throws ServiceException {
		try {
			return animalDAO.save(animal);

		} catch (DataAccessException e) {
			throw new ServiceException("error save", e);
		}
	}

	@Transactional
	public Animal update(Animal animal) throws ServiceException {
		try {

			return animalDAO.save(animal);
		} catch (DataAccessException e) {
			throw new ServiceException("error update", e);
		}
	}

	public Animal find(Integer id) throws ServiceException {
		try {

			return animalDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException("error find", e);
		}
	}

	public List<Animal> findAll() throws ServiceException {
		try {

			return animalDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("error findAll", e);
		}
	}

	@Transactional
	public void remove(Animal animal) throws ServiceException {
		try {
			animalDAO.delete(animal);
		} catch (DataAccessException e) {
			throw new ServiceException("error remove", e);
		}
	}

	public List<Animal> findAllNomProprietaire(String nomProprietaire)
			throws ServiceException {
		try {
			return animalDAO.findAllNomProprietaire(nomProprietaire);
		} catch (DataAccessException e) {
			throw new ServiceException("error findAllNomProprietaire", e);
		}
	}

	public List<Animal> findAllTypeAnimal(String typeAnimal)
			throws ServiceException {
		try {
			if (typeAnimal != null && !typeAnimal.equals("")) {
				return animalDAO.findAllTypeAnimal(typeAnimal);
			}
			return animalDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("error findAllTypeAnimal", e);
		}
	}

	public List<Animal> findAllAgeAnimal(Integer ageAnimal)
			throws ServiceException {
		try {
			if (ageAnimal != null) {
				Date ageToDate = DateUtils.ageToDate(ageAnimal);
				return animalDAO.findAllAgeAnimal(ageToDate);
			}
			return animalDAO.findAll();

		} catch (DataAccessException e) {
			throw new ServiceException("error findAllAgeAnimal", e);
		}
	}

	public void exportAnimalCsv(Integer resultNumber) throws ServiceException {
		File file = new File("animal.csv");
		if (file.exists()) {
			file.delete();
		}

		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			List<Animal> animaux = new ArrayList<Animal>();
			try {
				animaux = findAll();
				Integer i = 0;
				for (Animal a : animaux) {
					if (i >= resultNumber)
						break;
					StringBuilder builder = new StringBuilder();
					builder.append(a.getId());
					builder.append(";");
					builder.append(a.getTypeLabel());
					builder.append(";");
					builder.append(a.getNom());
					builder.append(";");
					builder.append(DateUtils.dateToString(a
							.getDateDeNaissance()));
					builder.append(";");
					builder.append(a.getProprietaire().getLastName());
					builder.append(";");
					builder.append("\n");
					writer.write(builder.toString());
					i++;
				}
			} catch (ServiceException e) {
				e.printStackTrace();
			}

			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			throw new ServiceException("Erreur creation file writer", e);
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void downloadExportedFile(Integer resultNumber) {
		JFrame parentFrame = new JFrame();
		File fileToSave = null;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.setDialogTitle("Choisir la destination du fichier exporté");

		int userSelection = fileChooser.showSaveDialog(parentFrame);
		File file = new File("animal.csv");

		if (userSelection == JFileChooser.APPROVE_OPTION) {

			try {
				exportAnimalCsv(resultNumber);
				fileToSave = fileChooser.getSelectedFile();
				File saved = new File(fileToSave.getAbsolutePath() + "/"
						+ file.getName());
				if (!saved.getAbsolutePath().equals(file.getAbsolutePath())) {
					if (saved.exists()) {
						saved.delete();
					}
					if (!saved.exists()) {
						file.renameTo(saved);
					}
				}
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public List<Animal> findByProprietaire(Integer id) throws ServiceException {
		try {

			return animalDAO.findByProprietaire(id);
		} catch (DataAccessException e) {
			throw new ServiceException("error findByProprietaire", e);
		}
	}
}
