package structure_of_the_code_exceptions;

public class WhileClass {

	public static void main(String[] args) {
		int i = 0;
		while (i < 6) {
			if (i > 5)
				i--;
			if (i < 4)
				i++;
			if (i == 5)
				i++;
			i++;
			System.out.print(i);
		}
	}
}
