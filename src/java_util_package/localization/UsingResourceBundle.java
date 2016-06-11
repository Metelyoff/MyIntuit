package java_util_package.localization;

import java.util.*;

interface Behavior {
	public String getBehavior();

	public String getCapital();
}

class EnglishBehavior implements Behavior {
	public EnglishBehavior() {
	}

	public String getBehavior() {
		return "English behavior";
	}

	public String getCapital() {
		return "London";
	}
}

class RussianBehavior implements Behavior {
	public RussianBehavior() {
	}

	public String getBehavior() {
		return "Русский вариант поведения";
	}

	public String getCapital() {
		return "Москва";
	}
}

class MyResourceBundle_ru_RU extends ResourceBundle {
	Hashtable<String, Object> bundle = null;

	public MyResourceBundle_ru_RU() {
		bundle = new Hashtable<>();
		bundle.put("Bundle description", "Набор ресурсов для русской локали");
		bundle.put("Behavior", new RussianBehavior());
	}

	public Enumeration getKeys() {
		return bundle.keys();
	}

	protected Object handleGetObject(String key) throws java.util.MissingResourceException {
		return bundle.get(key);
	}
}

class MyResourceBundle_en_EN extends ResourceBundle {
	Hashtable<String, Object> bundle = null;

	public MyResourceBundle_en_EN() {
		bundle = new Hashtable<>();
		bundle.put("Bundle description", "English resource set");
		bundle.put("Behavior", new EnglishBehavior());
	}

	public Enumeration getKeys() {
		return bundle.keys();
	}

	protected Object handleGetObject(String key) throws java.util.MissingResourceException {
		return bundle.get(key);
	}
}

class MyResourceBundle2 extends ResourceBundle {
	Hashtable<String, Object> bundle = null;

	public MyResourceBundle2() {
		bundle = new Hashtable<>();
		bundle.put("Bundle description", "Default resource bundle");
		bundle.put("Behavior", new EnglishBehavior());
	}

	public Enumeration getKeys() {
		return bundle.keys();
	}

	protected Object handleGetObject(String key) throws java.util.MissingResourceException {
		return bundle.get(key);
	}
}

class UsingResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("java_util_package.localization.MyResourceBundle2",
				Locale.getDefault());
		System.out.println((String) rb.getObject("Bundle description"));
		Behavior be = (Behavior) rb.getObject("Behavior");
		System.out.println(be.getBehavior());
		System.out.println(be.getCapital());
		rb = ResourceBundle.getBundle("java_util_package.localization.MyResourceBundle2", new Locale("en", "EN"));
		System.out.println((String) rb.getObject("Bundle description"));
		Behavior be2 = (Behavior) rb.getObject("Behavior");
		System.out.println(be2.getBehavior());
		System.out.println(be2.getCapital());
	}
}
