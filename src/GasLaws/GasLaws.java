package GasLaws; 

import java.awt.*;
import javax.swing.*;

import Main.Start;
/*
TO DO LIST:
1. Add PN equation
2. Add NT equation
3. Add all the buttons
4. Add them all in MainFramActionListener
 4a. Add all the JLabels with the answer
5. Add Back button into everything
6. Add comments
7. Makes sure everything works
8. Celebrate, you can kill yourself now
 */


public class GasLaws {

	//Makes the main panel everything in this will be stored in
	public static JPanel gasLawsPanel = new JPanel();

	//Volume Panels
	public static JPanel volumePanel = new JPanel();
	//Equation Panels
	public static JPanel volumePV_Panel = new JPanel();
	public static JPanel volumeVT_Panel = new JPanel();
	public static JPanel volumePVT_Panel = new JPanel();
	public static JPanel volumeVN_Panel = new JPanel();
	public static JPanel volumePVnRT_Panel = new JPanel();

	//Pressure Panels
	public static JPanel pressurePanel = new JPanel();
	//Equation Panels
	public static JPanel pressurePV_Panel = new JPanel();
	public static JPanel pressurePT_Panel = new JPanel();
	public static JPanel pressurePVT_Panel = new JPanel();
	public static JPanel pressurePVnRT_Panel = new JPanel();
	public static JPanel pressurePN_Panel = new JPanel();

	//Moles Panels
	public static JPanel molesPanel = new JPanel();
	//Equation Panels
	public static JPanel molesVN_Panel = new JPanel();
	public static JPanel molesPN_Panel = new JPanel();
	public static JPanel molesNT_Panel = new JPanel();
	public static JPanel molesPVnRT_Panel = new JPanel();

	//Temperature Panels
	public static JPanel tempPanel = new JPanel();
	//Equation Panels
	public static JPanel tempVT_Panel = new JPanel();
	public static JPanel tempPT_Panel = new JPanel();
	public static JPanel tempPVT_Panel = new JPanel();
	public static JPanel tempPVnRT_Panel = new JPanel();
	public static JPanel tempNT_Panel = new JPanel();

	//Text fields for the four different inputs 
	public static JTextField pressureTextField1 = new JTextField(5);
	public static JTextField volumeTextField1 = new JTextField(5);
	public static JTextField molesTextField1 = new JTextField(5);
	public static JTextField tempTextField1 = new JTextField(5);

	//Makes the secondary text fields for use in the equations
	public static JTextField pressureTextField2 = new JTextField(5);
	public static JTextField volumeTextField2 = new JTextField(5);
	public static JTextField molesTextField2 = new JTextField(5);
	public static JTextField tempTextField2 = new JTextField(5);

	public static JTextField[] textFieldsGasLaws = {pressureTextField1, volumeTextField1, molesTextField1, tempTextField1, pressureTextField2, volumeTextField2, molesTextField2, tempTextField2};

	//Creates the main JLabel
	public static JLabel answerGasLaws = new JLabel("Your answer will be printed in this location");

	//Used to get process the steps of the equation and the get the answer
	public static double answer;
	public static double step;

	//Makes the values that will take the input from the text fields and they will be used in the equations 
	public static double pressuredouble1;
	public static double volumedouble1;
	public static double molesdouble1;
	public static double tempdouble1;
	public static double pressuredouble2;
	public static double volumedouble2;
	public static double molesdouble2;
	public static double tempdouble2;

	//Makes the GridBagConstraints to place all of the text fields and JLabels and such
	public static GridBagConstraints bag = Start.c;

	public static Buttons b = new Buttons();

