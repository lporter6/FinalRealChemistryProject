package MolarMass;

import java.awt.*;
import javax.swing.*;

import Main.Start;

public class MolarMass {
	
	public static JPanel molarMassPanel = new JPanel(); // variable for molar mass panel
	public static String[] subscripts = {"0","1","2","3","4","5","6","7","8",
			"9","10","11","12","13","14","15",
			"16","17","18","19","20"}; // possible values for subscripts to be used for the combo box
	
	//These JTextFields and JComboBoxes belong to the molarMassPanel for inputs from users
	public static JTextField e1 = new JTextField(5); 
	public static JComboBox cb1 = new JComboBox(subscripts);
	public static JTextField e2 = new JTextField(5);
	public static JComboBox cb2 = new JComboBox(subscripts);
	public static JTextField e3 = new JTextField(5);
	public static JComboBox cb3 = new JComboBox(subscripts);
	public static JTextField e4 = new JTextField(5);
	public static JComboBox cb4 = new JComboBox(subscripts);
	public static JTextField e5 = new JTextField(5);
	public static JComboBox cb5 = new JComboBox(subscripts);
	public static JTextField e6 = new JTextField(5);
	public static JComboBox cb6 = new JComboBox(subscripts);
	public static JTextField e7 = new JTextField(5);
	public static JComboBox cb7 = new JComboBox(subscripts);
	public static JTextField e8 = new JTextField(5);
	public static JComboBox cb8 = new JComboBox (subscripts);
	public static JLabel answerMolarMass = new JLabel("Answer goes here");	
	public static JButton enterButtonMolarMass = new JButton("Enter");
	
	public static JTextField[] textFieldsMolarMass = {e1,e2,e3,e4,e5,e6,e7,e8};  //all of the JTextFields
	@SuppressWarnings("rawtypes")
	public static JComboBox[] comboBoxMolarMass = {cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8}; //all of the JComboBoxes
	
	public static void init(){
		
		molarMassPanel.setLayout(new GridBagLayout()); //adding the grid bag layout to the molarMassPanel
		GridBagConstraints c = Start.c;

		c.gridx = 0; 
		c.gridy = 0;
		c.gridwidth = 2;
		molarMassPanel.add(new JLabel("Enter in label for elements and check their subscripts in the combo box"),c); 
		c.gridwidth = 1; //reseting the gridwidth so that other JComponents don'tempTextField1 also occupy 2 grids
		
		c.gridx = 0;
		c.gridy = 1;
		molarMassPanel.add(e1,c); //adding the first JTextField
		
		c.gridx = 1;
		c.gridy = 1;
		molarMassPanel.add(cb1,c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 2;
		molarMassPanel.add(e2,c); //adding the second JTextField
		
		c.gridx = 1;
		c.gridy = 2;
		molarMassPanel.add(cb2, c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 3;
		molarMassPanel.add(e3,c); //adding the third JTextfield
		
		c.gridx = 1;
		c.gridy = 3;
		molarMassPanel.add(cb3, c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 4;
		molarMassPanel.add(e4,c); //adding the fourth JTextField
		
		c.gridx = 1;
		c.gridy = 4;
		molarMassPanel.add(cb4,c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 5;
		molarMassPanel.add(e5,c); //adding the fifth JTextField
		
		c.gridx = 1;
		c.gridy = 5;
		molarMassPanel.add(cb5, c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 6;
		molarMassPanel.add(e6,c); //adding the sixth JTextField
		
		c.gridx = 1;
		c.gridy = 6;
		molarMassPanel.add(cb6, c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 7;
		molarMassPanel.add(e7,c); //adding the seventh JTextField
		
		c.gridx = 1;
		c.gridy = 7;
		molarMassPanel.add(cb7, c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 8;
		molarMassPanel.add(e8,c); //adding the eighth JTextField
		
		c.gridx = 1;
		c.gridy = 8;
		molarMassPanel.add(cb8, c); //adding the cooresponding JComboBox for subscripts
		
		c.gridx = 0;
		c.gridy = 9;
		molarMassPanel.add(MolarMass.answerMolarMass, c); //adding the Label that will contain the answer
		
		c.gridx = 1;
		c.gridy = 9;
		MolarMass.enterButtonMolarMass.setActionCommand("Molar Enter"); //setting the action command to "Molar Enter"
		MolarMass.enterButtonMolarMass.addActionListener(Start.al1); //adding the one object as an action listener
		molarMassPanel.add(MolarMass.enterButtonMolarMass, c); //addint the button to the panel
		
	}
	
}
