package network;

import static java.lang.System.exit;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by Esi on 6/25/2016.
 */

public class ClientNetwork {


    private Socket server;
    private ObjectOutputStream serverOutputStream;
    private ObjectInputStream serverInputStream;

    private static ClientNetwork clientNetwork;

    public static ClientNetwork getInstance() throws IOException {
        if(clientNetwork == null){
            try {
                clientNetwork = new ClientNetwork(new Socket("", 9090));
                System.out.println("Connected to the Server.");
            }catch (Exception e){
                System.out.println("Server is not running!");
                System.out.println("Please run the server first.");
                exit(404);
            }
        }
        return clientNetwork;
    }


    public ClientNetwork(Socket server) throws IOException {
        this.server = server;
        serverOutputStream = new ObjectOutputStream(server.getOutputStream());
        serverInputStream = new ObjectInputStream(server.getInputStream());
    }


    public NetworkResponse sendRequest(NetworkRequest request) throws IOException, ClassNotFoundException {
        serverOutputStream.writeObject(request);
        return (NetworkResponse) serverInputStream.readObject();
    }


}
