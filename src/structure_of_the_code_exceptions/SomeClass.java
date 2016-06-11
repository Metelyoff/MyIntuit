package structure_of_the_code_exceptions;

public class SomeClass {

	static int x;

	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		sc.test(5);
		System.out.println(x);
	}

	private void test(int x) {
		this.x = x + 5;
		System.out.println(x);
	}
}
