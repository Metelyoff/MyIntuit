package structure_of_the_code_exceptions;

public class SwitchCaseClass {

	public static void main(String[] args) {
		SwitchCaseClass switchCase = new SwitchCaseClass();
		switchCase.say(1);
	}

	private void say(int digit) {
		switch (digit) {
		case 1:
			System.out.print("1");
			break;
		case 2:
			System.out.print("2");
		case 3:
			System.out.print("3");
		default:
			System.out.print("Unknown");
		}
	}
}
