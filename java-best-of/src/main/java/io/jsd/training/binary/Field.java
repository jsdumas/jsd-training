package io.jsd.training.binary;

public abstract class Field {
	
	protected static final int[] BIT_WEIGHT = new int[]{128, 64, 32, 16, 8, 4, 2, 1};;
	
	public abstract int translate();
	
	protected int unsignedByte(byte[] trame, int id) {
		return trame[id] & 0xff;
	}
	
	protected int initMask(int bitNumber, int bitPosition) {
		int mask = 0;
		for(int i=0; i<bitNumber; i++) {
			mask+=BIT_WEIGHT[bitPosition];
			bitPosition++;
		}
		return mask;
	}
	
	protected int selectBit(byte[] trame, int bitNumber, int bitPosition) {
		int octet = unsignedByte(trame, bitPosition);
		int mask = initMask(bitNumber, bitPosition);
		return (octet & mask);
	}
	
	protected int field(int bitPosition, int bitNumber, int bitSelected) {
		int lastBitPosition = bitPosition+bitNumber;
		int offset = 8-lastBitPosition;
		return bitSelected >> offset;
	}
	
	protected int initField(byte[] trame, int bitPosition, int bitNumber) {
		int bitSelected = selectBit(trame, bitNumber, bitPosition);
		return field(bitPosition, bitNumber, bitSelected);
	}

}
