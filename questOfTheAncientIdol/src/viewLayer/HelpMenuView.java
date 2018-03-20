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
               
        switch (choice) {
            case 'P': //purpose of the game
                System.out.println("The purpose of this game is to return the anciet idol, found in your backpack, to pedestal found in the last room after correctly answering a question.")
            case 'I': //inventory/items throught game
                System.out.println("There are two types of items within this game: treasures and tools/weapons. Treasures throughout the game are yours for the taking! Whenever you stumble upon a treasure item, a message will display letting you know it’s a treasure item and telling you to grab it, so grab it! The tools/weapons in the game are there to help you get through traps and other obstacles that come your way in different rooms of the map. Grabbing these will help you stay alive and overcome obstacles throughout the game, take advantage of them!")
            case 'T': //traveling in the board (how to play)
                System.out.println("To travel throughout the board")
            case 'Q': //quit
                return;
            default:
                System.out.println("\n*** Invalid selection ** Try again!");
                break;
    }

    /* Q - Quit
    ** P - Purpose of the game
    ** I - Inventory/Items throughout game
    ** T - Traveling in the board (How to play)
     */
}
