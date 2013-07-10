package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import de.omnicraft.omnicraft.world.World;

public abstract class MovableEntity extends Entity {


	public MovableEntity(float speed, float rotation,Vector2 position){
		super(position);

	}


    @Override
    protected void init() {
        entityBodyDef = new BodyDef();
        entityShape = new PolygonShape();

        entityBodyDef.type = BodyDef.BodyType.DynamicBody;
        entityBodyDef.position.set(this.position);


        entityBody = World.world.createBody(entityBodyDef);

        entityShape.setAsBox(width / 2,height / 2);
        entityBody.setFixedRotation(true);
        entityBody.createFixture(entityShape,70);
        entityShape.dispose();
    }

    @Override
    public void update(float delta) {
        super.update(delta);
    }


}
