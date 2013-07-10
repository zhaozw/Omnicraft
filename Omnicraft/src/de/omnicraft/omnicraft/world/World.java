package de.omnicraft.omnicraft.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

import de.omnicraft.omnicraft.entities.Entity;
import de.omnicraft.omnicraft.entities.TestBox;

public class World {
	
	// Entities and Terrain
	public java.util.Vector<Entity> entities = new Vector<Entity>();
	public List<Chunk> chunks = new ArrayList<Chunk>();
	
	//Physic Stuff
	private com.badlogic.gdx.physics.box2d.World world;
	private com.badlogic.gdx.physics.box2d.BodyDef groundDef;
	private Vector2 gravity = new Vector2(0.0f, -10.0f);
	private boolean doSleep = true;
	
	
	
	
	
	
	public World(){
		
		world =  new com.badlogic.gdx.physics.box2d.World(gravity, doSleep);


        // Add some testing chunks
		chunks.add(new Chunk(0));
		chunks.add(new Chunk(1));
		chunks.add(new Chunk(2));
		chunks.add(new Chunk(3));
		chunks.add(new Chunk(4));
		chunks.add(new Chunk(5));
		chunks.add(new Chunk(6));

        //Add some test entities
        entities.add(new TestBox(1,0,new Vector2(10,10),32,32));

	}
	
}
