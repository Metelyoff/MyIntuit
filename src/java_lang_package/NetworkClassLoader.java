package java_lang_package;

class NetworkClassLoader extends ClassLoader {
	String host;
	int port;

	public NetworkClassLoader(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public Class<?> findClass(String className) {
		byte[] bytes = loadClassData(className);
		return defineClass(className, bytes, 0, bytes.length);
	}

	private byte[] loadClassData(String className) {
		byte[] result = null;
		// open connection, load the class data
		return result;
	}
}