package Game;


import java.awt.*;
import javax.swing.*;

public class Graphic extends JPanel{
	
	public Graphics2D g2d;
	
	
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g){
		
		g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //adds smooth moving
		g2d.drawImage(Build.character.sprite, Build.character.x, Build.character.y, Build.character.width, Build.character.height,this);
	}
	
}
