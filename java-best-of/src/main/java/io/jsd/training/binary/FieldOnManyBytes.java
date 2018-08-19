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
		System.out.println("bitPosition " + bitPosition);
		int totalBitNumber = fieldParams.getBitNumber();
		System.out.println("bitNumber " + totalBitNumber);
		for(int i=0; i<this.byteNumber; i++) {
			if(totalBitNumber<8) {
				bitNumberByByte[i]=totalBitNumber;
			} else {
				int fieldBitNumber = 8-bitPosition;
				totalBitNumber-=fieldBitNumber;
				bitNumberByByte[i]=fieldBitNumber;
				bitPosition=0;
			}
		}
		System.out.println("number by byte " + bitNumberByByte[0]+" "+bitNumberByByte[1]);
	}

	@Override
	public int translate() {
		initBitNumberByByte();
		int[] field = new int[byteNumber];
		int bitOffset = 0;
		int bitPosition = fieldParams.getBitPosition();
		int bytePosition = fieldParams.getBytePosition();
		for(int i=0; i<byteNumber; i++) {
			
			int fieldPart = initField(this.trame[bytePosition], bitPosition, bitNumberByByte[i]);
			bytePosition++;
			bitPosition=0;
			if(i>0) {
				bitOffset += bitNumberByByte[i-1];
				fieldPart = fieldPart >> bitOffset;
			}
			field[i]=fieldPart;
		}
		if(fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_0) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_1) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_2) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_3) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_4) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_5) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_6) || //
				fieldParams.getParam().equals(MiniDamBase.CODE_MISSION_BLOC_7)) {
			System.out.println("OK");
			return codeMission(field);
		}
		return mergeField(field);
	}
	
	private int mergeField(int[] field) {
		int fieldMerged = field[0];
		for(int i=0; i<field.length-1; i++) {
			fieldMerged = fieldMerged | field[i+1];
		}
		return fieldMerged;
	}
	
	private int codeMission(int[] field) {
		int codeMission = mergeField(field);
		byte[] codeByte = new byte[2];
		codeByte[0] = (byte) (((codeMission & 0xF800) >> 5) | 0x40);
		codeByte[1] = (byte) ((codeMission & 0x1F) | 0x40);
		System.out.println("code mission debug "+codeByte[0]+" "+codeByte[1]);
		return (codeByte[0]<<5) | codeByte[1];
	}


}
