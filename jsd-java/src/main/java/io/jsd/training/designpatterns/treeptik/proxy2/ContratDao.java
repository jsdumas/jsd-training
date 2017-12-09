package io.jsd.training.designpatterns.treeptik.proxy2;

public interface ContratDao extends Dao {

	@Override
	void save();

	@Override
	void remove();

}
