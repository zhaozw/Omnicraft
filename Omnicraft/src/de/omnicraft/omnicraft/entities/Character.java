/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 
 * Represents a character, which can be an NPC or a PC
 * NPC further implement the TODO:NPC Interface 
 * to provide the AI Methods to them
 * 
 * PC implement the TODO:PlayableCharacter Interface
 * to provide them Methods to be player controlled
 * and with expanded stats, skills and inventory
 * 
 * Reminder: hostile NPC also use this class and the interface so i will have to 
 * distinguish them via fields or something similar
 * 
 * -Entity
 * --Movable Entity
 * ---Character
 * ----NPC
 * ----PC
 * -----Player :)
 * 
 * 
 */
package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.math.Vector2;

public class Character extends MovableEntity {
	
	protected int maxHealth;
	protected int maxArmor;
	protected int maxSpeed;
	
	
	//Weapon System will be used here too
	//TODO: Weapon System
	
	public Character(float speed, float rotation, Vector2 position,
			float width, float height) {
		super(speed, rotation, position);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void update(float delta) {
		// TODO Auto-generated method stub
		
	}
	
}
