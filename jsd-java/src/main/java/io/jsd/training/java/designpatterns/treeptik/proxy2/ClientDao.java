package io.jsd.training.java.designpatterns.treeptik.proxy2;

public interface ClientDao extends Dao {

	@Override
	void save();

	@Override
	void remove();

}
