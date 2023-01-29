package JavaNetworking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {
    public static void main(String[] args) {

        try {
            System.out.println("Server started!");
            System.out.println("Waiting for clients...");
            // Create an object of a ServerSocket
            ServerSocket ss = new ServerSocket(9999);
            Socket soc = ss.accept(); // This method is a blocking call,
            // used for waiting incoming connections and will be placed in "soc".

            System.out.println("Connection established!");

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream())); //get the input from client
            String str = in.readLine();

            PrintWriter output = new PrintWriter(soc.getOutputStream(), true); //send back to client
            output.println("Hello i am from another class :) ");
            output.println("Server says " + str);
            System.out.println("Goodbye now");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
