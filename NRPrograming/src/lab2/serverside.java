package lab2;
import java.io.*;
import java.net.*;
public class serverside {
	
		 public static void main(String[] args) throws Exception {
		        String url = "https://www.google.com";
		        String charset = "UTF-8";
		        String param1 = "value1";
		        String param2 = "value2";
		        
		        String query = String.format("param1=%s&param2=%s",
		            URLEncoder.encode(param1, charset),
		            URLEncoder.encode(param2, charset));
		        
		        HttpURLConnection connection = (HttpURLConnection) new URL(url + "?" + query).openConnection();
		        connection.setRequestMethod("GET");
		        connection.setRequestProperty("Accept-Charset", charset);
		        
		        InputStream responseStream = connection.getInputStream();
		        BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream));
		        
		        String line;
		        while ((line = reader.readLine()) != null) {
		            System.out.println(line);
		        }
		        
		        reader.close();
		        connection.disconnect();
		    }

	}


