package de.omnicraft.omnicraft.screens;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.omnicraft.omnicraft.Omnicraft;
import de.omnicraft.omnicraft.TweenAnimations.SpriteTween;

public class SplashScreen implements Screen {
	
	Texture splashTexture;
	Sprite splashSprite;
	SpriteBatch batch;
	Omnicraft game;
	TweenManager manager;
	

	public SplashScreen(Omnicraft game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		manager.update(delta);
		
		batch.begin();
		splashSprite.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		splashTexture = new Texture("data/libgdx.png");
		splashTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		splashSprite = new Sprite(splashTexture);
		splashSprite.setColor(1, 1, 1, 0);
		splashSprite.setX(Gdx.graphics.getWidth() / 2 - splashSprite.getWidth() / 2);
		splashSprite.setY(Gdx.graphics.getHeight() / 2 - splashSprite.getHeight() / 2);
		
		batch = new SpriteBatch();
		
		Tween.registerAccessor(Sprite.class, new SpriteTween());
		
		manager = new TweenManager();
		
		TweenCallback cb = new TweenCallback() {
			
			@Override
			public void onEvent(int type, BaseTween<?> source) {
				TweenCompleted();
			}
		};
		
		Tween.to(splashSprite, SpriteTween.ALPHA, 3f).target(1).
		ease(TweenEquations.easeInQuad).repeatYoyo(1, 2.5f).setCallback(cb).setCallbackTriggers(TweenCallback.COMPLETE).
		start(manager);
	}

	private void TweenCompleted() {
		game.setScreen(new MainMenu(game));
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

	}

}
