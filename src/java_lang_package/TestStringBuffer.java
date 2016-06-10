package java_lang_package;

public class TestStringBuffer {

	public static void main(String[] args) {
		TestStringBuffer t = new TestStringBuffer();
		String s = new String("ssssss");
		StringBuffer sb = new StringBuffer("bbbsss");
		s.concat("-aaa");
		sb.append("-aaa");
		System.out.println(s);
		System.out.println(sb);
		// but
		s = s.concat("-aaa");
		System.out.println(s);

		StringBuffer sbABC = new StringBuffer("abc");
		String str = sbABC.append("e").insert(4, "f").insert(3, "d").toString();
		System.out.println(str);

		StringBuffer sbAAA = new StringBuffer("aaa");
		System.out.println("Before = " + sbAAA);
		t.doTest(sbAAA);
		System.out.println("After = " + sbAAA);

	}

	void doTest(StringBuffer theSb) {
		theSb.append("-bbb");
	}
}
