

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ssocket {
    public static void main(String[] args) {
        try {
            // create SSL socket factory
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

            // create socket
            SSLSocket socket = (SSLSocket) factory.createSocket("facebook.com", 443);

            // set up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream());

            // send a request to server
            output.println("GET / HTTP/1.1");
            output.println("Host: facebook.com");
            output.println();
            output.flush(); // flush the output stream to ensure the request is sent

            // read and print the response
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            // Close the streams and socket
            input.close();
            output.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
