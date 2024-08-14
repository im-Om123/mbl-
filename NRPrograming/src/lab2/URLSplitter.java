	package lab2;
	
	import java.net.URL;
	
	public class URLSplitter {
	public static void main (String[] args) {
		String urlStrng="https://classroom.google.com/c/NjgwMTI4MTg3ODgx";
				try {
					URL url = new URL(urlStrng);
					 System.out.println("Scheme:"+url.getProtocol());
					 System.out.println("Authorty:"+url.getAuthority());
					 System.out.println("port:"+(url.getPort()==-1?"default":url.getPort()));
					 System.out.println("Host:"+url.getPort());
					 System.out.println("path:"+url.getPath());
					 System.out.println("Query:"+url.getQuery());
					 System.out.println("Fragment:"+url.getRef());
				}
		catch(Exception e) {
			System.err.println("Invalid URL:" + e.getMessage());
	}
	}}
