package GameObject;

import java.awt.Image;

import Game.Build;

public class GameObject {
	
	public Image sprite;
	public int x;
	public int y;
	public int width;
	public int height;
	public int movement = 0;
	
	public GameObject(Image sprite, int x, int y, int scale){
		
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.width = sprite.getWidth(Build.mainGraphic) * scale;
		this.height = sprite.getHeight(Build.mainGraphic) * scale;
		
	}
	
}
