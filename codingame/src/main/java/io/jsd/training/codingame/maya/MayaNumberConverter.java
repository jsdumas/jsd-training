package io.jsd.training.codingame.maya;

import static io.jsd.training.codingame.maya.MayaNumberDictionary.MAYA_NUMERIC_SYSTEM;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class MayaNumberConverter {

	private final MayaNumberDictionary mayaDictionnary;

	public MayaNumberConverter(MayaNumberDictionary mayaDictionnary) {
		this.mayaDictionnary = mayaDictionnary;
	}

	private Queue<String> splitMayaNumber(Queue<String> lines) {
		Queue<String> mayaNumberSplited = new LinkedList<String>();
		while (!lines.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < mayaDictionnary.getHeight(); i++) {
				stringBuilder.append(lines.poll());
			}
			mayaNumberSplited.add(stringBuilder.toString());
		}
		return mayaNumberSplited;
	}

	public Long mayaNumberToDecimal(MayaNumber mayaNumber) {
		Queue<String> mayaNumberSplited = splitMayaNumber(mayaNumber.getLines());
		int power = mayaNumberSplited.size() - 1;
		Long result = 0L;
		while (!mayaNumberSplited.isEmpty()) {
			String line = mayaNumberSplited.poll();
			int value = 0;
			for (Map.Entry<Integer, String> entrySet : mayaDictionnary.getDictionary().entrySet()) {
				if (line.equals(entrySet.getValue())) {
					value = (int) (entrySet.getKey() * Math.pow(MAYA_NUMERIC_SYSTEM, power));
					break;
				}
			}
			result += value;
			power--;
		}

		return result;
	}

	public String decimalToMayaNumber(Long decimalNumber) {
		Stack<String> mayaNumber = new Stack<String>();
		Long currentNumber = decimalNumber;
		
		if(currentNumber.equals(0L)){
			mayaNumber.push(mayaDictionnary.getMayaNumberSplited(0));
		} else {
			while (currentNumber > 0) {
				int remain = (int) (currentNumber % MayaNumberDictionary.MAYA_NUMERIC_SYSTEM);
				currentNumber = currentNumber / MayaNumberDictionary.MAYA_NUMERIC_SYSTEM;
				mayaNumber.push(mayaDictionnary.getMayaNumberSplited(remain));
			}
		}

		return joinMayaNumber(mayaNumber);
	}

	private String joinMayaNumber(Stack<String> mayaNumber) {
		StringBuilder builder = new StringBuilder();
		while (!mayaNumber.isEmpty()) {
			builder.append(mayaNumber.pop());
			if (!mayaNumber.isEmpty()) {
				builder.append("\n");
			}
		}
		return builder.toString();
	}

}
