package listeners;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.w8.game.global.*;

import objects.ServerPlayer;
import tools.handlers.ClientHandler;
public class ClientListener extends Listener{

	@Override
	public void connected(Connection connection) {
		ClientHandler.send(new JoinEvent());
	}

	@Override
	public void disconnected(Connection connection) {
		
	}

	@Override
	public void received(Connection connection, Object object) {
		if(object instanceof JoinEvent) {
			ServerPlayer serverPlayer = new ServerPlayer();
			serverPlayer.connection = connection;
			ClientHandler.addPlayer(serverPlayer);
		}
		if(object instanceof DisconnectEvent) {
			ClientHandler.deletePlayer(((DisconnectEvent)object).id);
		}
	}
	
}