	//Main method that will run every method and will be run in the main Sart.java file
	public static void init() {

		b.Button();

		//Gas Laws Panel

		//Sets the layout
		gasLawsPanel.setLayout(new GridBagLayout());

		volumePanel.setLayout(new GridBagLayout());
			volumePV_Panel.setLayout(new GridBagLayout());
			volumePVT_Panel.setLayout(new GridBagLayout());
			volumeVN_Panel.setLayout(new GridBagLayout());
			volumeVT_Panel.setLayout(new GridBagLayout());
			volumePVnRT_Panel.setLayout(new GridBagLayout());

		pressurePanel.setLayout(new GridBagLayout());
			pressurePVT_Panel.setLayout(new GridBagLayout());
			pressurePV_Panel.setLayout(new GridBagLayout());
			pressurePT_Panel.setLayout(new GridBagLayout());
			pressurePN_Panel.setLayout(new GridBagLayout());
			pressurePVnRT_Panel.setLayout(new GridBagLayout());

		molesPanel.setLayout(new GridBagLayout());
			molesNT_Panel.setLayout(new GridBagLayout());
			molesPN_Panel.setLayout(new GridBagLayout());
			molesPVnRT_Panel.setLayout(new GridBagLayout());
			molesVN_Panel.setLayout(new GridBagLayout());

		tempPanel.setLayout(new GridBagLayout());
			tempPVT_Panel.setLayout(new GridBagLayout());
			tempNT_Panel.setLayout(new GridBagLayout());
			tempPT_Panel.setLayout(new GridBagLayout());
			tempPVnRT_Panel.setLayout(new GridBagLayout());
			tempVT_Panel.setLayout(new GridBagLayout());

		//Volume panels being setup




		//Pressure Panels

			//PV equation being setup








		//Mole Panels

			//VN equation being setup
			bag.gridx = 0;
			bag.gridy = 0;
			molesVN_Panel.add(volumeTextField1, bag);

			bag.gridx = 1;
			bag.gridy = 0;
			molesVN_Panel.add(new JLabel("="));

			bag.gridx = 2;
			bag.gridy = 0;
			molesVN_Panel.add(volumeTextField2, bag);

			bag.gridx = 3;
			bag.gridy = 0;
			molesVN_Panel.add(molesTextField2, bag);

			//NT equations being set up

			//PN equations being set up

			//PVnRT equation being setup
			bag.gridx = 0;
			bag.gridy = 0;
			molesPVnRT_Panel.add(pressureTextField1, bag);

			bag.gridx = 1;
			bag.gridy = 0;
			molesPVnRT_Panel.add(volumeTextField1, bag);

			bag.gridx = 2;
			bag.gridy = 0;
			molesPVnRT_Panel.add(new JLabel("="));

			bag.gridx = 3;
			bag.gridy = 0;
			molesPVnRT_Panel.add(tempTextField1, bag);

		//Temperature Panels

			//PT equation being setup
			bag.gridx = 0;
			bag.gridy = 0;
			tempPT_Panel.add(pressureTextField1, bag);

			bag.gridx = 1;
			bag.gridy = 0;
			tempPT_Panel.add(new JLabel("="));

			bag.gridx = 2;
			bag.gridy = 0;
			tempPT_Panel.add(pressureTextField2, bag);

			bag.gridx = 3;
			bag.gridy = 0;
			tempPT_Panel.add(tempTextField1, bag);

			//VT equation being setup
			bag.gridx = 0;
			bag.gridy = 0;
			tempVT_Panel.add(volumeTextField1, bag);

			bag.gridx = 1;
			bag.gridy = 0;
			tempVT_Panel.add(new JLabel("="));

			bag.gridx = 2;
			bag.gridy = 0;
			tempVT_Panel.add(volumeTextField2, bag);

			bag.gridx = 3;
			bag.gridy = 0;
			tempVT_Panel.add(tempTextField2, bag);

			//PVT equation being setup
			bag.gridx = 0;
			bag.gridy = 0;
			tempPVT_Panel.add(pressureTextField1, bag);

			bag.gridx = 1;
			bag.gridy = 0;
			tempPVT_Panel.add(volumeTextField1, bag);

			bag.gridx = 2;
			bag.gridy = 0;
			tempPVT_Panel.add(new JLabel("="));

			bag.gridx = 3;
			bag.gridy = 0;
			tempPVT_Panel.add(pressureTextField2, bag);

			bag.gridx = 4;
			bag.gridy = 0;
			tempPVT_Panel.add(volumeTextField2, bag);

			bag.gridx = 5;
			bag.gridy = 0;
			tempPVT_Panel.add(tempTextField2, bag);

			//PVnRT being setup
			bag.gridx = 0;
			bag.gridy = 0;
			tempPVnRT_Panel.add(pressureTextField1, bag);

			bag.gridx = 1;
			bag.gridy = 0;
			tempPVnRT_Panel.add(volumeTextField1, bag);

			bag.gridx = 2;
			bag.gridy = 0;
			tempPVnRT_Panel.add(new JLabel("="));

			bag.gridx = 3;
			bag.gridy = 0;
			tempPVnRT_Panel.add(molesTextField1, bag);
	}

}