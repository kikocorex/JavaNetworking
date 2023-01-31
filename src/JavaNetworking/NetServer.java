package JavaNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetServer {
    public static void main(String[] args) {

        try {
            System.out.println("Server started!");
            System.out.println("Waiting for clients...");

            // Create an object of a ServerSocket
            ServerSocket ss = new ServerSocket(9999);
            Socket soc = ss.accept(); // This method is a blocking call,
            // used for waiting incoming connections and will be placed in "soc".

            System.out.println("Connection established!\n");

            System.out.println("Address and port of socket is: " + soc.toString() );

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream())); //get the input from client
            String str = in.readLine();

            PrintWriter output = new PrintWriter(soc.getOutputStream(), true); //send back to client
            output.println("Hello i am from another class :) ");
            output.println("Server says " + str);
            output.println("Goodbye now");

        }  catch (UnknownHostException e) {
            System.out.println("IP address of host cannot be determined!");
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
        }  catch (IllegalArgumentException e) {
            System.out.println("Port parameter is outside the range of 0-65535");
            e.printStackTrace();
        } finally {
            System.out.println("\nProgram has been executed with no exceptions!");
        }


    }
}
