package arrays;

public class Tests {

	/*
	 * { int b[]=new int[5]; for(int i=0;i<b.length;i++){ b[i]=Math.sqrt(i);Type
	 * mismatch: cannot convert from double to int } }
	 */

	private void print000() {
		int[] b = new int[] { 0, 0, 0 };
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

	public static void main(String[] args) {
		Tests tests = new Tests();
		tests.print000();
	}
}
