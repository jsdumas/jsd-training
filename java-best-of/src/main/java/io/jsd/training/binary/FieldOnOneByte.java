package io.jsd.training.binary;

public class FieldOnOneByte extends Field {

	private final FieldParams fieldParams;
	private final byte[] trame;

	public FieldOnOneByte(byte[] trame, FieldParams fieldParams) {
		this.fieldParams = fieldParams;
		this.trame=trame;
	}

	@Override
	public int translate() {
		return initField(fieldParams);
	}
	
	@Override
	protected int initField(FieldParams fieldParams) {
		int bitSelected = selectBit(fieldParams);
		return field(fieldParams, bitSelected);
	}
	
	@Override
	protected int selectBit(FieldParams fieldParams) {
		int octet = unsignedByte(this.trame, fieldParams.getBytePosition());
		int mask = initMask(fieldParams);
		return (octet & mask);
	}
	
	@Override
	protected int field(FieldParams fieldParams, int bitSelected) {
		int lastBitPosition = fieldParams.getBitPosition()+fieldParams.getBitNumber();
		int offset = 8-lastBitPosition;
		return bitSelected >> offset;
	}
	
	@Override
	protected int initMask(FieldParams fieldParams) {
		int bitNumber = fieldParams.getBitNumber();
		int bitPosition = fieldParams.getBitPosition();
		int mask = 0;
		for(int i=0; i<bitNumber; i++) {
			mask+=BIT_WEIGHT[bitPosition];
			bitPosition++;
		}
		return mask;
	}

}
