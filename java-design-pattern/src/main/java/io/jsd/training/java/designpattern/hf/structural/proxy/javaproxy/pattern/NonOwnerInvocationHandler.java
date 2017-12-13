package io.jsd.training.java.designpattern.hf.structural.proxy.javaproxy.pattern;
 
import java.lang.reflect.*;

import io.jsd.training.java.designpattern.hf.structural.proxy.javaproxy.person.PersonBean;
 
public class NonOwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
