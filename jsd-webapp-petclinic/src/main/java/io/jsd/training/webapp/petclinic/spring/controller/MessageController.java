package io.jsd.training.webapp.petclinic.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import io.jsd.training.webapp.petclinic.dao.entity.Message;
import io.jsd.training.webapp.petclinic.service.MessageService;
import io.jsd.training.webapp.petclinic.service.ServiceException;

@Controller
@RequestMapping("/")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "list-message.do", method = RequestMethod.GET)
	public ModelAndView listMessage() {

		return new ModelAndView("list-message");
	}
	
	@RequestMapping(value="ajaxRefreshMessages.do", method = RequestMethod.GET, produces = "application/json")
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
