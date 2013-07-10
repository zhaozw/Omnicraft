package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.math.Vector2;

public abstract class MovableEntity extends Entity {
	
	protected Vector2 velocity; //Actual movement velocity (delta X Y)
	protected float speed;     //Movement speed
	protected float rotation;

	

	
	public MovableEntity(float speed, float rotation,Vector2 position){
		super(position);
		this.speed = speed;
		this.rotation = rotation;
	}

    @Override
    public void update(float delta) {
        super.update(delta);
    }


}
