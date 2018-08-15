package io.jsd.training.binary;

public class FrameReader {
	
	private final byte[] trame;
	private final int[] bitWeight;
	
	public FrameReader(byte[] trame) {
		this.trame=trame;
		this.bitWeight = new int[]{128, 64, 32, 16, 8, 4, 2, 1};
	}
	
	private int unsignedByte(int id) {
		return trame[id] & 0xff;
	}
	
	public int fieldTranslator(FieldParams fieldParams) {
		int bitSelected = selectBit(fieldParams);
		return field(fieldParams, bitSelected);
	}
	
	private int selectBit(FieldParams fieldParams) {
		int octet = unsignedByte(fieldParams.getBytePosition());
		int mask = initMask(fieldParams);
		return (octet & mask);
	}

	private int field(FieldParams fieldParams, int bitSelected) {
		int lastBitPosition = fieldParams.getBitPosition()+fieldParams.getBitNumber();
		int offset = 8-lastBitPosition;
		return bitSelected >> offset;
	}

	private int initMask(FieldParams fieldParams) {
		int bitNumber = fieldParams.getBitNumber();
		int bitPosition = fieldParams.getBitPosition();
		int mask = 0;
		for(int i=0; i<bitNumber; i++) {
			mask+=bitWeight[bitPosition];
			bitPosition++;
		}
		return mask;
	}

}
