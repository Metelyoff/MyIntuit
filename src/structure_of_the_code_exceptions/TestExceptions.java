package structure_of_the_code_exceptions;

import java.util.Random;

public class TestExceptions {
	private void test(){ // you may add throws blocks, like throws StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException
		Random random = new Random();
		int randomNum=random.nextInt(10);
		if (randomNum < 5) {
			System.out.println(randomNum);
			throw new ArrayIndexOutOfBoundsException();
		} else {
			System.out.println(randomNum);
			throw new StringIndexOutOfBoundsException();
		}
	}

	public static void main(String[] args) {
		TestExceptions e = new TestExceptions();
		e.test();
	}
}
