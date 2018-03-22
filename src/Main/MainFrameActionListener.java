package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MolarMass.MolarMass;
import GasLaws.GasLaws;
import GasLaws.Buttons;

import javax.swing.*;

import static GasLaws.Equations.checker;
import static GasLaws.Equations.volume_pv;

import GasLaws.Equations;

public class MainFrameActionListener implements ActionListener{

	public static GasLaws G = new GasLaws();

	public static Buttons B = new Buttons();

	public static Equations E = new Equations();

	public void actionPerformed(ActionEvent e){
			
		if("MolarMass".equals(e.getActionCommand())){ //gets called if the button that is pressed has an Action Command value of "MolarMass"
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(MolarMass.molarMassPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			Start.c.gridx = 2;
			Start.c.gridy = 9;
			MolarMass.molarMassPanel.add(Start.homeButton, Start.c);
			
		}else if("Molar Enter".equals(e.getActionCommand())){ //gets called if the button that is pressed has a action command of "Molar Enter"
			
			String formula = "";
			double sum = 0; //this is the sum to be used later in the for loop
			
			for(int i = 0; i<MolarMass.textFieldsMolarMass.length; i++){ //for loop for how many JTextFeilds there are in the preset ArrayList I made to keep track of the JTextFields
				
				for(int i1 = 0; i1<ElementData.ElementMolarMass.molarMasses.size();i1++){ //for loop to check the one single input against every data point in the ArrayList in ElementData
					
					if(ElementData.ElementMolarMass.molarMasses.get(i1).label.equals(MolarMass.textFieldsMolarMass[i].getText())){ //if the label of the object with an index of i in the molarMasses ArrayList is the same as the input from the user in the JTextField...
						
						sum += ElementData.ElementMolarMass.molarMasses.get(i1).molarMass * MolarMass.comboBoxMolarMass[i].getSelectedIndex(); //the sum is increased by the molar mass of the label multiplied by the ammount of them there are depending on the number selected in the combo box
						if(ElementData.ElementMolarMass.molarMasses.get(i1).molarMass == 0){
							
						}else{
							formula = formula + ElementData.ElementMolarMass.molarMasses.get(i1).label + Integer.toString(MolarMass.comboBoxMolarMass[i].getSelectedIndex());
						}
					}
					
				}
				
			}
			MolarMass.answerMolarMass.setText(Double.toString(sum)); //the JLabel text is set to whatever the sum is in string form
			MolarMass.answerMolarMass.setToolTipText(formula);
		}else if("GasLaws".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.gasLawsPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Home button on main gasLawsPanel
			G.bag.gridx = 4;
			G.bag.gridy = 0;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.gasLawsPanel.add(Start.homeButton, G.bag);

		
		}else if("Volume Enter".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumePanel); //sets the content pane to the volume panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Volume home button
			G.bag.gridx = 7;
			G.bag.gridy = 0;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.volumePanel.add(Start.homeButton, G.bag);

		}else if("Volume PV".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumePV_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//PV equation being set up
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.volumePV_Panel.add(G.volumeTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumePV_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.volumePV_Panel.add(G.pressureTextField2, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.volumePV_Panel.add(G.volumeTextField2, G.bag);

			//Adds enter button to volumePV_Panel
			GasLaws.bag.gridx = 0;
			GasLaws.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.volumePV_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.volumePV_Panel.add(Start.homeButton, G.bag);

		}else if("Volume PVT".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumePVT_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//PVT equation being setup
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.volumePVT_Panel.add(G.pressureTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumePVT_Panel.add(G.tempTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumePVT_Panel.add(new JLabel("="));

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.volumePVT_Panel.add(G.pressureTextField2, G.bag);

			G.bag.gridx = 4;
			G.bag.gridy = 0;
			G.volumePVT_Panel.add(G.volumeTextField2, G.bag);

			G.bag.gridx = 5;
			G.bag.gridy = 0;
			G.volumePVT_Panel.add(G.tempTextField2, G.bag);

			//Adds enter button to volumePVT_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.volumePVT_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.volumePVT_Panel.add(Start.homeButton, G.bag);

		}else if("Volume VT".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumeVT_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//VT equation being set up
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.volumeVT_Panel.add(G.tempTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumeVT_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.volumeVT_Panel.add(G.volumeTextField2, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.volumeVT_Panel.add(G.tempTextField2, G.bag);

			//Adds enter button to volumeVT_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.volumeVT_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.volumeVT_Panel.add(Start.homeButton, G.bag);

		}else if("Volume PVnRT".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumePVnRT_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//PVnRT equation being setup
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.volumePVnRT_Panel.add(G.pressureTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumePVnRT_Panel.add(G.volumeTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumePVnRT_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.volumePVnRT_Panel.add(G.molesTextField1, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.volumePVnRT_Panel.add(G.tempTextField1, G.bag);

			//Adds enter button to volumePVnRT_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.volumePVnRT_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.volumePVnRT_Panel.add(Start.homeButton, G.bag);

		}else if("Volume VN".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumeVN_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//VN equation being setup
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.volumeVN_Panel.add(G.molesTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.volumeVN_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.volumeVN_Panel.add(G.volumeTextField2, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.volumeVN_Panel.add(G.molesTextField2, G.bag);

			//Adds enter button to volumeVN_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.volumeVN_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.volumeVN_Panel.add(Start.homeButton, G.bag);

		}else if("Pressure Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Pressure home buttons
			G.bag.gridx = 7;
			G.bag.gridy = 0;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePanel.add(Start.homeButton, G.bag);

		}else if("Pressure PV".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePV_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.pressurePV_Panel.add(G.volumeTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.pressurePV_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.pressurePV_Panel.add(G.pressureTextField2, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.pressurePV_Panel.add(G.volumeTextField2, G.bag);

			//Adds enter button to pressurePV_Panel
			GasLaws.bag.gridx = 0;
			GasLaws.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.pressurePV_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePV_Panel.add(Start.homeButton, G.bag);

		}else if("Pressure PVT".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePVT_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//PVT equation being set up
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.pressurePVT_Panel.add(G.volumeTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.pressurePVT_Panel.add(G.tempTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.pressurePVT_Panel.add(new JLabel("="));

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.pressurePVT_Panel.add(G.pressureTextField2, G.bag);

			G.bag.gridx = 4;
			G.bag.gridy = 0;
			G.pressurePVT_Panel.add(G.volumeTextField2, G.bag);

			G.bag.gridx = 5;
			G.bag.gridy = 0;
			G.pressurePVT_Panel.add(G.tempTextField2, G.bag);

			//Adds enter button to volumePVT_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.pressurePVT_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePVT_Panel.add(Start.homeButton, G.bag);

		}else if("Pressure PT".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePT_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//PT equation being set up
			G.bag.gridx = 0;
			G.bag.gridy = 0;
			G.pressurePT_Panel.add(G.tempTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.pressurePT_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.pressurePT_Panel.add(G.pressureTextField2, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.pressurePT_Panel.add(G.tempTextField2, G.bag);

			//Adds enter button to volumeVT_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.pressurePT_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePT_Panel.add(Start.homeButton, G.bag);

		}else if("Pressure PVnRT".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePVnRT_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//PVnRT equation being setup
			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.pressurePVnRT_Panel.add(G.volumeTextField1, G.bag);

			G.bag.gridx = 1;
			G.bag.gridy = 0;
			G.pressurePVnRT_Panel.add(new JLabel("="));

			G.bag.gridx = 2;
			G.bag.gridy = 0;
			G.pressurePVnRT_Panel.add(G.molesTextField1, G.bag);

			G.bag.gridx = 3;
			G.bag.gridy = 0;
			G.pressurePVnRT_Panel.add(G.tempTextField1, G.bag);

			//Adds enter button to volumePVnRT_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.pressurePVnRT_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePVnRT_Panel.add(Start.homeButton, G.bag);

		}else if("Pressure PN".equals(e.getActionCommand())) {

			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePN_Panel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Adds enter button to volumeVN_Panel
			G.bag.gridx = 0;
			G.bag.gridy = 1;
			Buttons.enterButtonGasLaws.setActionCommand("Gas Enter");
			Buttons.enterButtonGasLaws.addActionListener(Start.al1);
			G.pressurePN_Panel.add(Buttons.enterButtonGasLaws, G.bag);

			G.bag.gridx = 7;
			G.bag.gridy = 1;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePN_Panel.add(Start.homeButton, G.bag);
			
		}else if("Moles Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.molesPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Moles home buttons
			G.bag.gridx = 7;
			G.bag.gridy = 0;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.molesPanel.add(Start.homeButton, G.bag);
			
		}else if("Temp Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.tempPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Temperature home buttons
			G.bag.gridx = 7;
			G.bag.gridy = 0;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.tempPanel.add(Start.homeButton, G.bag);

		}else if("Game".equals(e.getActionCommand())){
			
			Game.Build.frame.setVisible(true);
			
		}else if("Home".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(Start.mainpanel); //sets the content pane to the main panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

		}else if("Gas Enter".equals(e.getActionCommand())){

			if(G.volumePV_Panel.isDisplayable()) {

				System.out.println("yes");
				E.volume_pv();

			}else if(G.volumePVT_Panel.isDisplayable()){

				System.out.println("no");

			}


		}
			
	}
		
}
