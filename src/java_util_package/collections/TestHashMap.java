package java_util_package.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
	private class TestObject {
		String text = "";

		public TestObject(String text) {
			this.text = text;
		};

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static void main(String[] args) {
		/*
		 * HashMap hm = new HashMap(); Map syncMap =
		 * Collections.synchronizedMap(hm);
		 */
		TestHashMap t = new TestHashMap();
		TestObject to = null;
		HashMap<String, TestObject> hm = new HashMap<>();
		hm.put("Key1", t.new TestObject("Value 1"));
		hm.put("Key2", t.new TestObject("Value 2"));
		hm.put("Key3", t.new TestObject("Value 3"));
		to = (TestObject) hm.get("Key1");
		System.out.println("Object value for Key1 = " + to.getText() + "\n");
		System.out.println("Iteration over entrySet");
		Map.Entry<String, TestObject> entry = null;
		Iterator<?> it = hm.entrySet().iterator();
		// Итератор для перебора всех точек входа в Map
		while (it.hasNext()) {
			entry = (Map.Entry) it.next();
			System.out.println("For key = " + entry.getKey() + " value = " + ((TestObject) entry.getValue()).getText());
		}
		System.out.println();
		System.out.println("Iteration over keySet");
		String key = "";
		// Итератор для перебора всех ключей в Map
		it = hm.keySet().iterator();
		while (it.hasNext()) {
			key = (String) it.next();
			System.out.println("For key = " + key + " value = " + ((TestObject) hm.get(key)).getText());
		}
	}
}