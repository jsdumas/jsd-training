package io.jsd.training.webapp.petclinic.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.jsd.training.webapp.petclinic.dao.entity.Proprietaire;
import io.jsd.training.webapp.petclinic.spring.service.ProprietaireService;
import io.jsd.training.webapp.petclinic.spring.service.ServiceException;
import io.jsd.training.webapp.petclinic.utils.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(value = "classpath:testapplicationContext.xml")
@ContextConfiguration(value = "/dispatcher-servlet.xml")
public class ProprietaireServiceTest {

	@Autowired
	private ProprietaireService proprietaireService;

	private Proprietaire proprietaire1;
	private Proprietaire proprietaire2;
	private Proprietaire proprietaire3;

	@Before // avant chaque test (@Test), s'execute
	public void initialize() {

	}

	@Test
	public void shouldCreateProprietaire() {
		Proprietaire findProprietaire = null;
		Proprietaire expectedProprietaire = null;
		try {
			expectedProprietaire = proprietaireService.save(new Proprietaire(4,
					"Durant", "Nicolas", DateUtils.stringToDate("02/05/1980"),
					"bla@email.fr", "pou12"));
			findProprietaire = proprietaireService.find(4);
			Assert.assertEquals(expectedProprietaire, findProprietaire);
		} catch (ParseException | ServiceException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void shouldUpdateProprietaire() {
		Proprietaire findProprietaire = null;
		Proprietaire expectedProprietaire = null;
		try {
			findProprietaire = proprietaireService.find(1);
			expectedProprietaire = proprietaireService.update(new Proprietaire(
					1,"Dupont","Loic",DateUtils.stringToDate("05/02/1980"),"bla@email.fr","pass1"));

			Assert.assertNotEquals(expectedProprietaire, findProprietaire);
		} catch (ParseException | ServiceException e) {
			e.printStackTrace();
		}

	}

	

	@Test
	public void shouldFindAllProprietaire() {
		List<Proprietaire> findProprietaires = new ArrayList<Proprietaire>();

		try {
			List<Proprietaire> proprietaires = proprietaireService.findAll();
			findProprietaires.add(proprietaire1);
			findProprietaires.add(proprietaire2);
			findProprietaires.add(proprietaire3);
			
			if (proprietaires.size() == findProprietaires.size()) {
				for (int i=0; i<proprietaires.size(); i++) {
					Assert.assertEquals(proprietaires.get(i), findProprietaires.get(i));
				}
			} 

		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	public void shouldRemoveProprietaire() {
		Proprietaire findProprietaire = null;
		try {
			
			findProprietaire = proprietaireService.find(3);
			proprietaireService.remove(findProprietaire);
			findProprietaire = proprietaireService.find(3);

			Assert.assertNull(findProprietaire);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

}
