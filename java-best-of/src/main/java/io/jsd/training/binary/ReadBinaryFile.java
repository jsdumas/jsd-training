package io.jsd.training.binary;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadBinaryFile {

	public static void main(String[] args) throws IOException {

		// The name of the file to open.
		String fileName = "MiniDamKcvb";
		FileInputStream inputStream = new FileInputStream(fileName);
//		convertInputStreamToStringByteArrayOutputStream(inputStream);
		convertInputStreamToStringWithStringBuffer(inputStream);

	}

	private static void convertInputStreamToStringWithStringBuffer(FileInputStream inputStream) throws IOException {
		char[] buffer = new char[1024];
		Reader in = new InputStreamReader(inputStream, "UTF-8");
		StringBuilder sb = new StringBuilder();
		int length;
		while((length=in.read(buffer, 0, buffer.length))!=-1) {
			sb.append(buffer,0,length);
		}
		System.out.println(sb.toString());
	}

	private static void convertInputStreamToStringByteArrayOutputStream(FileInputStream inputStream) {
		try {
			// Use this for reading the data.
			byte[] buffer = new byte[1024];

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

			// read fills buffer with data and returns
			// the number of bytes read (which of course
			// may be less than the buffer size, but
			// it will never be more).
			int total = 0;
			int length = 0;
			while ((length = inputStream.read(buffer)) != -1) {
				// Convert to String so we can display it.
				// Of course you wouldn't want to do this with
				// a 'real' binary file.
				byteArrayOutputStream.write(buffer, 0, length);
				// System.out.println(new String(buffer));
				total += length;
			}
			System.out.println(byteArrayOutputStream.toString());
			// Always close files.
			inputStream.close();

			System.out.println("Read " + total + " bytes");
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" );//+ fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" );//+ fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

}
