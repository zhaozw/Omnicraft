package de.omnicraft.omnicraft;

import com.badlogic.gdx.Game;

import de.omnicraft.omnicraft.screens.MainGame;
import de.omnicraft.omnicraft.screens.SplashScreen;

import java.lang.reflect.InvocationTargetException;


public class Omnicraft extends Game {
	
	
	@Override
	public void create() {
        try {
            setScreen(!MainGame.DEBUG ? new SplashScreen(this) : new MainGame(this));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchMethodException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InvocationTargetException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
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
