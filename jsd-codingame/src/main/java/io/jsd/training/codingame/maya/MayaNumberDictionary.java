package io.jsd.training.codingame.maya;

import java.util.HashMap;
import java.util.Map;

public class MayaNumberDictionary {

	static final int MAYA_NUMERIC_SYSTEM = 20;
	private final int width;
	private final int height;
	private final Map<Integer, String> dictionary;
	private final String[] dialect;

	private void createDictionnary() {
		for (int i = 0; i < height; i++) {
			int firstIndex = 0;
			int lastIndex = width;
			for (int j = 0; j < MAYA_NUMERIC_SYSTEM; j++) {
				StringBuilder stBuilder = new StringBuilder();
				if (dictionary.get(j) != null) {
					stBuilder.append(dictionary.get(j));
				}
				stBuilder.append(dialect[i].substring(firstIndex, lastIndex));
				dictionary.put(j, stBuilder.toString());
				firstIndex = lastIndex;
				lastIndex = firstIndex + width;
			}
		}
	}

	public MayaNumberDictionary(int width, int height, String[] dialect) {
		this.width = width;
		this.height = height;
		this.dialect = dialect;
		this.dictionary = new HashMap<Integer, String>();
		createDictionnary();
	}

	public String getMayaNumber(int key) {
		return dictionary.get(key);
	}

	public Map<Integer, String> getDictionary() {
		return dictionary;
	}

	public int getHeight() {
		return height;
	}

	public String getMayaNumberSplited(int key) {
		String number = getMayaNumber(key);
		String res = "";
		int startId = 0;
		int endId = width;
		for (int i = 0; i < height; i++) {
			if (i == height - 1) {
				res += number.substring(startId);
			} else {
				res += number.substring(startId, endId) + "\n";
			}
			startId += width;
			endId += width;
		}
		return res;
	}

}
