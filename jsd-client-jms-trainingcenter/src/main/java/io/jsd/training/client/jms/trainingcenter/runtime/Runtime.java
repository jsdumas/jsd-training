package io.jsd.training.client.jms.trainingcenter.runtime;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsd.training.client.jms.trainingcenter.model.Session;

public class Runtime {

	public static void main(String[] args) throws NamingException, JMSException, UnsupportedEncodingException, JsonProcessingException, ParseException {
		
		
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		
		for (int i = 0; i < 100; i++) {
		InitialContext context = new InitialContext();

		Queue queue = (Queue) context.lookup("jms/queue/cfQueue");
		
		QueueConnectionFactory factory = (QueueConnectionFactory) context
				.lookup("jms/RemoteConnectionFactory");
		
		QueueConnection connection = (QueueConnection) factory
				.createConnection();
		
		QueueSession session = (QueueSession) connection.createSession();

		
		TextMessage textMessage = session.createTextMessage();
		
		ObjectMapper mapper = new ObjectMapper();
		Session sessionFormation = new Session();
		Date dateDebut = formater.parse("10-06-2015");
		Date dateFin = formater.parse("13-06-2015");
		sessionFormation.setDateDeDebut(dateDebut);
		sessionFormation.setDateDeFin(dateFin);
		
		String message = mapper.writeValueAsString(sessionFormation);
		
		textMessage.setText(message);
		
		QueueSender sender = session.createSender(queue);
		sender.send(textMessage);
		connection.close();
		}

	}

}
