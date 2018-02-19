package io.jsd.training.designpattern.behavioural.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int count;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while ((count = in.read()) >= 0) {
				System.out.print((char) count);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
