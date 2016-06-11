package java_net_package;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetClass {
	public static void main(String args[]) {
		try {
			URL url = new URL("http://www.ru");
			LineNumberReader r = new LineNumberReader(new InputStreamReader(url.openStream()));
			String s = r.readLine();
			while (s != null) {
				System.out.println(s);
				s = r.readLine();
			}
			System.out.println(r.getLineNumber());
			r.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
