package com.example.javafxpowto.client;

import com.example.javafxpowto.server.Server;

import java.net.Socket;

public class ClientThread {
    Socket socket;

    Server server;
    public void getMessage(String message){

    }

    public void sendMessage(String message){
        server.broadcast(message, this);
    }
}
