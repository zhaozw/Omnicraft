package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;

public abstract class Entity {

    //Basic Values
    protected float width,height;
    protected Vector2 position;
    protected float angle;

    //Box2D
    protected Body entityBody;
    protected BodyDef entityBodyDef = new BodyDef();
    protected PolygonShape entityShape = new PolygonShape();

    //Graphics
    protected Texture texture;
    protected Sprite sprite;

    //Constructors
    public Entity(Vector2 position){
        this.position = position;
    }

    public void init(){

    }

    public void update(float delta){

    }

    public void draw(SpriteBatch batch){

    }

    public void dispose(){

    }

}
