package io.jsd.training.java.algorithms.practice.array.resizablearray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) throws IOException {
		ResizableArray resizableArray = new ResizableArray(0);
		BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));
		while (true) {
			String line = bufferedReader.readLine();
			if (line == null)
				break;
			System.out.println(line);
			resizableArray.appendNewItemValue(Integer.parseInt(line));
		}
		System.out.println(resizableArray.getSize() + " lines");
		bufferedReader.close();
	}

}
