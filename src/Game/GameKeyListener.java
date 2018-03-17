package Game;

import javax.imageio.ImageIO;
import java.awt.event.*;
import java.io.File;

public class GameKeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {// this happenes while the key is held down

		if(e.getKeyCode() == (KeyEvent.VK_UP)){ //if the key code is the up arrow or w

            try {
                Build.character.sprite = ImageIO.read(new File("images/Back.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == (KeyEvent.VK_LEFT)){

            try {
                Build.character.sprite = ImageIO.read(new File("images/Left.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == (KeyEvent.VK_RIGHT)) {

            try {
                Build.character.sprite = ImageIO.read(new File("images/Right.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){

            try {
               Build.character.sprite = ImageIO.read(new File("images/Front.png"));
            }catch(Exception ex){
               System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_W){

            try {
                Build.character.sprite = ImageIO.read(new File("images/Back.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_A){

            try {
                Build.character.sprite = ImageIO.read(new File("images/Left.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_D){

            try {
                Build.character.sprite = ImageIO.read(new File("images/Right.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_S){

            try {
                Build.character.sprite = ImageIO.read(new File("images/Front.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
