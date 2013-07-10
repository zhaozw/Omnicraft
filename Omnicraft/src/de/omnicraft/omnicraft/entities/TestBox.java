package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import de.omnicraft.omnicraft.world.World;


public class TestBox extends MovableEntity {

    private static float width;
    private static float height;


    public TestBox(float speed, float rotation,Vector2 position) {
		super(speed, rotation, position);



        this.texture = new Texture("data/TestChar.png");
        this.texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        this.sprite = new Sprite(texture,0,0,texture.getWidth(),texture.getHeight());

        width = sprite.getWidth();
        height = sprite.getHeight();

        entityBodyDef = new BodyDef();
        entityShape = new PolygonShape();


        entityBodyDef.type = BodyDef.BodyType.DynamicBody;
        entityBodyDef.position.set(position.x,position.y);


        entityBody = World.world.createBody(entityBodyDef);

        entityShape.setAsBox(width / 2,height / 2);
        entityBody.setFixedRotation(true);
        entityBody.createFixture(entityShape,1); //Later get the density from property list of entities
        entityShape.dispose();




	}



    @Override
    public void update(float delta) {
        super.update(delta);
        sprite.setPosition(position.x - (width/2),position.y - (width/2));
    }
}
