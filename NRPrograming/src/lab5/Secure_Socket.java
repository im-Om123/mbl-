package lab5;

package lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Secure_Socket {


	public static void main(String[] args) {
		try {
			SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			
			SSLSocket socket=(SSLSocket) factory.createSocket("google.com",443);
			
			BufferedReader input = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter (socket.getOutputStream(),true);
			
			
			//send a request to the server
			output.println("GET/HTTP/1.1");
			output.println("Host:google.com");
			output.println();
			
			//read and print the response
			
			String line;
			while ((line=input.readLine())!=null) {
				System.out.println(line);
			}
			//close the streams and socket
			input.close();
			output.close();
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
