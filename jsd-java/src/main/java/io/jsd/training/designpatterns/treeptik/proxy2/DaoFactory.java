package io.jsd.training.designpatterns.treeptik.proxy2;

import java.lang.reflect.Proxy;

public class DaoFactory {

	public static ClientDao getClientDao() {
		return (ClientDao) Proxy.newProxyInstance(ClientDaoImpl.class.getClassLoader(), new Class[] { ClientDao.class }, new LogAspect());
	}

	public static ContratDao getContratDao() {
		return (ContratDao) Proxy
				.newProxyInstance(ContratDaoImpl.class.getClassLoader(), new Class[] { ContratDao.class }, new LogAspect());
	}

}
