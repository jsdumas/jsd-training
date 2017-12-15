package io.jsd.training.java.designpattern.hf.structural.proxy.treeptik.proxy2;

import static java.lang.reflect.Proxy.newProxyInstance;

public class DaoFactory {

	public static ClientDao getClientDao() {
		return (ClientDao) newProxyInstance(ClientDaoImpl.class.getClassLoader(), new Class[] { ClientDao.class }, new LogAspect());
	}

	public static ContratDao getContratDao() {
		return (ContratDao) newProxyInstance(ContratDaoImpl.class.getClassLoader(), new Class[] { ContratDao.class }, new LogAspect());
	}

}
