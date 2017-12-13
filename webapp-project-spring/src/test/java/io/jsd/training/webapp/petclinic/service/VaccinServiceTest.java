package io.jsd.training.webapp.petclinic.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.jsd.training.webapp.petclinic.dao.entity.Animal;
import io.jsd.training.webapp.petclinic.dao.entity.Vaccin;
import io.jsd.training.webapp.petclinic.spring.service.AnimalService;
import io.jsd.training.webapp.petclinic.spring.service.ServiceException;
import io.jsd.training.webapp.petclinic.spring.service.VaccinService;
import io.jsd.training.webapp.petclinic.utils.DateUtils;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(value = "classpath:/testapplicationContext.xml")
//@ActiveProfiles("jsd-webapp-project-spring")
////@ContextConfiguration(value = "/applicationContext.xml")
public class VaccinServiceTest {
//
//	@Autowired
//	private VaccinService vaccinService;
//
//	@Autowired
//	private AnimalService animalService;
//
//	@Before
//	public void initialize() {
//
//	}
//
//	@Test
//	public void shouldCreateAnimal() {
//		try {
//			try {
//				Animal animal = animalService.find(1);
//				Vaccin expectedVaccin = vaccinService.save(new Vaccin(10, "rougeole", DateUtils.stringToDate("02/05/2000"), DateUtils.stringToDate("02/05/2001"), false, animal));
//				Vaccin findVaccin = vaccinService.find(expectedVaccin.getId());
//				
//				Assert.assertEquals(expectedVaccin, findVaccin);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//
//		} catch (ServiceException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test
//	public void shouldUpdateVaccin() {
//		try {
//			Animal animal=animalService.find(1);
//			Vaccin findVaccin = vaccinService.find(1);
//			Vaccin expectedVaccin = vaccinService.update(new Vaccin(1, "oreillons", DateUtils.stringToDate("02/05/2000"), DateUtils.stringToDate("02/05/2001"), false, animal));
//
//			Assert.assertNotEquals(expectedVaccin, findVaccin);
//		} catch (ParseException | ServiceException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test
//	public void shouldFindAllVaccin() throws ParseException {
//		try {
//			Animal  animal=animalService.find(1);
//			vaccinService.update(new Vaccin(1, "rougeole", DateUtils.stringToDate("02/05/2000"), DateUtils.stringToDate("02/05/2001"), false, animal));
//
//			List<Vaccin> expected = new ArrayList<Vaccin>();
//			expected.add(new Vaccin(1, "rougeole", DateUtils.stringToDate("02/05/2000"), DateUtils.stringToDate("02/05/2001"), false, animal));
//			expected.add(new Vaccin(2, "rage", DateUtils.stringToDate("11/11/1111"), DateUtils.stringToDate("04/07/2015"), false, animal));
//
//			List<Vaccin> actual = vaccinService.findAll();
//
//			//
//			//
//			Assert.assertEquals(expected.size(), actual.size());
//
//			for (int i = expected.size() - 1; i >= 0; i--) {
//				Assert.assertEquals(expected.get(i), actual.get(i));
//			}
//		} catch (ServiceException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void shouldRemoveVaccin() {
//		try {
//			Vaccin findVaccin = vaccinService.find(1);
//			vaccinService.remove(findVaccin);
//			findVaccin = vaccinService.find(1);
//
//			Assert.assertNull(findVaccin);
//		} catch (ServiceException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void shouldFindAllOfRappel() {
//		try {
//			Animal animal = animalService.find(1);
//
//			List<Vaccin> expected = new ArrayList<>(1);
//			expected.add(new Vaccin(2, "rage", DateUtils.stringToDate("11/11/1111"), DateUtils.stringToDate("04/07/2015"), false, animal));
//
//			List<Vaccin> actual = vaccinService.findAllOfRappel(DateUtils.stringToDate("04/07/2015"));
//
//			//
//			//
//			Assert.assertEquals(expected.size(), actual.size());
//
//			for (int i = expected.size() - 1; i >= 0; i--) {
//				Assert.assertEquals(expected.get(i), actual.get(i));
//			}
//		} catch (ServiceException | ParseException e) {
//			e.printStackTrace();
//		}
//	}
}
