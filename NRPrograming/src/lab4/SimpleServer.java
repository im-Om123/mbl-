package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        int sport = 156;
        try {
            ServerSocket serverSocket = new ServerSocket(sport);
            System.out.println("Server is listening on port " + sport);
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from client " + clientSocket);
                
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                
                String message = in.readLine();
                System.out.println("Received message from client: " + message);
                
                String response = "Hi, client";
                out.println(response);
                out.flush();
                System.out.println("Sent response to client: " + response);
                
                clientSocket.close();
                System.out.println("Connection closed");
            }
        } catch (IOException e) {
            System.err.println("Exception caught: " + e);
        }
    }
}

