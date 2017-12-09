package io.jsd.training.designpatterns.treeptik.proxy2;

public interface ClientDao extends Dao {

	@Override
	void save();

	@Override
	void remove();

}
