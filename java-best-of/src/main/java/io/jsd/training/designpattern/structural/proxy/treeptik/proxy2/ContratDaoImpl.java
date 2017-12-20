package io.jsd.training.designpattern.structural.proxy.treeptik.proxy2;

public class ContratDaoImpl implements ContratDao {

	@Override
	public void save() {
		System.out.println("save Contrat");

	}

	@Override
	public void remove() {
		System.out.println("remove Contrat");
	}

}
