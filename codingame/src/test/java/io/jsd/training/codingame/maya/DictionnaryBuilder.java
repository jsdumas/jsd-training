package io.jsd.training.codingame.maya;

import io.jsd.training.codingame.maya.MayaNumberDictionary;

public class DictionnaryBuilder {

	private final int width;
	private final int height;
	private String[] dialect;
	private int id;

	public DictionnaryBuilder(int width, int height) {
		this.width = width;
		this.height = height;
		this.dialect = new String[height];
		this.id=0;
	}

	public DictionnaryBuilder with(Dialect dialect) {
		this.dialect[id] = (dialect.getCode());
		id++;
		return this;
	}

	public MayaNumberDictionary build() {
		return new MayaNumberDictionary(width, height, dialect);
	}

}
