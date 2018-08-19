package io.jsd.training.binary;

public class FieldOnManyBytes extends Field {

	private final byte[] trame;
	private final FieldParams fieldParams;
	private final int byteNumber;
	private final int[]bitNumberByByte;
	private final int totalBitNumber;

	public FieldOnManyBytes(byte[] trame, FieldParams fieldParams) {
		this.trame = trame;
		this.fieldParams = fieldParams;
		this.byteNumber = fieldParams.getByteNumber();
		this.bitNumberByByte = new int[byteNumber];
		this.totalBitNumber = fieldParams.getBitNumber();
	}
	
	private void initBitNumberByByte() {
		int bitPosition = fieldParams.getBitPosition();
		System.out.println("bitPosition " + bitPosition);
		System.out.println("bitNumber " + totalBitNumber);
		int bitNumberRestant = this.totalBitNumber;
		for(int i=0; i<this.byteNumber; i++) {
			if(bitNumberRestant<8) {
				bitNumberByByte[i]=bitNumberRestant;
			} else {
				int fieldBitNumber = 8-bitPosition;
				bitNumberRestant-=fieldBitNumber;
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
		int bitPosition = fieldParams.getBitPosition();
		int bytePosition = fieldParams.getBytePosition();
		for(int i=0; i<byteNumber; i++) {
			int fieldPart = initField(this.trame[bytePosition], bitPosition, bitNumberByByte[i]);
			bitPosition=0;
			bytePosition++;
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
		int bitNumberRestant = totalBitNumber-bitNumberByByte[0];
		return (field[0] << bitNumberRestant) | field[1];
	}
	
	private int codeMission(int[] field) {
		int codeMission = mergeField(field);
		System.out.println("code decimal debug "+codeMission);
		byte[] codeByte = new byte[2];
		codeByte[0] = (byte) (((codeMission & 0xFFE0) >> 5) | 0x40);
		codeByte[1] = (byte) ((codeMission & 0x1F) | 0x40);
		System.out.println("code mission debug "+codeByte[0]+" "+codeByte[1]);
		System.out.println("code mission debug "+new String(codeByte));
		return (codeByte[0]<<5) | codeByte[1];
	}


}
