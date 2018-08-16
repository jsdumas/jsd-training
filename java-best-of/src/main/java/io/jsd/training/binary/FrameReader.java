package io.jsd.training.binary;

public class FrameReader {
	
	private final byte[] trame;
	
	
	public FrameReader(byte[] trame) {
		this.trame=trame;
	}
	
	public int fieldTranslator(FieldParams fieldParams) {
		if(fieldParams.getByteNumber()==1) {
			FieldOnOneByte fieldOnOneByte = new FieldOnOneByte(trame, fieldParams);
			return fieldOnOneByte.translate();
		}
		FieldOnManyBytes fieldOnManyBytes = new FieldOnManyBytes(trame, fieldParams);
		return fieldOnManyBytes.translate();
	}
	

}
