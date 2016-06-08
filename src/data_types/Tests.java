package data_types;

public class Tests {

	private void testDeclaration(){
		//int a=b;
		int a;
		int b=5;
		//int c=f=5;
	}

	private void testIncrement(){
		int a=5,b=6;
		a=b++;
		System.out.println("a="+a+"; b="+b);
	}

	public static void main(String[] args) {
		Tests tests=new Tests();
		tests.testIncrement();
		
	}
}
