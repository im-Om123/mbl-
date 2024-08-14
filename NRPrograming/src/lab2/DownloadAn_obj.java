package lab2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadAn_obj {
	public static void main(String[]args) {
		try {
			URL u = new URL("https://www.youtube.com");
			Object o=u.getContent();
			System.out.println("Hii, Ihave a"+o.getClass().getName());
		}
		catch(MalformedURLException ex) {
			System.err.println("It is no parsable URL");
		}
		catch(IOException ex) {
			System.err.println(ex);
		}
	}

}
