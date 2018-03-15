package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MolarMass.MolarMass;
import GasLaws.GasLaws;
import GasLaws.Buttons;

public class MainFrameActionListener implements ActionListener{

	public static GasLaws G = new GasLaws();

	public static Buttons B = new Buttons();

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


		}else if("Gas Enter".equals(e.getActionCommand())){

		
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
			G.bag.gridx = 4;
			G.bag.gridy = 0;
			Start.homeButton.setActionCommand("Home");
			Start.homeButton.addActionListener(Start.al1);
			G.pressurePanel.add(Start.homeButton, G.bag);
			
		}else if("Moles Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.molesPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility

			//Moles home buttons
			G.bag.gridx = 4;
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
			G.bag.gridx = 4;
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

		}
			
	}
		
}
