package io.jsd.training.java.framework.struts.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.jsd.training.java.framework.struts.dao.entity.Personne;

public class PersonneFileDAO implements PersonneDAO {
	File file = new File("/home/stagiaire/personnesStruts.csv");
	private Integer count = null;

	@Override
	public Integer create(Personne personne) throws Exception {
		FileWriter writer = null;
		file = openFile(file);
		count = this.initCount();
		personne.setId(++count);
		try {
			writer = new FileWriter(file, true);
			StringBuilder builder = new StringBuilder();
			builder.append(personne.getId());
			builder.append(";");
			builder.append(personne.getNom());
			builder.append(";");
			builder.append(personne.getPrenom());
			builder.append(";");
			builder.append(personne.getAge());
			builder.append(";");
			builder.append(personne.getEmail());
			builder.append(";");
			builder.append(personne.getUsername());
			builder.append(";");
			builder.append(personne.getPassword());
			builder.append(";");
			writer.write(builder.toString());
			writer.append("\n");
		} catch (IOException e) {
			throw new Exception("Erreur creation personne", e);
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				throw new Exception("Erreur creation personne", e);
			}
		}
		return personne.getId();
	}

	@Override
	public void remove(Personne personne) throws Exception {
		try {
			List<Personne> personnes = findAll();
			personnes.remove(personne);
			file.delete();
			file.createNewFile();
			for (Personne pers : personnes)
				create(pers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("erreur remove", e);
		}
	}

	@Override
	public Personne find(Integer id) throws Exception {
		try {
			return this.findAll().stream().filter(p -> p.getId() == id)
					.collect(Collectors.toList()).get(0);
		} catch (Exception e) {
			throw new Exception("erreur find by id", e);
		}
	}

	@Override
	public Personne findValidUser(String username, String password)
			throws Exception {
		try {
			List<Personne> collect = this
					.findAll()
					.stream()
					.filter(p -> p.getUsername().equals(username)
							&& p.getPassword().equals(password))
					.collect(Collectors.toList());
			if (collect != null && !collect.isEmpty())
				return collect.get(0);
			return null;
		} catch (Exception e) {
			throw new Exception("erreur find by id", e);
		}
	}

	@Override
	public List<Personne> findAll() throws Exception {
		List<Personne> personnes = null;
		FileReader reader = null;
		BufferedReader buffReader = null;
		file = openFile(file);
		try {
			reader = new FileReader(file);
			buffReader = new BufferedReader(reader);
			String line = "";
			personnes = new ArrayList<Personne>();
			while (buffReader.ready()) {
				line = buffReader.readLine();
				String[] personneText = line.split(";");
				Personne personne = new Personne();
				personne.setId(Integer.valueOf(personneText[0]));
				personne.setNom(personneText[1]);
				personne.setPrenom(personneText[2]);
				personne.setAge(Integer.valueOf(personneText[3]));
				personne.setEmail(personneText[4]);
				personne.setUsername(personneText[5]);
				personne.setPassword(personneText[6]);
				personnes.add(personne);
			}
		} catch (IOException e) {
			throw new Exception("erreur findall de type ioexception", e);
		} finally {
			try {
				buffReader.close();
				reader.close();
			} catch (IOException e) {
				throw new Exception("erreur findall de type ioexception", e);
			}
		}
		return personnes;
	}

	@Override
	public Personne update(Personne personne) throws Exception {
		try {
			List<Personne> personnes = findAll();
			personnes.remove(personne);
			personnes.add(personne);
			file.delete();
			file.createNewFile();
			for (Personne pers : personnes)
				create(pers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("erreur remove", e);
		}
		return personne;
	}

	@Override
	public Long countPersonne() throws Exception {
		return this.findAll().stream().count();
	}

	private int initCount() throws Exception {
		try {
			if (this.findAll().isEmpty())
				return 0;
			else
				return this.findAll().stream().mapToInt(p -> p.getId()).max()
						.getAsInt();
		} catch (Exception e) {
			throw new Exception("erreur init count", e);
		}
	}

	public static File openFile(File file) throws IOException {
		if (!file.exists())
			file.createNewFile();
		return file;
	}
}