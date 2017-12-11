package io.jsd.training.webapp.trainingcenter.jms;

import java.io.IOException;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsd.training.webapp.trainingcenter.dao.entity.Session;
import io.jsd.training.webapp.trainingcenter.service.ServiceException;
import io.jsd.training.webapp.trainingcenter.service.SessionService;

@MessageDriven(name="sessionListenerQueue", activationConfig = 
{@ActivationConfigProperty
		(propertyName="destinationLookup",
		propertyValue = "jms/queue/cfQueue"),
@ActivationConfigProperty
		(propertyName="destinationType", propertyValue="javax.jms.Queue") //ou javax.jms.Topic l'object qu'on écoute
})
public class SessionServiceListener implements MessageListener{
	
	@Inject
	SessionService sessionService;
	
	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Session session = mapper.readValue(textMessage.getText(), Session.class);
			sessionService.save(session);
			
			System.out.println(textMessage.getText());
		} catch (IOException | JMSException | ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
