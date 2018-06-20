package io.jsd.training.binary;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.google.common.io.Files;

public class TrameTest {
	
	
	@Before
	public void init() throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("MiniDamSacem").getFile());
		byte[] trame = Files.toByteArray(file);
		byte[] time = Arrays.copyOfRange(trame, 0, 8);
		byte[] trameWithoutTime = Arrays.copyOfRange(trame, 8, trame.length - 8);
		System.out.println(trameWithoutTime.length);
	}
	
	@Test
	public void test() {
		
	}

}
