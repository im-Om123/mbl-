package lab1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddressTest {
	public static void main(String[] args) {
		String ipAddress ="192.168.3.0";
		try {
			//get local host
			InetAddress address = InetAddress.getByName(ipAddress);
			if(address instanceof java.net.Inet4Address) {
				System.out.println(ipAddress + " is an IPv4 address.");
			}
			else if(address instanceof java.net.Inet6Address) {
				System.out.println(ipAddress + " is an IPv6 address.");
			}
			else {
				System.out.println(ipAddress+"is not valid ip address.");
			}
			
			
		}
		catch (UnknownHostException e) {
			System.err.println("Unable to determine the ip address of the local");
			e.printStackTrace();
		}
	}
}
