package io.jsd.training.webapp.petclinic.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.webapp.petclinic.dao.AnimalDAO;
import io.jsd.training.webapp.petclinic.dao.ProprietaireDAO;
import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;
import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.utils.DateUtils;

@Service
public class ProprietaireService {

	@Autowired
	private ProprietaireDAO proprietaireDAO;
	@Autowired
	private AnimalDAO animalDAO;

	Logger logger = LoggerFactory.getLogger(ProprietaireService.class);

	@Transactional
	public Proprietaire save(Proprietaire proprietaire) throws ServiceException {
		Locale locale = Locale.getDefault();
		ResourceBundle res = ResourceBundle.getBundle("messages", locale);
		String texte = (String) res.getObject("proprietaire.password");

		try {
			logger.debug("Propriétaire :" + proprietaire);
			return proprietaireDAO.save(proprietaire);

		} catch (DataAccessException e) {
			throw new ServiceException("error save", e);
		}
	}

	@Transactional
	public Proprietaire update(Proprietaire proprietaire)
			throws ServiceException {
		try {

			return proprietaireDAO.save(proprietaire);
		} catch (DataAccessException e) {
			throw new ServiceException("error update", e);
		}
	}

	public Proprietaire find(Integer id) throws ServiceException {
		try {

			return proprietaireDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException("error find", e);
		}
	}

	public List<Proprietaire> findAll() throws ServiceException {
		try {

			return proprietaireDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("error findAll", e);
		}
	}

	@Transactional
	public void remove(Proprietaire proprietaire) throws ServiceException {
		try {
			proprietaireDAO.delete(proprietaire);
		} catch (DataAccessException e) {
			throw new ServiceException("error remove", e);
		}
	}

	public void exportProprietaireCsv(Integer resultNumber)
			throws ServiceException {
		File file = new File("proprietaire.csv");
		if (file.exists()) {
			file.delete();
		}

		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			List<Proprietaire> proprietaires = new ArrayList<Proprietaire>();
			try {
				proprietaires = findAll();
				Integer i = 0;
				for (Proprietaire p : proprietaires) {
					if (i >= resultNumber)
						break;
					StringBuilder builder = new StringBuilder();
					builder.append(p.getId());
					builder.append(";");
					builder.append(p.getLastName());
					builder.append(";");
					builder.append(p.getFirstName());
					builder.append(";");
					builder.append(DateUtils.dateToString(p.getBirthDate()));
					builder.append(";");
					builder.append(p.getEmail());
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

		Locale locale = Locale.getDefault();
		ResourceBundle res = ResourceBundle.getBundle("messages", locale);
		String texte = (String) res
				.getObject("Choisirladestinationdufichierexporte");
		fileChooser.setDialogTitle(texte);

		int userSelection = fileChooser.showSaveDialog(parentFrame);
		

		if (userSelection == JFileChooser.APPROVE_OPTION) {
			try {
				exportProprietaireCsv(resultNumber);
				File file = new File("proprietaire.csv");
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
}
