package de.omnicraft.omnicraft.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

import de.omnicraft.omnicraft.InputHandler;
import de.omnicraft.omnicraft.Omnicraft;
import de.omnicraft.omnicraft.Renderer;
import de.omnicraft.omnicraft.entities.Entity;
import de.omnicraft.omnicraft.entities.MovableEntity;
import de.omnicraft.omnicraft.world.World;

public class MainGame implements Screen {
	Omnicraft game;
	Renderer renderer;
	World world;
	InputHandler inputHandler;
	
	public static boolean DEBUG = true;
	
	public MainGame(Omnicraft game){
		this.game = game;
		this.world = new World();
		this.renderer = new Renderer(world);
		this.inputHandler = new InputHandler(world,renderer);
		Gdx.input.setInputProcessor(inputHandler);
		
	}

	@Override
	public void render(float delta) {
		//Maybe move the clearing to the renderer
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        //Update all entities

        for (Entity entity : world.entities){
            entity.update(delta);
        }

		renderer.render();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		
	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
		//TODO: Disposing of all elements (world,renderer) via dispose() (not yet implemented)
	}

}
