package main;

import java.io.IOException;
import java.net.ServerSocket;

import network.ServerNetwork;


/**
 * Created by qizilbash on 7/1/2016.
 */
public class ServerMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerNetwork serverNetwork = new ServerNetwork(new ServerSocket(9090));
    }
}
