package io.jsd.training.webapp.petclinic.spring.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.dao.entity.Message;
import io.jsd.training.webapp.petclinic.spring.service.MessageService;
import io.jsd.training.webapp.petclinic.spring.service.ServiceException;

@Controller
@RequestMapping("/")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "list-message.do", method = GET)
	public ModelAndView listMessage() {

		return new ModelAndView("list-message");
	}
	
	@RequestMapping(value="ajaxRefreshMessages.do", method = GET, produces = "application/json")
	@ResponseBody
	public List<Message> refreshMessages(){
		try {
			return messageService.findAll();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
