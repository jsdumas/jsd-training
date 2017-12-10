package io.jsd.training.java.framework.spring.data.runtime;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.jsd.training.java.framework.spring.data.model.Client;
import io.jsd.training.java.framework.spring.data.service.ClientService;

public class Runtime {

	public static void main(String[] args) {

		///////NE PAS OUBLIER DE DÉCLARER L'APPLICATION CONTEXT
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		
		///////NE PAS OUBLIER DE DÉCLARER LE GET BEAN
		ClientService clientService = (ClientService) context
				.getBean("clientService");

		Client c1 = new Client();
		c1.setNom("Durand");
		c1.setPrenom("Alain");
		Client c2 = new Client();
		c2.setNom("Durand");
		c2.setPrenom("Alain");
		Client c3 = new Client();
		c3.setNom("Durand");
		c3.setPrenom("Alain");
		Client c4 = new Client();
		c4.setNom("Durand");
		c4.setPrenom("Alain");
		Client c5 = new Client();
		c5.setNom("Durand");
		c5.setPrenom("Alain");
		Client c6 = new Client();
		c6.setNom("Durand");
		c6.setPrenom("Alain");
		Client c7 = new Client();
		c7.setNom("Durand");
		c7.setPrenom("Alain");
		Client c8 = new Client();
		c8.setNom("Durand");
		c8.setPrenom("Alain");
		Client c9 = new Client();
		c9.setNom("Durand");
		c9.setPrenom("Alain");
		Client c10 = new Client();
		c10.setNom("Durand");
		c10.setPrenom("Alain");
		
		clientService.save(c1);
		clientService.save(c2);
		clientService.save(c3);
		clientService.save(c4);
		clientService.save(c5);
		clientService.save(c6);
		clientService.save(c7);
		clientService.save(c8);
		clientService.save(c9);
		clientService.save(c10);
		
//		System.out.println(clientService.findByNom("Durand"));
		List<Client> clients = clientService.findAll();
		
		for (Client c : clients) {
			System.out.println(c);
		}
		
	}

}
