package de.omnicraft.omnicraft.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class TestBox extends MovableEntity {


    public TestBox(float speed, float rotation,Vector2 position, float width,float height) {
		super(speed, rotation, position, width, height);
        this.texture = new Texture("data/TestChar.png");
	}


    @Override
    public void update(float delta) {
        super.update(delta);
        System.out.println("Test");
    }
}
