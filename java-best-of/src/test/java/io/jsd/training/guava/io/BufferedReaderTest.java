package io.jsd.training.guava.io;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;

import com.google.common.io.Files;

public class BufferedReaderTest {

	private static final Charset CHARSET = Charset.forName("UTF-8");
	private static final String DALTONS = "Joe Dalton\nJack Danton\nWilliam Dalton\nAverell Dalton";

	private File tmpDir = new File(System.getProperty("java.io.tmpdir") + "/guava");
	private File file = new File(tmpDir, "test.txt");

	@Before
	public void prepareTest() throws IOException {
		tmpDir.mkdir();
		file.delete();
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		fw.write(DALTONS);
		fw.close();
	}

	@Test
	public void newBufferedWriter() throws IOException {
		// Warning : the returned Writer does not append to the file, it overwrites.
		// To append, use Files.append() instead
		BufferedWriter writer = Files.newWriter(file, CHARSET);
		writer.write("Ma Dalton");
		writer.close();

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		assertThat(reader.readLine(), IsNull.nullValue());
		reader.close();
		assertThat(line, notNullValue());
		assertThat(line, Matchers.equalTo("Ma Dalton"));
	}

	@Test
	public void newBufferedReader() throws IOException {
		BufferedReader reader = Files.newReader(file, CHARSET);
		String line = reader.readLine();
		reader.close();

		assertThat(line, notNullValue());
		assertThat(line, Matchers.equalTo("Joe Dalton"));
	}

	@Test
	public void readLines() throws IOException {
		List<String> lines = Files.readLines(file, CHARSET);
		assertThat(lines, notNullValue());
		assertThat(lines.size(), Matchers.is(4));
		assertThat(lines.get(0), Matchers.equalTo("Joe Dalton"));
	}

}
