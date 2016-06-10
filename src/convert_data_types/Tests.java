package convert_data_types;

class A {
	A() {
		System.out.println("constructor of the class A");
	}

	{
		System.out.println("block of initialization of the class A");
	}
	static {
		System.out.println("STATIC block of initialization of the class A");
	}
}

class B extends A {
	B() {
		System.out.println("constructor of the class B");
	}

	{
		System.out.println("block of initialization of the class B");
	}
	static {
		System.out.println("STATIC block of initialization of the class B");
	}
}

class B2 extends B {
	B2() {
		System.out.println("constructor of the class B2");
	}

	{
		System.out.println("block of initialization of the class B2");
	}
	static {
		System.out.println("STATIC block of initialization of the class B2");
	}
}

class C extends A {
	C() {
		System.out.println("constructor of the class C");
	}

	{
		System.out.println("block of initialization of the class C");
	}
	static {
		System.out.println("STATIC block of initialization of the class C");
	}
}

class Tests {

	private void convertNum(Integer i1, Integer i2) {
		System.out.println("1");
	}

	private void convertNum(Integer i1, int i2) {
		System.out.println("2");
	}

	private void convertNum(int i1, Integer i2) {
		System.out.println("3");
	}

	private void convertNum(long long1, long long2) {
		System.out.println("4");
	}

	private void numbersOfConverts() {
		long l = 3;
		l = 5 + 'A' + l;
		System.out.println(l);
	}

	private void convertErrors() {
		// int a=b;
		// boolean c=(boolean)a;
		byte b = 1;
		int i = b;
		int i2 = 2;
		byte b2 = (byte) i2;
		int i3 = 3;
		float f = (float) i3;
	}

	private void initializationValues() {
		byte b = 100 - 100;
		System.out.println(b);
		// b=100+200; //error
		// b=100*100; //error
		byte b2 = (char) 50;
		byte b3 = 'a';
		// byte b4=(long)50; //error
	}

	private void whatIsTheType() {
		byte b = 1 + 2;
		System.out.println(Byte.valueOf(b).getClass().getName());
	}

	public static void main(String[] args) {
		Tests tests = new Tests();
		tests.convertNum(1, 1);
		tests.initializationValues();
		// System.out.println("/-----------------/");
		// A bToA=new B();
		System.out.println("/----------------------------------/");
		A b2ToA = new B2();
		System.out.println("/----------------------------------/");
		B bToB2 = new B2();
		System.out.println("/----------------------------------/");
		A cToA = new C();
		System.out.println("/----------------------------------/");
		tests.whatIsTheType();
	}
}
