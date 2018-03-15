package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MolarMass.MolarMass;
import GasLaws.GasLaws;

public class MainFrameActionListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
			
		if("MolarMass".equals(e.getActionCommand())){ //gets called if the button that is pressed has an Action Command value of "MolarMass"
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(MolarMass.molarMassPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility
			
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
			
		}else if("Gas Enter".equals(e.getActionCommand())){
			
		
		}else if("Volume Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.volumePanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility
			
		}else if("Pressure Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.pressurePanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility
			
		}else if("Moles Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.molesPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility
			
		}else if("Temp Enter".equals(e.getActionCommand())){
			
			Start.frame.getContentPane().setVisible(false); //gets the frames current content pane and sets its visibility to false
			Start.frame.remove(Start.frame.getContentPane()); //removes the current content pane from the frame
			Start.frame.setContentPane(GasLaws.tempPanel); //sets the content pane to the molar mass panel
			Start.frame.getContentPane().setVisible(true); //gets the current content pane and sets its visibility to true to ensure visibility
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
