package GasLaws;

import Main.Start;

import javax.swing.*;

public class Buttons {

    //Makes the buttons for the different options
    public static JButton enterButtonGasLaws = new JButton("Enter");
    public static JButton volumeButton = new JButton("Volume");
    public static JButton pressureButton = new JButton("Pressure");
    public static JButton molesButton = new JButton("Moles");
    public static JButton tempButton = new JButton("Temp");

    public static GasLaws G = new GasLaws();

    public void Button(){
        //Makes the Volume Button and sets position
        G.bag.gridx = 0;
        G.bag.gridy = 0;
        volumeButton.setActionCommand("Volume Enter");
        volumeButton.addActionListener(Start.al1);
        G.gasLawsPanel.add(volumeButton, G.bag);

        //Makes the Pressure Button and sets position
        G.bag.gridx = 1;
        G.bag.gridy = 0;
        pressureButton.setActionCommand("Pressure Enter");
        pressureButton.addActionListener(Start.al1);
        G.gasLawsPanel.add(pressureButton, G.bag);

        //Makes the Moles Button and sets position
        G.bag.gridx = 2;
        G.bag.gridy = 0;
        molesButton.setActionCommand("Moles Enter");
        molesButton.addActionListener(Start.al1);
        G.gasLawsPanel.add(molesButton, G.bag);

        //Makes the Temperature Button and sets position
        G.bag.gridx = 3;
        G.bag.gridy = 0;
        tempButton.setActionCommand("Temp Enter");
        tempButton.addActionListener(Start.al1);
        G.gasLawsPanel.add(tempButton, G.bag);

        G.bag.gridx = 4;
        G.bag.gridy = 0;
        G.gasLawsPanel.add(Start.homeButton, G.bag);


        //Adds enter button to volumePV_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.volumePV_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to volumeVN_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.volumeVN_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to volumePVT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.volumePVT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to volumeVT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.volumeVT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to volumePVnRT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.volumePVnRT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to pressurePV_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.pressurePV_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to pressurePT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.pressurePT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to pressurePVT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.pressurePVT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to pressurePVnRT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.pressurePVnRT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to molesVN_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.molesVN_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to molesNT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.molesNT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to molesPN_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.molesPN_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to molesPVnRT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.molesPVnRT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to tempPT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.tempPT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to tempVT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.tempVT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to tempNT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.tempNT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to tempPVT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.tempPVT_Panel.add(enterButtonGasLaws, G.bag);

        //Adds enter button to tempPVnRT_Panel
        G.bag.gridx = 0;
        G.bag.gridy = 1;
        enterButtonGasLaws.setActionCommand("Gas Enter");
        enterButtonGasLaws.addActionListener(Start.al1);
        G.tempPVnRT_Panel.add(enterButtonGasLaws, G.bag);


    }

}
