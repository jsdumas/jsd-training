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
		return initField(this.trame[fieldParams.getBytePosition()], fieldParams.getBitPosition(), fieldParams.getBitNumber());
	}
	
}
