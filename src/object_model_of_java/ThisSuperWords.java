package object_model_of_java;

class ChildThisSuperWords extends ThisSuperWords {
	public void perform() {
		super.perform();
		System.out.println("3");
	}

	public void perform(int val) {
		super.perform(); // Exception in thread "main"
							// java.lang.StackOverflowError
		System.out.println(val);
	}
}

public class ThisSuperWords {

	public void perform() {
		this.perform(1); // Exception in thread "main"
							// java.lang.StackOverflowError
		System.out.println("1");
	}

	public void perform(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {
		ThisSuperWords tsw = new ChildThisSuperWords();
		tsw.perform(4);
	}
}
