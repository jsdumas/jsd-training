package io.jsd.training.java.designpattern.structural.proxy.treeptik.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogAspect implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName().startsWith("save"))
			System.out.println("Before Save");
		else if (method.getName().startsWith("remove"))
			System.out.println("Before remove");

		Class<?>[] interfaces = proxy.getClass().getInterfaces();

		for (Class<?> class1 : interfaces) {
			if (class1.getName().contains("ClientDao")) {
				ClientDao clientDao = new ClientDaoImpl();
				clientDao.getClass().getMethod(method.getName()).invoke(clientDao, args);
				break;
			} else if (class1.getName().contains("ContratDao")) {
				ContratDao contratDao = new ContratDaoImpl();
				contratDao.getClass().getMethod(method.getName()).invoke(contratDao, args);
				break;
			}
		}

		return null;
	}

}
