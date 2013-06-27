package de.omnicraft.omnicraft.blocks;

import com.badlogic.gdx.graphics.Texture;

public class Block {
	
	public static final int BLOCK_SIZE = 8;
	
	private BlockType type = BlockType.AIR;
	private Texture texture;
	private int x,y; //Location
	
	
	public Block(BlockType type, int x, int y) {
		this.setType(type);
		this.x = x;
		this.y = y;
		this.texture = type.texture;
	}
	
	
	


	/**
	 * @return the texture
	 */
	public Texture getTexture() {
		return texture;
	}


	/**
	 * @param texture the texture to set
	 */
	public void setTexture(Texture texture) {
		this.texture = texture;
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}





	/**
	 * @return the type
	 */
	public BlockType getType() {
		return type;
	}





	/**
	 * @param type the type to set
	 */
	public void setType(BlockType type) {
		this.type = type;
	}
	
}

