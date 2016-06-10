package convert_data_types;

class Child1 extends Parent {
	public void print() {
		System.out.println("Child1");
	}
}

class Child2 extends Parent {
	public void print() {
		System.out.println("Child2");
	}
}

public class Parent {

	public void print() {
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		Parent child1ToParent = new Child1();
		((Parent) child1ToParent).print();
		((Child1) child1ToParent).print();
		((Child2) child1ToParent).print();
	}
}
