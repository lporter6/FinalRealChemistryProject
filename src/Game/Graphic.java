package Game;


import PlayingField.TileMap;

import java.awt.*;
import javax.swing.*;

public class Graphic extends JPanel{
	
	public Graphics2D g2d;

	
	
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g){
		
		g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //adds smooth moving
		Build.map.drawTilePiece(g2d);
		g2d.drawImage(Build.character.getSprite(), Build.character.getX(), Build.character.getY(), Build.character.getWidth(), Build.character.getHeight(),this);
	}
	
}
