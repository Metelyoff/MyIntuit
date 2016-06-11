package java_io_package;

import java.io.*;

public class TestFileStream {
	public static void main(String[] args) {
		byte[] bytesToWrite = { 1, 2, 3 };
		byte[] bytesReaded = new byte[10];
		String fileName = "/storage/emulated/0/AppProjects/MyIntuit/test.txt";
		FileOutputStream outFile = null;
		FileInputStream inFile = null;
		try {
			// Создать выходной поток
			outFile = new FileOutputStream(fileName);
			System.out.println("Файл открыт для записи");

			// Записать массив
			outFile.write(bytesToWrite);
			System.out.println("Записано: " + bytesToWrite.length + " байт");

			// По окончании использования должен быть закрыт
			// outFile.close();
			// System.out.println("Выходной поток закрыт");

			// Создать входной поток
			inFile = new FileInputStream(fileName);
			System.out.println("Файл открыт для чтения");

			// Узнать, сколько байт готово к считыванию
			int bytesAvailable = inFile.available();
			System.out.println("Готово к считыванию: " + bytesAvailable + " байт");

			// Считать в массив
			int count = inFile.read(bytesReaded, 0, bytesAvailable);
			System.out.println("Считано: " + count + " байт");
			for (int i = 0; i < count; i++)
				System.out.print(bytesReaded[i] + ",");
			System.out.println();
			// inFile.close();
			// System.out.println("Входной поток закрыт");
		} catch (FileNotFoundException e) {
			System.out.println("Невозможно произвести запись в файл: " + fileName);
		} catch (IOException e) {
			System.out.println("Ошибка ввода/вывода: " + e.toString());
		} finally {
			try {
				outFile.close();
				System.out.println("Выходной поток закрыт");
				inFile.close();
				System.out.println("Входной поток закрыт");
			} catch (IOException e) {
				System.out.println("Ошибка ввода/вывода: " + e.toString());
			}
		}
	}
}
