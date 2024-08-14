package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.io.PrintWriter;

public class ClienSocket {
public static void main(String[] args) {
	String serverhostname="localhost";
	int sport=156;
	try {
		Socket clientSocket=new Socket(serverhostname, sport);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		PrintWriter out =new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
		String message = "hellow server!";
		out.println(message);
		out.flush();
		System.out.println("sent message to server:"+message);
		String response=in.readLine();
		System.out.println("Receinved response from server:"+response);
		
		clientSocket.close();
		System.out.println("connecton closed");
		
	}
	catch(IOException e) {
		System.err.println("exception caught:"+e);
	}
}
}
