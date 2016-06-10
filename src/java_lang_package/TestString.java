package java_lang_package;

public class TestString {
	public static void main(String[] args) {
		String s1 = "Hello world !!!";
		String s2 = "Hello world !!!";
		System.out.println("String`s equally = " + (s1.equals(s2)));
		System.out.println("Strings are the same = " + (s1 == s2));
		String s3 = new String("Hello world !!!");
		System.out.println("String`s equally = " + (s1.equals(s2)));
		System.out.println("Strings are the same = " + (s1 == s3));
		String s = "prefix !";
		System.out.println(s);
		s = s.trim();
		System.out.println(s);
		s = s.concat(" suffix");
		System.out.println(s);
	}
}
