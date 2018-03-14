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
	public static JTextField p = new JTextField(5);
	public static JTextField v = new JTextField(5);
	public static JTextField n = new JTextField(5);
	public static JTextField t = new JTextField(5);
	
	//Makes the secondary text fields for use in the equations
	public static JTextField p2 = new JTextField(5);
	public static JTextField v2 = new JTextField(5);
	public static JTextField n2 = new JTextField(5);
	public static JTextField t2 = new JTextField(5);
	
	public static JTextField[] textFieldsGasLaws = {p,v,n,t,p2,v2,n2,t2};
	
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
	public static double p3;
	public static double v3;
	public static double n3;
	public static double t3;
	public static double p4;
	public static double v4;
	public static double n4;
	public static double t4;

	//Makes the GridBagConstraints to place all of the text fields and JLabels and such
	public static GridBagConstraints bag = Start.c;

	//Main method that will run every method and will be run in the main Sart.java file
	public static void init(){
		
		//Gas Laws Panel
		
			//Sets the layout
			gasLawsPanel.setLayout(new GridBagLayout());
			volumePanel.setLayout(new GridBagLayout());
			
			//Makes the Volume Button and sets position
			bag.gridx = 0;
			bag.gridy = 0;
			GasLaws.volumeButton.setActionCommand("Volume Enter"); 
			GasLaws.volumeButton.addActionListener(Start.al1); 
			gasLawsPanel.add(GasLaws.volumeButton, bag);
			volumePanel.add(GasLaws.enterButtonGasLaws, bag);
			
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
				volumePanel.add(v,bag);
		
				bag.gridx = 1;
				bag.gridy = 0;
				volumePanel.add(new JLabel("="));
		
				bag.gridx = 2;
				bag.gridy = 0;
				volumePanel.add(p2,bag);
		
				bag.gridx = 3;
				bag.gridy = 0;
				volumePanel.add(v2,bag);
			
			//Adds enter button to volumeVN_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumeVN_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VN equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				gasLawsPanel.add(n,bag);
				
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(v2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(n2,bag);
			
			//Adds enter button to volumePVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumePVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				volumePVT_Panel.add(p,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				volumePVT_Panel.add(t,bag);
				
				bag.gridx = 3;
				bag.gridy = 0;
				volumePVT_Panel.add(p2,bag);
				
				bag.gridx = 4;
				bag.gridy = 0;
				volumePVT_Panel.add(v2,bag);
				
				bag.gridx = 5;
				bag.gridy = 0;
				volumePVT_Panel.add(t2,bag);
			
			//Adds enter button to volumeVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumeVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VT equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				gasLawsPanel.add(t,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				volumePanel.add(new JLabel("="));
				
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(v2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t2,bag);
			
			//Adds enter button to volumePVnRT_Panel 
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			volumePVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVnRT equation being setup
				bag.gridx = 0;
				bag.gridy = 0;
				gasLawsPanel.add(p,bag);
	
				bag.gridx = 1;
				bag.gridy = 0;
				gasLawsPanel.add(v,bag);
	
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(n,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t,bag);
		
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
				pressurePV_Panel.add(v,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				volumePanel.add(new JLabel("="));
	
				bag.gridx = 2;
				bag.gridy = 0;
				pressurePV_Panel.add(p2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				pressurePV_Panel.add(v2,bag);
			
			//Adds enter button to pressurePT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PT equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				gasLawsPanel.add(t,bag);
				
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(p2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t2,bag);
			
			//Adds enter button to pressurePVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
				
				//PVT equation being set up
				bag.gridx = 0;
				bag.gridy = 0;
				pressurePVT_Panel.add(v,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				pressurePVT_Panel.add(t,bag);
				
				bag.gridx = 3;
				bag.gridy = 0;
				pressurePVT_Panel.add(p2,bag);
				
				bag.gridx = 4;
				bag.gridy = 0;
				pressurePVT_Panel.add(v2,bag);
				
				bag.gridx = 5;
				bag.gridy = 0;
				pressurePVT_Panel.add(t2,bag);
				
			//Adds enter button to pressurePVnRT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			pressurePVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);
				
				//PVnRT equation being setup
				bag.gridx = 1;
				bag.gridy = 0;
				gasLawsPanel.add(v,bag);
	
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(n,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t,bag);
		
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
				gasLawsPanel.add(v,bag);
				
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(v2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(n2,bag);
			
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
				gasLawsPanel.add(p,bag);
	
				bag.gridx = 1;
				bag.gridy = 0;
				gasLawsPanel.add(v,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t,bag);
			
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
				gasLawsPanel.add(p,bag);
				
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(p,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t,bag);
			
			//Adds enter button to tempVT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempVT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//VT equation being setup 
				bag.gridx = 0;
				bag.gridy = 0;
				gasLawsPanel.add(v,bag);
				
				bag.gridx = 2;
				bag.gridy = 0;
				gasLawsPanel.add(v2,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(t2,bag);
			
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
				tempPVT_Panel.add(p,bag);
				
				bag.gridx = 1;
				bag.gridy = 0;
				tempPVT_Panel.add(v,bag);
				
				bag.gridx = 3;
				bag.gridy = 0;
				tempPVT_Panel.add(p2,bag);
				
				bag.gridx = 4;
				bag.gridy = 0;
				tempPVT_Panel.add(v2,bag);
				
				bag.gridx = 5;
				bag.gridy = 0;
				tempPVT_Panel.add(t2,bag);
			
			//Adds enter button to tempPVnRT_Panel
			bag.gridx = 0;
			bag.gridy = 1;
			GasLaws.enterButtonGasLaws.setActionCommand("Gas Enter");
			GasLaws.enterButtonGasLaws.addActionListener(Start.al1);
			tempPVnRT_Panel.add(GasLaws.enterButtonGasLaws, bag);
			
				//PVnRT being setup
				bag.gridx = 0;
				bag.gridy = 0;
				gasLawsPanel.add(p,bag);
	
				bag.gridx = 1;
				bag.gridy = 0;
				gasLawsPanel.add(v,bag);
	
				bag.gridx = 3;
				bag.gridy = 0;
				gasLawsPanel.add(n,bag);
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
				if(v.getText().trim().length() == 0){
					
				}else if(v.getText().trim().length() > 0){
					v3 = Double.parseDouble(v.getText().trim());
					v3 = Double.parseDouble(v.getText().trim());	
				}
			}else if(i == 1){
				if(p.getText().trim().length() == 0){
					
				}else if(p.getText().trim().length() > 0){
					p3 = Double.parseDouble(v.getText().trim());
				}
			}else if(i == 2){
				if(n.getText().trim().length() == 0){
					
				}else if(n.getText().trim().length() > 0){
					n3 = Double.parseDouble(v.getText().trim());
				}
			}else if(i == 3){
				if(t.getText().trim().length() == 0){
					
				}else if(t.getText().trim().length() > 0){
					t3 = Double.parseDouble(v.getText().trim());
				}
			}else if(i == 4){
				if(v2.getText().trim().length() == 0){
					
				}else if(v2.getText().trim().length() > 0){
					v4 = Double.parseDouble(v2.getText().trim());
				}
			}else if(i == 5){
				if(p2.getText().trim().length() == 0){
					
				}else if(p2.getText().trim().length() > 0){
					p4 = Double.parseDouble(p2.getText().trim());
				}
			}else if(i == 6){
				if(n2.getText().trim().length() == 0){
					
				}else if(n2.getText().trim().length() > 0){
					n4 = Double.parseDouble(v.getText().trim());
				}
			}else if(i == 7){
				if(t2.getText().trim().length() == 0){
					
				}else if(t2.getText().trim().length() > 0){
					t4 = Double.parseDouble(v.getText().trim());
				}
			}else {
				
			}
		}
	}
	
	//Solves for volume
	public static void pv(){
		
		checker();	


		step = p3*v4;
		answer = step/v3;
		
		System.out.println(answer);

		step = p4*v4;
		answer = step/p3;
		
		System.out.println(answer);

	}
	
	//Solves for pressure
	public static void pv2(){

		checker();
		
		step = p4*v4;
		answer = step/v3;
		
		System.out.println(answer);
	}
	
	//Solves for volume
	public static void vt(){
		
		checker();
		
		step = v4*t3;
		answer = step/t4;
		
		System.out.println(answer);
	}
	
	//Solves for temperature
	public static void vt2(){

		checker();
		
		step = t4*v3;
		answer = step/v4;

	}

	//Solves for pressure
	public static void pt(){

		checker();
		
		step = p4*t3;
		answer = step/t4;

	}
	
	//Solves for temperature
	public static void pt2(){
		
		checker();
		
		step = t4*p3;
		answer = step/p4;

	}
	
	//Solves for pressure
	public static void pvt(){

		checker();
		
		step = p4*v4*t3;
		answer = step/(t4*v3);
	}
	
	//Solves for volume
	public static void pvt2(){
		
		checker();
		
		step = p4*v4*t3;
		answer = step/(t4*p3);
	}
	
	//Solves for temperature
	public static void pvt3(){

		checker();
		
		step = t4*p3*v3;
		answer = step/(p4*v4);
	}

	//Solves for volume
	public static void vn(){

		checker();
		
		step = v4*n3;
		answer = step/n4;

	}
	
	//Solves for moles
	public static void vn2(){

		checker();
		
		step = n4*v3;
		answer = step/v4;
	}
	
	//Solves for pressure
	public static void pvnrt(){

		checker();
		
		step = n3*0.082*t3;
		answer = step/v3;
	}
	
	//Solves for volume
	public static void pvnrt2(){

		checker();
		
		step = n3*0.082*t3;
		answer = step/p3;
	}
	
	//Solves for moles
	public static void pvnrt3(){

		checker();
		
		step = p3*v3;
		answer = step/(0.082*t3);
	}
	
	//Solves for temperature
	public static void pvnrt4(){

		checker();
		
		step = p3*v3;
		answer = step/(0.082*n3);
	}

}