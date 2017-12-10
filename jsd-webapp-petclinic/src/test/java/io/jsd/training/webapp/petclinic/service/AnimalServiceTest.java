package io.jsd.training.webapp.petclinic.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.jsd.training.webapp.petclinic.exception.ServiceException;
import io.jsd.training.webapp.petclinic.model.Animal;
import io.jsd.training.webapp.petclinic.model.Chat;
import io.jsd.training.webapp.petclinic.model.Cheval;
import io.jsd.training.webapp.petclinic.model.Chien;
import io.jsd.training.webapp.petclinic.model.Proprietaire;
import io.jsd.training.webapp.petclinic.utils.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:testapplicationContext.xml")
public class AnimalServiceTest {
	
	@Autowired
	private AnimalService animalService;
	
	@Autowired
	private ProprietaireService proprietaireService;

	@Test
	public void shouldCreateProprietaire() {
		Animal findAnimal= null;
		Animal expectedAnimal= null;
		try {
			try {
				Proprietaire proprietaire=proprietaireService.find(1);
				expectedAnimal = animalService.save(new Chat(4, "Toto",DateUtils.stringToDate("02/05/2000"), proprietaire));
				System.out.println(expectedAnimal);
				findAnimal = animalService.find(4);
				System.out.println(findAnimal);
				Assert.assertEquals(expectedAnimal, findAnimal);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void shouldUpdateAnimal() {
		Animal findAnimal = null;
		Animal expectedAnimal = null;
		try {
			Proprietaire proprietaire=proprietaireService.find(2);
			findAnimal = animalService.find(2);
			expectedAnimal = animalService.update(new Cheval(2,"Bruno",DateUtils.stringToDate("02/05/2000"),proprietaire));

			Assert.assertNotEquals(expectedAnimal, findAnimal);
		} catch (ParseException | ServiceException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void shouldFindAllAnimal() throws ParseException {
		List<Animal> findAnimals = new ArrayList<Animal>();

		try {
			Proprietaire  proprietaire=proprietaireService.find(2);
			animalService.update(new Cheval(2,"Bruno",DateUtils.stringToDate("02/05/2012"),proprietaire));
			List<Animal> animals = animalService.findAll();
			
			proprietaire=proprietaireService.find(1);

			findAnimals.add(new Chat(1, "Titi",DateUtils.stringToDate("07/09/2010"), proprietaire));
			proprietaire=proprietaireService.find(2);
			findAnimals.add(new Cheval(2, "Bruno",DateUtils.stringToDate("02/05/2012"), proprietaire));
			proprietaire=proprietaireService.find(1);
			findAnimals.add(new Chien(3, "Toto",DateUtils.stringToDate("26/11/2011"), proprietaire));
			
			if (animals.size() == findAnimals.size()) {
				for (int i=0; i<animals.size(); i++) {
					Assert.assertEquals(animals.get(i), findAnimals.get(i));
				}
			} 

		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void shouldRemoveAnimal() {
		Animal findAnimal = null;
		try {
			
			findAnimal = animalService.find(3);
			animalService.remove(findAnimal);
			findAnimal = animalService.find(3);

			Assert.assertNull(findAnimal);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void shouldFindAllAnimmalByNomProp() {

		try {
			List<Animal> animauxFindByNomProp = animalService.findAllNomProprietaire("");
			List<Animal> animauxFindAll = animalService.findAll();

			Assert.assertEquals(animauxFindByNomProp.size(), animauxFindAll.size());

		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
