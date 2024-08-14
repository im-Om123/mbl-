package lab1;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class FindHost {
	public static void main(String[] args) {
		String ipAddress="127.0.0.1";
		try {
			InetAddress ia =InetAddress.getByName(ipAddress);
			System.out.println("Canonical Host Name for" + ipAddress + ":" +ia.getCanonicalHostName());
			
		}
		catch(UnknownHostException e) {
			System.err.println("hii, unable to find hostname for the given IP:"+ipAddress);
			e.printStackTrace();
		}
	}

}
