/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questOfTheAncientIdol.view;

import java.util.Scanner;
import Model.Player;
import controlLayer.GameControl;

/**
 *
 * @author natal
 */
/**
 * displayStartProgramView() { endOfView = false DO inputs = getInputs() IF no
 * inputs were entered OR the first input is Q RETURN ENDIF endOfView =
 * doAction(inputs) WHILE endOfView != true
 */
public class StartProgramView {
       String displayMessage = ("\n *** Enter your name ***"); 
    public void displayStartProgramView() {
        String[] inputs = new String[1];
        boolean endOfView = false;
        do {
            String value = getInput();
            inputs[0] = value;
            if (value.equals("Q")) {
                endOfView = true;
                continue;
            }

            endOfView = doAction(inputs);
        } while (!endOfView);
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {

            System.out.println("\n" + this.displayMessage);
            
            
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            valid = true;
        }
        return value;
    }

    public boolean doAction(String[] inputValues) {
        String playersName = inputValues[0];
        Player player = GameControl.savePlayer(playersName);

        System.out.println("\n" + this.displayMessage);
        String displayMessage = ("Welcome," + value + "! Thank you for accepting the challenge of the Quest of the Ancient Idol!");

        return false;
    }
}
