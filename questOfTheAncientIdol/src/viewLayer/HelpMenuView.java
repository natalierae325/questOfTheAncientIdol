/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

import java.util.Scanner;

import controlLayer.GameControl;


/**
 *
 * @author abbeymj
 */
public class HelpMenuView {

    String displayMessage = ("\n *** Choose an option. ***");

    public void displayHelpMenuView() {
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

    public String getInputs() {
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
    }

    public boolean doAction(String[] inputValues) {
               

    }

    /* Q - Quit
    ** P - Purpose of the game
    ** I - Inventory/Items throughout game
    ** T - Traveling in the board (How to play)
     */
}
