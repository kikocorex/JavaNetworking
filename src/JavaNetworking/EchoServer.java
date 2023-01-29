package JavaNetworking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        try { System.out.println("Waiting for clients...");
            // Create an object of a ServerSocket
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept(); // This method is a blocking call,
            // used for waiting incoming connections and will be placed in "soc".

            System.out.println("Connection established!");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
