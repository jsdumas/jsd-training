package io.jsd.training.binary;

public abstract class Field {
	
	protected static final int[] BIT_WEIGHT = new int[]{128, 64, 32, 16, 8, 4, 2, 1};;
	
	public abstract int translate();
	protected abstract int initField(FieldParams fieldParams);
	protected abstract int selectBit(FieldParams fieldParams);
	protected abstract int field(FieldParams fieldParams, int bitSelected);
	protected abstract int initMask(FieldParams fieldParams);
	
	protected int unsignedByte(byte[] trame, int id) {
		return trame[id] & 0xff;
	}

}
