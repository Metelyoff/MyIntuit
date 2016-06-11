package structure_of_the_code_exceptions;

public class TestIfElseClass {

	public static void main(String[] args) {
		TestIfElseClass ifElse = new TestIfElseClass();
		System.out.println("ANY, 1: " + ifElse.check("ANY", 1));
		System.out.println("NO, 2: " + ifElse.check("NO", 2));
		System.out.println("YES, 1: " + ifElse.check("YES", 1));
		System.out.println("YES, 2: " + ifElse.check("YES", 2));
		System.out.println("YES, 6: " + ifElse.check("ANY", 6));
	}

	private int check(String x, int n) {
		if (n == 0)
			return n;
		else if (n == 1) {
			if (x != null)
				return 5;
		} else if (n == 2 && x != null) {
			if (x.equals("YES"))
				return 3;
			else if (x.equals("NO"))
				return 4;
		}
		return -1;
	}
}
