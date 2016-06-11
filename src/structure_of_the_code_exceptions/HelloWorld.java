package structure_of_the_code_exceptions;

public class HelloWorld {

	public static void main(String[] args) {
		String[] arr = { "H", "e", "l", "l", "o", ", ", "W", "o", "r", "l", "d", "!" };
		String result = "";
		int i = 0;
		for (i = -1; i < arr.length - 1;) {
			System.out.print(arr[++i]);
		}
	}
}
