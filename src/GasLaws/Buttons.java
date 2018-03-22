package GasLaws;

import Main.Start;

import javax.swing.*;

public class Buttons {

    //Makes the buttons for the different options
    public static JButton enterButtonGasLaws = new JButton("Enter");

    public static JButton volumeButton = new JButton("Volume");
        public static JButton volumePV_Button = new JButton("Volume PV");
        public static JButton volumeVT_Button = new JButton("Volume VT");
        public static JButton volumeVN_Button = new JButton("Volume VN");
        public static JButton volumePVT_Button = new JButton("Volume PVT");
        public static JButton volumePVnRT_Button = new JButton("Volume PVnRT");
    public static JButton pressureButton = new JButton("Pressure");
        public static JButton pressurePV_Button = new JButton("Pressure PV");
        public static JButton pressurePVT_Button = new JButton("Pressure PVT");
        public static JButton pressurePT_Button = new JButton("Pressure PT");
        public static JButton pressurePN_Button = new JButton("Pressure PN");
        public static JButton pressurePVnRT_Button = new JButton("Pressure PVnRT");
    public static JButton molesButton = new JButton("Moles");
        public static JButton molesPN_Button = new JButton("Moles PN");
        public static JButton molesVN_Button = new JButton("Moles VN");
        public static JButton molesNT_Button = new JButton("Moles NT");
        public static JButton molesPVnRT_Button = new JButton("Moles PVnRT");
    public static JButton tempButton = new JButton("Temp");
        public static JButton tempPT_Button = new JButton("Temp PT");
        public static JButton tempPVT_Button = new JButton("Temp PVT");
        public static JButton tempVT_Button = new JButton("Temp VT");
        public static JButton tempNT_Button = new JButton("Temp NT");
        public static JButton tempPVnRT_Button = new JButton("Temp PVnRT");


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

        //Volume panel buttons

            //Adds PV equation button to Volume Panel
            G.bag.gridx = 1;
            G.bag.gridy = 0;
            volumePV_Button.setActionCommand("Volume PV");
            volumePV_Button.addActionListener(Start.al1);
            G.volumePanel.add(volumePV_Button, G.bag);

            G.bag.gridx = 2;
            G.bag.gridy = 0;
            volumePVT_Button.setActionCommand("Volume PVT");
            volumePVT_Button.addActionListener(Start.al1);
            G.volumePanel.add(volumePVT_Button, G.bag);

            G.bag.gridx = 3;
            G.bag.gridy = 0;
            volumePVnRT_Button.setActionCommand("Volume PV");
            volumePVnRT_Button.addActionListener(Start.al1);
            G.volumePanel.add(volumePVnRT_Button, G.bag);

            G.bag.gridx = 4;
            G.bag.gridy = 0;
            volumeVT_Button.setActionCommand("Volume PV");
            volumeVT_Button.addActionListener(Start.al1);
            G.volumePanel.add(volumeVT_Button, G.bag);

            G.bag.gridx = 5;
            G.bag.gridy = 0;
            volumeVN_Button.setActionCommand("Volume PV");
            volumeVN_Button.addActionListener(Start.al1);
            G.volumePanel.add(volumeVN_Button, G.bag);

        //Pressure panel buttons

            //Adds PV equation button to Volume Panel
            G.bag.gridx = 1;
            G.bag.gridy = 0;
            pressurePV_Button.setActionCommand("Volume PV");
            pressurePV_Button.addActionListener(Start.al1);
            G.pressurePanel.add(pressurePV_Button, G.bag);

            G.bag.gridx = 2;
            G.bag.gridy = 0;
            pressurePVT_Button.setActionCommand("Volume PVT");
            pressurePVT_Button.addActionListener(Start.al1);
            G.pressurePanel.add(pressurePVT_Button, G.bag);

            G.bag.gridx = 3;
            G.bag.gridy = 0;
            pressurePVnRT_Button.setActionCommand("Volume PV");
            pressurePVnRT_Button.addActionListener(Start.al1);
            G.pressurePanel.add(pressurePVnRT_Button, G.bag);

            G.bag.gridx = 4;
            G.bag.gridy = 0;
            pressurePT_Button.setActionCommand("Volume PV");
            pressurePT_Button.addActionListener(Start.al1);
            G.pressurePanel.add(pressurePT_Button, G.bag);

            G.bag.gridx = 5;
            G.bag.gridy = 0;
            pressurePN_Button.setActionCommand("Volume PV");
            pressurePN_Button.addActionListener(Start.al1);
            G.pressurePanel.add(pressurePN_Button, G.bag);

        //Mole panel buttons

            //Adds PV equation button to Volume Panel
            G.bag.gridx = 1;
            G.bag.gridy = 0;
            molesVN_Button.setActionCommand("Volume PV");
            molesVN_Button.addActionListener(Start.al1);
            G.molesPanel.add(molesVN_Button, G.bag);

            G.bag.gridx = 2;
            G.bag.gridy = 0;
            molesNT_Button.setActionCommand("Volume PVT");
            molesNT_Button.addActionListener(Start.al1);
            G.molesPanel.add(molesNT_Button, G.bag);

            G.bag.gridx = 3;
            G.bag.gridy = 0;
            molesPVnRT_Button.setActionCommand("Volume PV");
            molesPVnRT_Button.addActionListener(Start.al1);
            G.molesPanel.add(molesPVnRT_Button, G.bag);

            G.bag.gridx = 4;
            G.bag.gridy = 0;
            molesPN_Button.setActionCommand("Volume PV");
            molesPN_Button.addActionListener(Start.al1);
            G.molesPanel.add(molesPN_Button, G.bag);

        //Temperature panel buttons

            //Adds PV equation button to Volume Panel
            G.bag.gridx = 1;
            G.bag.gridy = 0;
            tempNT_Button.setActionCommand("Volume PV");
            tempNT_Button.addActionListener(Start.al1);
            G.tempPanel.add(tempNT_Button, G.bag);

            G.bag.gridx = 2;
            G.bag.gridy = 0;
            tempPVT_Button.setActionCommand("Volume PVT");
            tempPVT_Button.addActionListener(Start.al1);
            G.tempPanel.add(tempPVT_Button, G.bag);

            G.bag.gridx = 3;
            G.bag.gridy = 0;
            tempPVnRT_Button.setActionCommand("Volume PV");
            tempPVnRT_Button.addActionListener(Start.al1);
            G.tempPanel.add(tempPVnRT_Button, G.bag);

            G.bag.gridx = 4;
            G.bag.gridy = 0;
            tempPT_Button.setActionCommand("Volume PV");
            tempPT_Button.addActionListener(Start.al1);
            G.tempPanel.add(tempPT_Button, G.bag);

            G.bag.gridx = 5;
            G.bag.gridy = 0;
            tempVT_Button.setActionCommand("Volume PV");
            tempVT_Button.addActionListener(Start.al1);
            G.tempPanel.add(tempVT_Button, G.bag);

    }

}
