package com.w8.game.client;

import com.esotericsoftware.kryonet.Client;
import com.w8.game.global.DisconnectEvent;
import com.w8.game.global.InputEvent;
import com.w8.game.global.JoinEvent;
import com.w8.game.global.MessageEvent;
import com.w8.game.global.PositionPacket;

import listeners.ClientListener;

import java.io.IOException;

public class MyClient {
    public static Client client;

    public MyClient() throws IOException {
        client = new Client();
        clientSettings(client);
    }

    public void clientSettings(Client client) throws IOException {
        client.getKryo().register(JoinEvent.class);
    	client.getKryo().register(InputEvent.class);
        client.getKryo().register(DisconnectEvent.class);
        client.getKryo().register(MessageEvent.class);
        client.getKryo().register(PositionPacket.class);
        client.addListener(new ClientListener());
        client.start();
        client.connect(500, "localhost", 8888);
    }
    public void send(Object object){
        client.sendTCP(object);
    }
}
