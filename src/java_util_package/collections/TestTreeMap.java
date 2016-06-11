package java_util_package.collections;

import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("key", "String1");
		System.out.println(tm.get("key"));
		tm.put("key", "String2");
		System.out.println(tm.get("key"));
	}
}
