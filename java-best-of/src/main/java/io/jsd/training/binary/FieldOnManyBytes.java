package io.jsd.training.binary;

public class FieldOnManyBytes extends Field {

	private final byte[] trame;
	private final FieldParams fieldParams;
	private final int byteNumber;
	private final int[]bitNumberByByte;

	public FieldOnManyBytes(byte[] trame, FieldParams fieldParams) {
		this.trame = trame;
		this.fieldParams = fieldParams;
		this.byteNumber = fieldParams.getByteNumber();
		this.bitNumberByByte = new int[byteNumber];
	}
	
	private void initBitNumberByByte() {
		int bitPosition = fieldParams.getBitPosition();
		int bitNumber = fieldParams.getBitNumber();
		for(int i=0; i<this.byteNumber; i++) {
			if(bitNumber<8) {
				bitNumberByByte[i]=bitNumber;
			} else {
				bitNumber=8-bitPosition;
				bitNumberByByte[i]=bitNumber;
				bitPosition=0;
			}
		}
	}

	@Override
	public int translate() {
		initBitNumberByByte();
		int[] field = new int[byteNumber];
		int bitOffset = 0;
		int bitPosition = fieldParams.getBitPosition();
		for(int i=0; i<byteNumber; i++) {
			
			int fieldPart = initField(this.trame, bitPosition, bitNumberByByte[i]);
			bitPosition=0;
			if(i>0) {
				bitOffset += bitNumberByByte[i-1];
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
	
	public String getCodeMission() {
		int codeMission = translate();
		byte[] codeByte = new byte[2];
		codeByte[0] = (byte) (((codeMission & 0xFFE0) >> 5) | 0x40);
		codeByte[1] = (byte) ((codeMission & 0x1F) | 0x40);
		return new String(codeByte);
	}


}
