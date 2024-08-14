package lab1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getLocalIPaddress {
public static void main(String[] args) {
	try {
		//get local host
		InetAddress localHost = InetAddress.getLocalHost();
		//Print the ip address of the local host
		System.out.println("Local IP Address:" +localHost.getHostAddress());
		//print the hostname of the local host
		System.out.println("Local Host Name:" + localHost.getHostName());
		
	}
	catch (UnknownHostException e) {
		System.err.println("Unable to determine the ip address of the local");
		e.printStackTrace();
	}
}
}
