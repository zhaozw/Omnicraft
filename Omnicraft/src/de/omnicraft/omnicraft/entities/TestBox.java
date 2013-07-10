package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import de.omnicraft.omnicraft.world.World;


public class TestBox extends MovableEntity {


    public TestBox(float speed, float rotation,Vector2 position, float width,float height) {
		super(speed, rotation, position, width, height);
        this.texture = new Texture("data/TestChar.png");
        this.texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        this.sprite = new Sprite(texture,0,0,texture.getWidth(),texture.getHeight());

        entitiyBodyDef.type = BodyDef.BodyType.DynamicBody;
        entitiyBodyDef.position.set(this.position);


        entityBody = World.world.createBody(entitiyBodyDef);

        entitiyShape.setAsBox(width / 2,height / 2);
        entityBody.setFixedRotation(true);
        entityBody.createFixture(entitiyShape,70);
        entitiyShape.dispose();




	}


    @Override
    public void update(float delta) {
        super.update(delta);
        position = entityBody.getPosition();
    }
}
