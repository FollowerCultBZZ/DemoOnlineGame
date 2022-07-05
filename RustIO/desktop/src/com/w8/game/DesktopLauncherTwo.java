package com.w8.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.w8.game.client.Main;

public class DesktopLauncherTwo {

    public static void main (String[] arg) {
        new Thread(() -> {
            Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
            config.setForegroundFPS(60);
            config.setTitle("RustIO");
            new Lwjgl3Application(new Main(), config);
        }).start();
    }
}
