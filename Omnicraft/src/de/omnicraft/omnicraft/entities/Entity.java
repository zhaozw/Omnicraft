package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import de.omnicraft.omnicraft.world.World;

public abstract class Entity {

    //Basic Values
    protected float width,height;
    protected Vector2 position;
    protected float angle;

    //Box2D
    protected Body entityBody;
    protected BodyDef entityBodyDef;
    protected PolygonShape entityShape;
    protected float density;

    //Graphics
    protected Texture texture;


    protected Sprite sprite;

    //Constructors
    public Entity(Vector2 position){
        this.position = position;
        init();
    }

    protected void init(){
        entityBodyDef = new BodyDef();
        entityShape = new PolygonShape();

        entityBodyDef.type = BodyDef.BodyType.StaticBody;
        entityBodyDef.position.set(position);


        entityBody = World.world.createBody(entityBodyDef);

        entityShape.setAsBox(width / 2,height / 2);
        entityBody.setFixedRotation(true);
        entityBody.createFixture(entityShape,70);
        entityShape.dispose();

    }

    public void update(float delta){

    }

    public void draw(SpriteBatch batch){
        sprite.draw(batch);
    }

    public void dispose(){

    }

    //Getters and Setters
    public Sprite getSprite() {
        return sprite;
    }

}
