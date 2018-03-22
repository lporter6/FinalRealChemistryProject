package Game;

import GameObject.*;
import Main.Start;
import PlayingField.TileMap;
import PlayingField.TilePiece;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
//import java.awt.*;

public class Build {
	
	public static JFrame frame = new JFrame("My Game");
	public static Graphic mainGraphic = new Graphic();
	public static GameKeyListener kl1 = new GameKeyListener();

    public static TileMap map = new TileMap(1,1);
	public static GameObject character;
	public static Image background;
	
	public static void init(){ //creates all the objects for the game
		frame.setSize(Start.screenDimension); //sets new frames size to 700px by 700px
		frame.setLocationRelativeTo(null); //sets location relative to nothing
		frame.setVisible(false); //sets its visibility to false until the button on Start.mainpanel is pushed
		frame.setContentPane(mainGraphic); //sets the frame's content pane to the main graphic
		frame.addKeyListener(kl1);
		try {
            character = new GameObject(ImageIO.read(new File("images/sprites/Front.png")), 0, 0, 2);
        }catch (Exception e){
		    e.printStackTrace();
        }

		while(true){
			try{
				mainGraphic.repaint();
				Thread.sleep(1);
				break;
			}catch(Exception e){
				System.out.print(e.getStackTrace());
			}
			
		}
		
	}
	
}
