package lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPClient {
	public static void main(String[]args) {
		try {
			URL url= new URL("http://127.0.0.1:8000");
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			//set request method to get
			connection.setRequestMethod("GET");
			
			//send the request the receive the response
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			reader.close();
			connection.disconnect();
			
		}
		catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
	}

}
