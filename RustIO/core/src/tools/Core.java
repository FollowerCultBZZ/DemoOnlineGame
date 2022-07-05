package tools;

import java.util.HashMap;

import com.w8.game.client.MyClient;

import objects.ClientObject;

public class Core {
	public static HashMap<Integer, ClientObject> players = new HashMap<Integer, ClientObject>();
	public static int myId = MyClient.client.getID();
	public static ClientObject myPlayer = players.get(myId);
}
