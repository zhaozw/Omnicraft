package de.omnicraft.omnicraft;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

import de.omnicraft.omnicraft.blocks.Block;
import de.omnicraft.omnicraft.entities.Entity;
import de.omnicraft.omnicraft.world.Chunk;
import de.omnicraft.omnicraft.world.World;

public class Renderer {
	
	World world;
	SpriteBatch batch;
	ShapeRenderer shapeRenderer;
	OrthographicCamera cam;
    int camDX,camDY;
	
	
	public Renderer(World world){
		this.world = world;
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		cam = new OrthographicCamera();
		cam.setToOrtho(false);
	}
	
	public void render(){
        cam.translate(camDX, camDY);
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		shapeRenderer.setProjectionMatrix(cam.combined);

		batch.begin();
		for(Chunk chunk : world.chunks){
			for(int x = 0; x < Chunk.CHUNKWIDTH;x++){
				for(int y = 0; y < Chunk.CHUNKHEIGHT; y++){
					batch.draw(chunk.getBlock(x, y).getTexture(),chunk.getBlock(x, y).getX(),
							   chunk.getBlock(x, y).getY(),Block.BLOCK_SIZE,Block.BLOCK_SIZE);

				}
			}
		}
        for (Entity entity : world.entities)
            batch.draw(entity.getTexture(), entity.getX(), entity.getY(), entity.getWidth(), entity.getHeight());
		batch.end();

	}
}
