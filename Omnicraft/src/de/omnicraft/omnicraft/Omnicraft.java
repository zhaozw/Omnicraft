package de.omnicraft.omnicraft;

import com.badlogic.gdx.Game;

import de.omnicraft.omnicraft.screens.MainGame;
import de.omnicraft.omnicraft.screens.SplashScreen;


public class Omnicraft extends Game {
	
	
	@Override
	public void create() {
        setScreen(!MainGame.DEBUG ? new SplashScreen(this) : new MainGame(this));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {		
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
