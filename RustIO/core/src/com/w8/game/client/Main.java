package com.w8.game.client;
import com.badlogic.gdx.Game;
import com.w8.game.client.screens.GameScreen;

public class Main extends Game{

	@Override
	public void create() {
		setScreen(new GameScreen());
	}
}
