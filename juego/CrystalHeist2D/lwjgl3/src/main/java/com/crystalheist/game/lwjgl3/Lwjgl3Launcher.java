package com.crystalheist.game.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.crystalheist.game.CrystalHeistGame;

public class Lwjgl3Launcher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(60);
        config.setTitle("CrystalHeist2D");
        config.setWindowedMode(800, 480);
        new Lwjgl3Application(new CrystalHeistGame(), config);
    }
}