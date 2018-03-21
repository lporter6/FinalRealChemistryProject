package GameObject;

import java.awt.*;

import Game.Build;

public class GameObject {
	
	private Image sprite;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public GameObject(Image sprite, int x, int y, int scale){
		
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.width = sprite.getWidth(Build.mainGraphic) * scale;
		this.height = sprite.getHeight(Build.mainGraphic) * scale;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public Dimension getBottomLeft(){

		return new Dimension(this.x+0, this.y+this.height);

	}
	public Dimension getBottomRight(){

		return new Dimension(this.x + this.width, this.y + this.height);

	}
	public Dimension getTopRight(){

		return new Dimension(this.x+this.width, this.y+0);

	}
	public Dimension getTopLeft(){

		return new Dimension(this.x+0, this.y+0);

	}
}
