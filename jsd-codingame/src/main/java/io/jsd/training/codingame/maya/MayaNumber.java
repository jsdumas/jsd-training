package io.jsd.training.codingame.maya;

import java.util.LinkedList;
import java.util.Queue;

public class MayaNumber {

	private final int lineNumber;
	private final Queue<String> lines;

	public MayaNumber(int lineNumber) {
		this.lineNumber = lineNumber;
		this.lines = new LinkedList<String>();
	}

	public void addLine(String line) {
		this.lines.add(line);
	}

	public Queue<String> getLines() {
		return lines;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public String getCode() {
		StringBuilder builder = new StringBuilder();
		for (String line : lines) {
			builder.append(line);
			builder.append("\n");
		}
		String res = builder.toString();
		String result = res.substring(0, res.length() - 1);
		return result;
	}
}
