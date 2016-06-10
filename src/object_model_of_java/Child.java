package object_model_of_java;

public class Child extends Parent {
	static int x = 3;

	public static void main(String[] args) {
		Parent child = new Child();
		child.print();
	}
}
