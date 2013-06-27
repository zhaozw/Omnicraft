package de.omnicraft.omnicraft.blocks;

import com.badlogic.gdx.graphics.Texture;

public enum BlockType {
	AIR("data/air.png", null),STONE("data/stone.png", null),GRASS("data/grass.png", null),DIRT("data/dirt.png",null);
	public final String path;
	public Texture texture = null;
	
	
	private BlockType(String path, Texture texture) {
		this.path = path;
		this.texture = new Texture(path);
	}
}
