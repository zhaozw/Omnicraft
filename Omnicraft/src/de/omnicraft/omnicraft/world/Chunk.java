package de.omnicraft.omnicraft.world;

import de.omnicraft.omnicraft.blocks.Block;
import de.omnicraft.omnicraft.blocks.BlockType;

public class Chunk {
	public static final int CHUNKWIDTH = 64;
	public static final int CHUNKHEIGHT = 256;
	private Block[][] blocks = new Block[CHUNKWIDTH][CHUNKHEIGHT];
	private int chunkOffset = 0;
	
	public Chunk(int offset){
		this.chunkOffset = offset;
		for(int x = 0; x < CHUNKWIDTH ;x++){
			for(int y = 0; y < (CHUNKHEIGHT);y++){
				blocks[x][y] = new Block(BlockType.STONE,(x * Block.BLOCK_SIZE) + chunkOffset * CHUNKWIDTH * Block.BLOCK_SIZE,(y * Block.BLOCK_SIZE));
			}
		}
	}
	
	public Block[][] getBlocks() {
		return blocks;
	}

	public void setBlocks(Block[][] blocks) {
		this.blocks = blocks;
	}
	
	public Block getBlock(int x,int y){
		return blocks[x][y];
	}
}
