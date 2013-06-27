package com.omnicraft.omnicraft;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.omnicraft.omnicraft.Omnicraft;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Omnicraft";
		cfg.useGL20 = false;
		cfg.width = 1440;
		cfg.height = 900;
		
		new LwjglApplication(new Omnicraft(), cfg);
	}
}
