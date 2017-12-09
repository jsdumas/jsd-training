package io.jsd.training.designpatterns.treeptik.proxy2;

public class Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContratDao contratDao = DaoFactory.getContratDao();
		ClientDao clientDao = DaoFactory.getClientDao();

		contratDao.save();
		clientDao.save();

		contratDao.remove();
		clientDao.remove();

	}

}
