package java_util_package.localization;

import java.util.*;

class MyResource extends ResourceBundle {

	private Hashtable res = null;

	public MyResource() {
		res = new Hashtable();
		res.put("TestKey", "English Variant");
	}

	public Enumeration getKeys() {
		return res.keys();
	}

	protected Object handleGetObject(String key) throws java.util.MissingResourceException {
		return res.get(key);
	}
}

class MyResource_ru_RU extends ResourceBundle {
	private Hashtable res = null;

	public MyResource_ru_RU() {
		res = new Hashtable();
		res.put("TestKey", "Русский вариант");
	}

	public Enumeration getKeys() {
		return res.keys();
	}

	protected Object handleGetObject(String key) throws java.util.MissingResourceException {
		return res.get(key);
	}
}

public class TestResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("java_util_package.localization.MyResource", Locale.getDefault());
		System.out.println(rb.getString("TestKey"));
		rb = ResourceBundle.getBundle("java_util_package.localization.MyResource", new Locale("ru", "RU"));
		System.out.println(rb.getString("TestKey"));
	}
}
