package Game;

import java.awt.event.*;

public class GameKeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {// this happenes while the key is held down

		if(e.getKeyCode() == (KeyEvent.VK_UP)){ //if the key code is the up arrow or w

			Build.character.y-=6; //moves the character upwards

		}else if(e.getKeyCode() == (KeyEvent.VK_LEFT)){

			Build.character.x-=6; //moves the character left

		}else if(e.getKeyCode() == (KeyEvent.VK_RIGHT)) {

			Build.character.x+=6; //moves the character right

		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){

			Build.character.y+=6; //moves the character down

		}else if(e.getKeyCode() == KeyEvent.VK_W){

			Build.character.y-=6;

		}else if(e.getKeyCode() == KeyEvent.VK_A){

			Build.character.x-=6;

		}else if(e.getKeyCode() == KeyEvent.VK_D){

			Build.character.x+=6;

		}else if(e.getKeyCode() == KeyEvent.VK_S){

			Build.character.y+=6;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
