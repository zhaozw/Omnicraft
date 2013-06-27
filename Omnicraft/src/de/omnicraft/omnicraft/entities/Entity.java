package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import de.omnicraft.omnicraft.world.World;

public abstract class Entity {

	protected  Vector2 position;
	protected float width;
	protected float height;
	protected Rectangle bounds;
	//protected int id;
	// TODO: Eventuell den Konstruktor überprüfen und die World nur einmal zuweisen lassen
	
	
	
	
	
	public Entity(Vector2 position,float width,float height){
		this.position = position;
		this.width = width;
		this.height = height;
		bounds = new Rectangle(position.x, position.y, width, height);
	}
	
	
	
	/**
	 * @return the position
	 */
	public Vector2 getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Vector2 position) {
		this.position = position;
	}
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	/**
	 * @return the bounds
	 */
	public Rectangle getBounds() {
		return bounds;
	}
	/**
	 * @param bounds the bounds to set
	 */
	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
	
	public float getX(){
		return position.x;
	}
	public void setX(float x){
		this.position.x = x;
	}
	public float getY(){
		return position.y;
	}
	public void setY(float y){
		this.position.y = y;
	}
}
