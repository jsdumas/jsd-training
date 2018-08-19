package io.jsd.training.binary;

public class FrameReader {
	
	private final byte[] trame;
	
	
	public FrameReader(byte[] trame) {
		this.trame=trame;
	}
	
	public int fieldTranslator(FieldParams fieldParams) {
		Field field;
		if(fieldParams.getByteNumber()==1) {
			field = new FieldOnOneByte(trame, fieldParams);
		} else {
			field = new FieldOnTwoBytes(trame, fieldParams);
		}
		return field.translate();
	}
	

}
