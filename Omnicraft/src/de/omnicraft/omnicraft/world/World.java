package de.omnicraft.omnicraft.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import de.omnicraft.omnicraft.entities.Entity;
import de.omnicraft.omnicraft.entities.TestBox;

public class World {
	
	// Entities and Terrain
	public java.util.Vector<Entity> entities = new Vector<Entity>();
	public List<Chunk> chunks = new ArrayList<Chunk>();
	
	//Physic Stuff
	public static com.badlogic.gdx.physics.box2d.World world;
	private Vector2 gravity = new Vector2(0.0f, -10.0f);
	private boolean doSleep = true;

    private BodyDef groundBodyDef = new BodyDef();
    private PolygonShape groundBox = new PolygonShape();

    private float timeStep = 1.0f / 60.0f;

    private int velocityIterations = 6;
    private int positionIterations = 2;

    private Body body;

	
	
	
	
	
	
	public World(){
		
		world =  new com.badlogic.gdx.physics.box2d.World(gravity, doSleep);

        groundBodyDef.position.set(0.0f,-20.0f);
        Body groundBody = world.createBody(groundBodyDef);
        groundBox.setAsBox(50.0f,10.0f);
        groundBody.createFixture(groundBox,0.0f);


        //Box for testing purposes
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(0.0f,4.0f);
        body = world.createBody(bodyDef);

        PolygonShape dynamicBox = new PolygonShape();
        dynamicBox.setAsBox(1.0f,1.0f);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = dynamicBox;
        fixtureDef.density = 1.0f;
        fixtureDef.friction = 0.3f;

        body.createFixture(fixtureDef);






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

    public void updateWorld(){
        world.step(timeStep,velocityIterations,positionIterations);
        Vector2 position = body.getPosition();
    }
	
}
