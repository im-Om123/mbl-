package lab2;

import java.net.URI;
import java.net.URL;

public class Relative_url {
	public static void main (String[] args) throws Exception {
		String baseurlString="https://www.google.com";
		String relativeUriString="/page.html";
		 URL burl=new URL(baseurlString);
		 URI ruri= new URI(relativeUriString);
		 
		 URI resolveduri=burl.toURI().resolve(ruri);
		 String resolvedUriString=resolveduri.toString();
		 
		 System.out.println("Resolved URI:"+resolveduri);
	}

}
