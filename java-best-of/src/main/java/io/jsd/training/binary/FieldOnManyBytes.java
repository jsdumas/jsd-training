package io.jsd.training.binary;

public class FieldOnManyBytes extends Field {

	private final byte[] trame;
	private final FieldParams fieldParams;
	private int[]bitNumberByByte;

	public FieldOnManyBytes(byte[] trame, FieldParams fieldParams) {
		this.trame = trame;
		this.fieldParams = fieldParams;
	}

	@Override
	public int translate() {
		int byteNumber = fieldParams.getByteNumber();
		int[] field = new int[byteNumber];
		int bitOffset = 0;
		int bitPosition = fieldParams.getBitPosition();
		for(int i=0; i<byteNumber; i++) {
			int fieldPart = initField(fieldParams);
			bitOffset += 8-bitPosition;
			bitPosition=0;
			if(i==(i-1)) {
				fieldPart = fieldPart >> bitOffset;
			}
			field[i]=fieldPart;
		}
		return mergeField(field);
	}
	
	private int mergeField(int[] field) {
		int fieldMerged = 0;
		for(int i=0; i<field.length-1; i++) {
			fieldMerged = field[i] | field[i+1];
		}
		return fieldMerged;
	}

	@Override
	protected int initField(FieldParams fieldParams) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int selectBit(FieldParams fieldParams) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int field(FieldParams fieldParams, int bitSelected) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int initMask(FieldParams fieldParams) {
		// TODO Auto-generated method stub
		return 0;
	}

}
