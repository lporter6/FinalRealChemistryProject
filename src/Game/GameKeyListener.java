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

			Build.character.y-= 30;//moves the character upwards
            try {
                Build.character.sprite = ImageIO.read(new File("images/Back.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == (KeyEvent.VK_LEFT)){

			Build.character.x-=30; //moves the character left
            try {
                Build.character.sprite = ImageIO.read(new File("images/Left.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == (KeyEvent.VK_RIGHT)) {

			Build.character.x+=30;//moves the character right
            try {
                Build.character.sprite = ImageIO.read(new File("images/Right.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){

			Build.character.y+= 30;//moves the character down
            try {
               Build.character.sprite = ImageIO.read(new File("images/Front.png"));
            }catch(Exception ex){
               System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_W){

			Build.character.y-=30;
            try {
                Build.character.sprite = ImageIO.read(new File("images/Back.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_A){

			Build.character.x-=30;
            try {
                Build.character.sprite = ImageIO.read(new File("images/Left.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_D){

			Build.character.x+=30;
            try {
                Build.character.sprite = ImageIO.read(new File("images/Right.png"));
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }

		}else if(e.getKeyCode() == KeyEvent.VK_S){

			Build.character.y+=30;
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
