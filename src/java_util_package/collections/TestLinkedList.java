package java_util_package.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		TestLinkedList test = new TestLinkedList();
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Element1");
		ll.addFirst("Element2");
		ll.addFirst("Element3");
		ll.addLast("Element4");
		test.dumpList(ll);
		ll.remove(2);
		test.dumpList(ll);
		String element = (String) ll.getLast();
		ll.remove(element);
		test.dumpList(ll);
	}

	private void dumpList(LinkedList<String> list) {
		Iterator<String> it = list.iterator();
		System.out.println();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}
}
