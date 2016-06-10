package structure_of_the_code_exceptions;

public class TestLabelBreakContinue {

	public static void main(String[] args) {
		TestLabelBreakContinue tlbc = new TestLabelBreakContinue();
		tlbc.test();
	}

	void test() {
		TestLabelBreakContinue: {
			test: for (int i = 0; true; i++) {
				if (i % 2 == 0)
					continue test;
				if (i > 10)
					break TestLabelBreakContinue;
				System.out.print(i);
			}
		}
	}
}
