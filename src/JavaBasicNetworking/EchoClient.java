package JavaBasicNetworking;

import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {

        try { System.out.println("Client Started");
            Socket soc = new Socket("localhost", 9806); // (IP ADDRESS OF SERVER, PORT NUMBER)
            // use local host if client and server are in the same machine!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}