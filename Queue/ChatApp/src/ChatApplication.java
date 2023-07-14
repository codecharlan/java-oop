import java.io.*;
import java.net.*;

public class ChatApplication {
    public static void main(String[] args) {
        try {
            // Create a server socket and start listening for incoming connections
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Chat server started. Waiting for connections...");

            // Accept a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            // Create input and output streams for the client socket
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Create a separate thread to handle incoming messages from the client
            Thread messageThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("Client: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            messageThread.start();

            // Read messages from the console and send them to the client
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while ((message = consoleReader.readLine()) != null) {
                out.println(message);
            }

            // Close the connections
            messageThread.interrupt();
            serverSocket.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
