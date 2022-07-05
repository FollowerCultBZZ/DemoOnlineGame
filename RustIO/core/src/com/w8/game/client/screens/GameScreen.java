package com.w8.game.client.screens;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.w8.game.client.MyClient;
import com.w8.game.client.input.InputListener;

public class GameScreen implements Screen{

	MyClient client;
	private Stage stage;
	
	@Override
	public void show() {
		stage = new Stage();
		Gdx.input.setInputProcessor(new InputListener());
		try {
			client = new MyClient();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}