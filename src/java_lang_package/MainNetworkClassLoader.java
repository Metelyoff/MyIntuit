package java_lang_package;

public class MainNetworkClassLoader {
	public static void main(String[] args) {
		try {
			ClassLoader loader = new NetworkClassLoader("localhost", 8085);
			Object main = loader.loadClass("MainNetworkClassLoader").newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
