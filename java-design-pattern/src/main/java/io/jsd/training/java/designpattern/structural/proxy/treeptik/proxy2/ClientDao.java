package io.jsd.training.java.designpattern.structural.proxy.treeptik.proxy2;

public interface ClientDao extends Dao {

	@Override
	void save();

	@Override
	void remove();

}
