package java_util_package.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestVectorComparator {
	private class TestObject {
		private String name = "";

		public TestObject(String name) {
			this.name = name;
		}
	}

	private class MyComparator implements Comparator<Object> {
		public int compare(Object l, Object r) {
			String left = (String) l;
			String right = (String) r;
			return -1 * left.compareTo(right);
		}
	}

	public static void main(String[] args) {
		TestVectorComparator test = new TestVectorComparator();
		Vector<String> v = new Vector<>();
		v.add("B");
		v.add("A");
		v.add("C");
		System.out.println("Default elements order");
		test.dumpList(v);
		Collections.sort(v);
		System.out.println("Default sorting order");
		test.dumpList(v);
		System.out.println("Reverse sorting order with providing imlicit comparator");
		Collections.sort(v, test.new MyComparator());
		test.dumpList(v);
	}

	private void dumpList(List<String> l) {
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
