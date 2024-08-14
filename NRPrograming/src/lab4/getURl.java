package lab4;

import java.net.URL;
import java.net.URLConnection;

public class getURl {
	public static void main(String[] args) {
		try {
		URL url = new URL("https://www.google.com");
		URLConnection connection = url.openConnection();
		System.out.println("URL of connection:" + connection.getURL());
		} catch (Exception e) {
		e.printStackTrace();
		}
	}}
