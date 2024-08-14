package lab2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Download {
public static void main(String[] args) {
		
		String webAddress= "https://bcanotesnepal.com/category/sixth-semester/network-programming/";
		String outputFileName= "C:\\Users\\unfor\\Downloads\spec.html";
		
		downloadWebPage(webAddress, outputFileName);
	}
	
	public static OutputStream outputStream= null;
	
	static void downloadWebPage(String webAddress, String outputFileName) {
		HttpURLConnection connection= null;
		BufferedReader reader= null;
		
		try {
			URL url= new URL(webAddress);
			connection= (HttpURLConnection) url.openConnection();
			
			if(connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
				System.err.println("Error: Unable to connect to the URL. Response code: " + connection.getResponseCode());
				return;
			}
			
			InputStream inputStream= connection.getInputStream();
			
			reader= new BufferedReader(new InputStreamReader(inputStream));
			
			outputStream= new FileOutputStream(outputFileName);
			
			String line;
			
			while((line= reader.readLine())!=null) {
				outputStream.write(line.getBytes());
				outputStream.write(System.lineSeparator().getBytes());
			}
			
			System.out.println("Web page downloaded sucessfully to "+ outputFileName);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				if(reader !=null) reader.close();
				if(outputStream != null) outputStream.close();
				if(connection !=null) connection.disconnect();
			}
			catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
