package java_io_package;

import java.io.*;

public class TestByteArrayStream {
	public static void main(String[] args) {
		byte[] bytes = { 1, -1, 0 };
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		int readedInt = in.read(); // readedInt=1
		System.out.println("first element read is: " + readedInt);
		readedInt = in.read();
		// readedInt=255. Однако
		// (byte)readedInt даст значение -1
		System.out.println("second element read is: " + readedInt);
		readedInt = in.read(); // readedInt=0
		System.out.println("third element read is: " + readedInt);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(10);
		out.write(11);
		byte[] bytesWrite = out.toByteArray();
		System.out.println(bytesWrite[0]);
		System.out.println(bytesWrite[1]);
	}
}
