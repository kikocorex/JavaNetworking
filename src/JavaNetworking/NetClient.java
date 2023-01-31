package JavaNetworking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class NetClient {
    public static void main(String[] args) {

        try { System.out.println("Client Started");
            Socket soc = new Socket("localhost", 9999); // (IP ADDRESS OF SERVER, PORT NUMBER)
            // use local host if client and server are in the same machine!

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // read user input
            System.out.println("Enter your name");
            String name = input.readLine(); //read user input

            PrintWriter output = new PrintWriter(soc.getOutputStream(), true); // output the user input
            output.println(name); //output the user input

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            if (in.readLine() != null) {
                System.out.println(in.readLine());
            }
            System.out.println("Input read completed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}