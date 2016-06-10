package object_model_of_java;

interface SomeInterface {
}

interface SI2 extends SomeInterface {
}

class SC implements SomeInterface, SI2 {
}

public class PerformClass {

	static void perform() {
		System.out.println("perform");
	}

	// private PerformClass pc;
	private static PerformClass pc;

	public static void main(String[] args) {
		// pc.perform(); Cannot make a static reference to the non-static field
		// pc
		pc.perform();// The static method perform() from the type PerformClass
						// should be accessed in a static way
	}
}
