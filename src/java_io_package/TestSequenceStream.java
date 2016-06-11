package java_io_package;

import java.io.*;
import java.util.*;

public class TestSequenceStream {
	public static void main(String[] args) {
		FileInputStream inFile1 = null;
		FileInputStream inFile2 = null;
		SequenceInputStream sequenceStream = null;
		FileOutputStream outFile = null;
		try {
			inFile1 = new FileInputStream("/storage/emulated/0/AppProjects/MyIntuit/src/java_io_package/file1.txt");
			inFile2 = new FileInputStream("/storage/emulated/0/AppProjects/MyIntuit/src/java_io_package/file2.txt");
			sequenceStream = new SequenceInputStream(inFile1, inFile2);
			outFile = new FileOutputStream("/storage/emulated/0/AppProjects/MyIntuit/src/java_io_package/file3.txt");
			int readedByte = sequenceStream.read();
			while (readedByte != -1) {
				outFile.write(readedByte);
				readedByte = sequenceStream.read();
			}
			/*
			 * Vector vector = new Vector(); vector.add(new
			 * StringBufferInputStream("Begin file1\n")); vector.add(new
			 * FileInputStream(
			 * "/storage/emulated/0/AppProjects/MyIntuit/src/java_io_package/file1.txt"
			 * )); vector.add(new StringBufferInputStream(
			 * "\nEnd of file1, begin file2\n")); vector.add(new
			 * FileInputStream(
			 * "/storage/emulated/0/AppProjects/MyIntuit/src/java_io_package/file2.txt"
			 * )); vector.add(new StringBufferInputStream("\nEnd of file2"));
			 * Enumeration en = vector.elements(); sequenceStream = new
			 * SequenceInputStream(en);
			 */
		} catch (IOException e) {
			System.out.println("IOException: " + e.toString());
		} finally {
			try {
				sequenceStream.close();
			} catch (IOException e) {
			}
			;
			try {
				outFile.close();
			} catch (IOException e) {
			}
		}
	}
}
