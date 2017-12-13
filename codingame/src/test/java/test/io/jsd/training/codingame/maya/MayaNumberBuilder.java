package test.io.jsd.training.codingame.maya;

import io.jsd.training.codingame.maya.MayaNumber;

public class MayaNumberBuilder {

	private final MayaNumber mayaNumber;

	public MayaNumberBuilder(int lineNumber) {
		this.mayaNumber = new MayaNumber(lineNumber);
	}

	public MayaNumberBuilder width(Number line) {
		mayaNumber.addLine(line.getLine());
		return this;
	}

	public MayaNumber build() {
		return mayaNumber;
	}

}
