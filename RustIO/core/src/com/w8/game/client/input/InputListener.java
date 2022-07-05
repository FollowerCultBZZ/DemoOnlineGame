package com.w8.game.client.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.w8.game.global.InputEvent;

import tools.handlers.ClientHandler;

public class InputListener implements InputProcessor{
	
	InputEvent event = new InputEvent();

	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Input.Keys.W) event.up = true;
		ClientHandler.send(event);
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		if(keycode == Input.Keys.W) {
			event.up = false;
		}
		ClientHandler.send(event);
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}
}
