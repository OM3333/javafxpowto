package com.example.javafxpowto.server;


import com.example.javafxpowto.client.ClientThread;

import java.net.ServerSocket;
import java.util.List;

public class Server {
    ServerSocket serverSocket;

    List<ClientThread> clients;

    public void broadcast(String message, ClientThread sender){
        for(ClientThread client : clients){
            if(!client.equals(sender)){
                client.getMessage(message);
            }
        }
    }

    public void removeClient(ClientThread clientThread) {

    }
}
