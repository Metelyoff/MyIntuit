package java_lang_package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestSystemClass {
	public static void main(String[] args) {
		System.out.println("Study Java");
		try {
			PrintStream print = new PrintStream(new FileOutputStream("file2.txt"));
			System.setOut(print);
			System.out.println("Study well");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
