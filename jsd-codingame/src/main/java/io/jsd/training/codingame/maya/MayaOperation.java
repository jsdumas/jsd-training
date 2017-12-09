package io.jsd.training.codingame.maya;

public class MayaOperation {

	private final Long fNumber;
	private final Long sNumber;
	private final MayaNumberConverter mayaNumberConverter;

	public MayaOperation(MayaNumberDictionary mayaDictionnary, MayaNumber firstNumber, MayaNumber secondNumber) {
		this.mayaNumberConverter = new MayaNumberConverter(mayaDictionnary);
		this.fNumber = mayaNumberConverter.mayaNumberToDecimal(firstNumber);
		;
		this.sNumber = mayaNumberConverter.mayaNumberToDecimal(secondNumber);
	}

	public Long calcul(String operator) {
		Long result = null;
		switch (operator) {
			case "+":
				result = fNumber + sNumber;
				break;
			case "-":
				result = fNumber - sNumber;
				break;
			case "/":
				result = fNumber / sNumber;
				break;
			case "*":
				result = fNumber * sNumber;
				break;

		}
		return result;
	}

}
