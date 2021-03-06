package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.math.Vector2;

public abstract class MovableEntity extends Entity {
	
	protected Vector2 velocity;
	protected float speed;
	protected float rotation;
	
	//TODO: Mass, etc. physics
	
	public MovableEntity(float speed, float rotation,Vector2 position,float width,float height){
		super(position, width, height);
		this.speed = speed;
		this.rotation = rotation;
	}
	
	abstract void update(float delta);

	/**
	 * @return the velocity
	 */
	public Vector2 getVelocity() {
		return velocity;
	}

	/**
	 * @param velocity the velocity to set
	 */
	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	/**
	 * @return the rotation
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * @param rotation the rotation to set
	 */
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

}
