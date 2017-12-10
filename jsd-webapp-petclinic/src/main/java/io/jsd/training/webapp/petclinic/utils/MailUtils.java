package io.jsd.training.webapp.petclinic.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailUtils {
	static Logger logger = LoggerFactory.getLogger(MailUtils.class);

	@Autowired
	private MailSender mailSender;

	public void sendMail(String to, String subject, String msg) {
		this.sendMail("treeptik.petclinic@gmail.com", to, subject, msg);
	}
	public void sendMail(String from, String to, String subject, String msg) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);

		mailSender.send(message);	
	}
	
	//
	//
	public MailSender getMailSender() {
		return mailSender;
	}
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
}
