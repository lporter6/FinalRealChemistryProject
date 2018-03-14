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
	
	//Makes the buttons for the different options
	public static JButton enterButtonGasLaws = new JButton("Enter");
	public static JButton volumeButton = new JButton("Volume");
	public static JButton pressureButton = new JButton("Pressure");
	public static JButton molesButton = new JButton("Moles");
	public static JButton tempButton = new JButton("Temp");

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

	//Main method that will run every method and will be run in the main Sart.java file
	public static void init(){
		
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
			
			//Makes the Volume Button and sets position
			bag.gridx = 0;
			bag.gridy = 0;
			GasLaws.volumeButton.setActionCommand("Volume Enter"); 
			GasLaws.volumeButton.addActionListener(Start.al1); 
			gasLawsPanel.add(GasLaws.volumeButton, bag);
			
			//Makes the Pressure Button and sets position
			bag.gridx = 1;
			bag.gridy = 0;
			GasLaws.pressureButton.setActionCommand("Pressure Enter"); 
			GasLaws.pressureButton.addActionListener(Start.al1); 
			gasLawsPanel.add(GasLaws.pressureButton, bag);
			
			//Makes the Moles Button and sets position
			bag.gridx = 2;
			bag.gridy = 0;
			GasLaws.molesButton.setActionCommand("Moles Enter"); 
			GasLaws.molesButton.addActionListener(Start.al1); 
			gasLawsPanel.add(GasLaws.molesButton, bag);
			
			//Makes the Temperature Button and sets position
			bag.gridx = 3;
			bag.gridy = 0;
			GasLaws.tempButton.setActionCommand("Temp Enter"); 
			GasLaws.tempButton.addActionListener(Start.al1); 
			gasLawsPanel.add(GasLaws.tempButton, bag);
		
		//Volume Panels
		
			//Adds enter button to volumePV_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumePV_Panel.add(GasLaws.enterButtonGasLaws, bag);
				
				//PV equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				volumePV_Panel.add(volumeTextField1,bag);
		
				bag.gridx = 1;
				bag.gridy = 0;
				volumePV_Panel.add(new JLabel("="));
		
				bag.gridx = 2;
				bag.gridy = 0;
				volumePV_Panel.add(pressureTextField2,bag);
		
				bag.gridx = 3;
				bag.gridy = 0;
				volumePV_Panel.add(volumeTextField2,bag);
			
			//Adds enter button to volumeVN_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumeVN_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VN equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				volumeVN_Panel.add(molesTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				volumeVN_Panel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				volumeVN_Panel.add(volumeTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				volumeVN_Panel.add(molesTextField2,bag);
			
			//Adds enter button to volumePVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumePVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				volumePVT_Panel.add(pressureTextField1,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				volumePVT_Panel.add(tempTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				volumePVT_Panel.add(new JLabel("="));
				
				bag.gridx = 3;
				bag.gridy = 0;
				volumePVT_Panel.add(pressureTextField2,bag);
				
				bag.gridx = 4;
				bag.gridy = 0;
				volumePVT_Panel.add(volumeTextField2,bag);
				
				bag.gridx = 5;
				bag.gridy = 0;
				volumePVT_Panel.add(tempTextField2,bag);
			
			//Adds enter button to volumeVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumeVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VT equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				volumeVT_Panel.add(tempTextField1,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				volumeVT_Panel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				volumeVT_Panel.add(volumeTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				volumeVT_Panel.add(tempTextField2,bag);
			
			//Adds enter button to volumePVnRT_Panel 
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumePVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVnRT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				volumePVnRT_Panel.add(pressureTextField1,bag);
	
				bag.gridx = 1;
				bag.gridy = 0;
				volumePVnRT_Panel.add(volumeTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				volumePVnRT_Panel.add(new JLabel("="));
	
				bag.gridx = 2;
				bag.gridy = 0;
				volumePVnRT_Panel.add(molesTextField1,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				volumePVnRT_Panel.add(tempTextField1,bag);
		
		//Pressure Panels
			
			//Adds enter button to pressurePV_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePV_Panel.add(GasLaws.enterButtonGasLaws, bag);
				
				//PV equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				pressurePV_Panel.add(volumeTextField1,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				pressurePV_Panel.add(new JLabel("="));
	
				bag.gridx = 2;
				bag.gridy = 0;
				pressurePV_Panel.add(pressureTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				pressurePV_Panel.add(volumeTextField2,bag);
			
			//Adds enter button to pressurePT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PT equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				pressurePT_Panel.add(tempTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				pressurePT_Panel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				pressurePT_Panel.add(pressureTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				pressurePT_Panel.add(tempTextField2,bag);
			
			//Adds enter button to pressurePVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
				
				//PVT equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				pressurePVT_Panel.add(volumeTextField1,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				pressurePVT_Panel.add(tempTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				pressurePVT_Panel.add(new JLabel("="));
				
				bag.gridx = 3;
				bag.gridy = 0;
				pressurePVT_Panel.add(pressureTextField2,bag);
				
				bag.gridx = 4;
				bag.gridy = 0;
				pressurePVT_Panel.add(volumeTextField2,bag);
				
				bag.gridx = 5;
				bag.gridy = 0;
				pressurePVT_Panel.add(tempTextField2,bag);
				
			//Adds enter button to pressurePVnRT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);
				
				//PVnRT equation being setup
				bag.gridx = 1;
				bag.gridy = 0;
				pressurePVnRT_Panel.add(volumeTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				pressurePVnRT_Panel.add(new JLabel("="));
	
				bag.gridx = 2;
				bag.gridy = 0;
				pressurePVnRT_Panel.add(molesTextField1,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				pressurePVnRT_Panel.add(tempTextField1,bag);
		
		//Mole Panels
			
			//Adds enter button to molesVN_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			molesVN_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VN equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				molesVN_Panel.add(volumeTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				molesVN_Panel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				molesVN_Panel.add(volumeTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				molesVN_Panel.add(molesTextField2,bag);
			
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			molesNT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			molesPN_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
			//Adds enter button to molesPVnRT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			molesPVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);

				//PVnRT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				molesPVnRT_Panel.add(pressureTextField1,bag);
	
				bag.gridx = 1;
				bag.gridy = 0;
				molesPVnRT_Panel.add(volumeTextField1,bag);

				bag.gridx = 2;
				bag.gridy = 0;
				molesPVnRT_Panel.add(new JLabel("="));
	
				bag.gridx = 3;
				bag.gridy = 0;
				molesPVnRT_Panel.add(tempTextField1,bag);
			
		//Temperature Panels
			
			//Adds enter button to tempPT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempPT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				tempPT_Panel.add(pressureTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				tempPT_Panel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				tempPT_Panel.add(pressureTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				tempPT_Panel.add(tempTextField1,bag);
			
			//Adds enter button to tempVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VT equation being setup 
				bag.gridx = 0;
				bag.gridy = 0;
				tempVT_Panel.add(volumeTextField1,bag);

				bag.gridx = 1;
				bag.gridy = 0;
				tempVT_Panel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				tempVT_Panel.add(volumeTextField2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				tempVT_Panel.add(tempTextField2,bag);
			
			//Adds enter button to tempNT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempNT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
			//Adds enter button to tempPVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempPVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				tempPVT_Panel.add(pressureTextField1,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				tempPVT_Panel.add(volumeTextField1,bag);

				bag.gridx = 2;
				bag.gridy = 0;
				tempPVT_Panel.add(new JLabel("="));
				
				bag.gridx = 3;
				bag.gridy = 0;
				tempPVT_Panel.add(pressureTextField2,bag);
				
				bag.gridx = 4;
				bag.gridy = 0;
				tempPVT_Panel.add(volumeTextField2,bag);
				
				bag.gridx = 5;
				bag.gridy = 0;
				tempPVT_Panel.add(tempTextField2,bag);
			
			//Adds enter button to tempPVnRT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempPVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVnRT being setup
				bag.gridx = 0;
				bag.gridy = 0;
				tempPVnRT_Panel.add(pressureTextField1,bag);
	
				bag.gridx = 1;
				bag.gridy = 0;
				tempPVnRT_Panel.add(volumeTextField1,bag);

				bag.gridx = 2;
				bag.gridy = 0;
				tempPVnRT_Panel.add(new JLabel("="));
	
				bag.gridx = 3;
				bag.gridy = 0;
				tempPVnRT_Panel.add(molesTextField1,bag);
	}

	public static void v(){
		
	}

	public static void p(){

	}

	public static void n(){

	}

	public static void t(){

	}

	public static void checker(){
		for(int i = 0; i<9;i++){
			if(i == 0){
				if(volumeTextField1.getText().trim().length() == 0){
					
				}else if(volumeTextField1.getText().trim().length() > 0){
					volumedouble1 = Double.parseDouble(volumeTextField1.getText().trim());
					volumedouble1 = Double.parseDouble(volumeTextField1.getText().trim());
				}
			}else if(i == 1){
				if(pressureTextField1.getText().trim().length() == 0){
					
				}else if(pressureTextField1.getText().trim().length() > 0){
					pressuredouble1 = Double.parseDouble(volumeTextField1.getText().trim());
				}
			}else if(i == 2){
				if(molesTextField1.getText().trim().length() == 0){
					
				}else if(molesTextField1.getText().trim().length() > 0){
					molesdouble1 = Double.parseDouble(volumeTextField1.getText().trim());
				}
			}else if(i == 3){
				if(tempTextField1.getText().trim().length() == 0){
					
				}else if(tempTextField1.getText().trim().length() > 0){
					tempdouble1 = Double.parseDouble(volumeTextField1.getText().trim());
				}
			}else if(i == 4){
				if(volumeTextField2.getText().trim().length() == 0){
					
				}else if(volumeTextField2.getText().trim().length() > 0){
					volumedouble2 = Double.parseDouble(volumeTextField2.getText().trim());
				}
			}else if(i == 5){
				if(pressureTextField2.getText().trim().length() == 0){
					
				}else if(pressureTextField2.getText().trim().length() > 0){
					pressuredouble2 = Double.parseDouble(pressureTextField2.getText().trim());
				}
			}else if(i == 6){
				if(molesTextField2.getText().trim().length() == 0){
					
				}else if(molesTextField2.getText().trim().length() > 0){
					molesdouble2 = Double.parseDouble(volumeTextField1.getText().trim());
				}
			}else if(i == 7){
				if(tempTextField2.getText().trim().length() == 0){
					
				}else if(tempTextField2.getText().trim().length() > 0){
					tempdouble2 = Double.parseDouble(volumeTextField1.getText().trim());
				}
			}else {
				
			}
		}
	}
	
	//Solves for volume
	public static void pv(){
		
		checker();

		step = pressuredouble2 * volumedouble2;
		answer = step/ pressuredouble1;
		
		System.out.println(answer);

	}
	
	//Solves for pressure
	public static void pv2(){

		checker();
		
		step = pressuredouble2 * volumedouble2;
		answer = step/ volumedouble1;
		
		System.out.println(answer);
	}
	
	//Solves for volume
	public static void vt(){
		
		checker();
		
		step = volumedouble2 * tempdouble1;
		answer = step/ tempdouble2;
		
		System.out.println(answer);
	}
	
	//Solves for temperature
	public static void vt2(){

		checker();
		
		step = tempdouble2 * volumedouble1;
		answer = step/ volumedouble2;

	}

	//Solves for pressure
	public static void pt(){

		checker();
		
		step = pressuredouble2 * tempdouble1;
		answer = step/ tempdouble2;

	}
	
	//Solves for temperature
	public static void pt2(){
		
		checker();
		
		step = tempdouble2 * pressuredouble1;
		answer = step/ pressuredouble2;

	}
	
	//Solves for pressure
	public static void pvt(){

		checker();
		
		step = pressuredouble2 * volumedouble2 * tempdouble1;
		answer = step/(tempdouble2 * volumedouble1);
	}
	
	//Solves for volume
	public static void pvt2(){
		
		checker();
		
		step = pressuredouble2 * volumedouble2 * tempdouble1;
		answer = step/(tempdouble2 * pressuredouble1);
	}
	
	//Solves for temperature
	public static void pvt3(){

		checker();
		
		step = tempdouble2 * pressuredouble1 * volumedouble1;
		answer = step/(pressuredouble2 * volumedouble2);
	}

	//Solves for volume
	public static void vn(){

		checker();
		
		step = volumedouble2 * molesdouble1;
		answer = step/ molesdouble2;

	}
	
	//Solves for moles
	public static void vn2(){

		checker();
		
		step = molesdouble2 * volumedouble1;
		answer = step/ volumedouble2;
	}
	
	//Solves for pressure
	public static void pvnrt(){

		checker();
		
		step = molesdouble1 *0.082* tempdouble1;
		answer = step/ volumedouble1;
	}
	
	//Solves for volume
	public static void pvnrt2(){

		checker();
		
		step = molesdouble1 *0.082* tempdouble1;
		answer = step/ pressuredouble1;
	}
	
	//Solves for moles
	public static void pvnrt3(){

		checker();
		
		step = pressuredouble1 * volumedouble1;
		answer = step/(0.082* tempdouble1);
	}
	
	//Solves for temperature
	public static void pvnrt4(){

		checker();
		
		step = pressuredouble1 * volumedouble1;
		answer = step/(0.082* molesdouble1);
	}

	//Solves for pressure
	public static void pn() {

		checker();

		step = pressuredouble2 * molesdouble1;
		answer = step/ molesdouble2;
	}

	//Solves for moles
	public static void pn2() {

		checker();

		step = pressuredouble1 * molesdouble2;
		answer = step/ pressuredouble2;
	}

	//Solves for moles
	public static void nt(){

		checker();

		step = molesdouble2 * tempdouble2;
		answer = step/ tempdouble1;
	}

	//Solves for temperature
	public static void nt2(){

		checker();

		step = molesdouble2 * tempdouble2;
		answer = step/ molesdouble1;
	}

}