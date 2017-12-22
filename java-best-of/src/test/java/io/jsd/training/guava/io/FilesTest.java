package io.jsd.training.guava.io;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import com.google.common.io.Files;

public class FilesTest {

	private File tmpDir = new File(System.getProperty("java.io.tmpdir") + "/guava");
	private File sourceFile = new File(tmpDir, "source.txt");
	private File destFile = new File(tmpDir, "dest.txt");
	private File tmpSubDir = new File(tmpDir, "/subdir");

	private static final byte[] DATA = { 42, 42, 42, 42, 42 };
	private File file = new File(tmpDir, "test.bin");

	@Before
	public void prepareTest() throws IOException {
		tmpDir.mkdir();
		tmpSubDir.mkdir();
		sourceFile.delete();
		sourceFile.createNewFile();
		destFile.delete();
		FileWriter fw = new FileWriter(sourceFile);
		fw.write("Hello World");
		fw.close();

		file.delete();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(DATA);
		fos.close();

	}

	@Test
	public void copyFile() throws IOException {
		assertThat(sourceFile.exists(), is(true));
		assertThat(destFile.exists(), is(false));
		Files.copy(sourceFile, destFile);
		assertThat(sourceFile.exists(), is(true));
		assertThat(destFile.exists(), is(true));
	}

	@Test
	public void moveFile() throws IOException {
		assertThat(sourceFile.exists(), is(true));
		assertThat(destFile.exists(), is(false));
		Files.move(sourceFile, destFile);
		assertThat(sourceFile.exists(), is(false));
		assertThat(destFile.exists(), is(true));
	}

	@Test
	public void equal() throws IOException {
		Files.copy(sourceFile, destFile);
		assertThat(sourceFile.exists(), is(true));
		assertThat(destFile.exists(), is(true));
		assertThat(Files.equal(sourceFile, destFile), is(true));
	}

	@Test
	public void toByteArray() throws IOException {
		byte[] bytes = Files.toByteArray(file);
		assertThat(DATA, Matchers.equalTo(bytes));
	}

}
