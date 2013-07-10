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
    public void update(float delta) {
        super.update(delta);
        position = entityBody.getPosition();
    }


}
