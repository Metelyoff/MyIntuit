package java_util_package.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		//List l = Collections.synchronizedList(new ArrayList(...)); 
		TestArrayList t = new TestArrayList();
		ArrayList<String> al = new ArrayList<>();
		al.add("First element");
		al.add("Second element");
		al.add("Third element");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
		System.out.println("\n");
		al.add(2, "Insertion");
		it = al.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}
}
