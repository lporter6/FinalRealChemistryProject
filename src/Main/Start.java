/**

Original Author: Logan Porter

Brought Back To Life: By Logan Porter

Change Activity:

	03/11/18   WLP   0.0   Made intial files and objects


 */


package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start {
	
	public static JFrame frame = new JFrame("Mainframe"); //variable for the frame
	
	public static JPanel mainpanel = new JPanel(); //variable for the panel
	public static DisplayMode mode = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode(); //DisplayMode used to find the display mode for the current display
	public static Dimension screenDimension; //stores dimension of the current scree
	
	public static JButton molarMassButton = new JButton("Molar Mass"); //button for the molar mass
	public static JButton gasLawsButton = new JButton("Gas Laws"); //button for the gas laws
	public static JButton gameButton = new JButton("Game"); //button for Logan's game
	
	public static JButton homeButton = new JButton("Home");
	
	public static GridBagConstraints c = new GridBagConstraints(); //constraints for how to add objects to panels
	public static MainFrameActionListener al1 = new MainFrameActionListener(); //single action listener object for all the buttons
	
	public static void main(String[] args){
		
		ElementData.ElementMolarMass.createData(); //calls the createData function from my seperate package
		initialize(); //initializing the graphics
		
	}
	
	public static void initialize(){
		
		screenDimension = new Dimension(mode.getWidth(), mode.getHeight()); //getting the screen dimension from the device
		
		//FRAME ATTRIBUTES
		frame.setSize(screenDimension); //setting the size of the window to the dimensions of the screen
		frame.setVisible(true); //setting it to true
		frame.setLocationRelativeTo(null); //setting its loation relative to nothing
		frame.setContentPane(mainpanel); //adding the panel to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //making the default operation for the x button  

		//HOME BUTTON ATTRIBUTES
		homeButton.setActionCommand("Home");
		homeButton.addActionListener(al1);
		
		//MAIN PANEL ATTRIBUTES
		mainpanel.setLayout(new GridBagLayout()); //adding flow layout to the panel: GridLayout(int rows, int cols, int hgap, int vgap)
			//Molar
			mainpanel.add(molarMassButton); //adding the button to the panel
			molarMassButton.setMnemonic(KeyEvent.VK_M); //sets the key value for hitting the button with a key rather than a click
			molarMassButton.setActionCommand("MolarMass"); //sets the action command the "MolarMass" for actionListeners to read
			molarMassButton.addActionListener(al1); //adding the action listener al1 that listens for the ActionCommand
			//Gas
			mainpanel.add(gasLawsButton); //Adds gas laws button
			gasLawsButton.setMnemonic(KeyEvent.VK_G); //sets the key value for hitting the button with a key rather than a click
			gasLawsButton.setActionCommand("GasLaws"); //sets the action command the "GasLaws" for actionListeners to read
			gasLawsButton.addActionListener(al1); //adding the action listener al1 that listens for the ActionCommand
			//Game
			mainpanel.add(gameButton);
			gameButton.setActionCommand("Game");
			gameButton.setMnemonic(KeyEvent.VK_A);
			gameButton.addActionListener(al1);
		//MOLAR MASS PANEL ATTRIBUTES
		MolarMass.MolarMass.init(); //adds the molar mass panel
		
		//GAS PANEL ATTRIBUTES
		GasLaws.GasLaws.init();
		
		//BENS PANEL ATTRIBUTES
		GasLaws.GasLaws.init(); //adds the gas laws panel
		
		//GAME ATTRIBUTES
		Game.Build.init();
		
	}
}