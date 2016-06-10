package object_model_of_java;

public class StaticNonStaticVariables {
	static int a1 = 5;
	static int b1 = a1;

	// static int a=b; Cannot make a static reference to the non-static field b
	// int b=5;

	// static int a=StaticNonStaticVariables.b; Cannot make a static reference
	// to the non-static field SomeClass.b
	// int b=5;

	static int a2 = StaticNonStaticVariables.b2;
	static int b2 = 5;

	int a3 = StaticNonStaticVariables.b3;
	static int b3 = 5;
}
