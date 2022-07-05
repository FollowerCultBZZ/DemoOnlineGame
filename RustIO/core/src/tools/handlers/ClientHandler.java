package tools.handlers;

import com.w8.game.client.MyClient;

import objects.ClientObject;
import objects.ServerPlayer;
import tools.Core;

public class ClientHandler {
	public static void addPlayer(ServerPlayer player) {
		Core.players.put(player.connection.getID(), new ClientObject());
	}
	public static void send(Object object) {
		MyClient.client.sendTCP(object);
	}
	public static void deletePlayer(int id) {
		Core.players.remove(id);
	}
}
