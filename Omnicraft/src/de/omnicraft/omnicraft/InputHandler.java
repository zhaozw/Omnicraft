package de.omnicraft.omnicraft;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

import de.omnicraft.omnicraft.screens.MainGame;
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
		    case Keys.F3:
                if(MainGame.DEBUG){
                    MainGame.DEBUG = false;
                }else{
                    MainGame.DEBUG = true;
                }
			    break;
            case Keys.PLUS:
                if(renderer.cam.zoom > 0.3f){
                renderer.cam.zoom -= 0.1f;
                }else{
                    renderer.cam.zoom = 0.3f;
                }
                break;
            case Keys.MINUS:
                if(renderer.cam.zoom < 1.3f){
                renderer.cam.zoom += 0.1f;
                }else{
                    renderer.cam.zoom = 1.3f;
                }
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
        if(MainGame.DEBUG) System.out.println(screenX + " " + screenY);
        if(screenY < 10){
            renderer.camDY = 2;
            return  true;
        }
        if(screenY > Gdx.graphics.getHeight() - 10){
            renderer.camDY = -2;
            return true;
        }
        if(screenX > Gdx.graphics.getWidth() - 10) {
            renderer.camDX = 2;
            return true;
        }
		if(screenX < 10) {
            renderer.camDX = -2;
            return true;
        }else {
            renderer.camDX = 0;
            renderer.camDY = 0;
            return true;
        }
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}
