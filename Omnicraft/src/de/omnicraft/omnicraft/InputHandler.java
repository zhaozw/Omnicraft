package de.omnicraft.omnicraft;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

import de.omnicraft.omnicraft.world.World;

public class InputHandler implements InputProcessor {
	
	World world;
	Renderer renderer;
	
	public InputHandler(World world,Renderer renderer){
		this.world = world;
		this.renderer = renderer;
	}

	@Override
	public boolean keyDown(int keycode) {
		switch (keycode) {
		case Keys.W:
			
			break;

		default:
			break;
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
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
		System.out.println(screenX + " " + Gdx.graphics.getWidth());
		if(screenX > Gdx.graphics.getWidth() - 10){
			renderer.cam.translate(1, 0);
		}
		if(screenX < 10){
			renderer.cam.translate(-1, 0);
		}
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}
