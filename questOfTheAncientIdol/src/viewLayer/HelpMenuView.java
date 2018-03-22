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
public class HelpMenuView extends View {

    String displayMessage = ("\n *** Choose an option. ***");

  

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
@Override
public boolean doAction(String[] inputs) {

System.out.println("*** This menu is here to help you understand the game better! ***"
+                   "\n Press P for the purpose of the game"
+                   "\n Press I for information about the inventory/items inside the game"
+                   "\n Press T for information on how to travel in the board"
+                   "\n Press S to learn how to save a game"
+                   "\n Press Q to learn how to quit the game"))

        String choice = inputs[0];
        switch (choice) {
            case 'P': //purpose of the game
                System.out.println("*** The purpose of this game is to return the anciet idol, found in your backpack, to pedestal found in the last room after correctly answering a question. ***");
                break;
            case 'I': //inventory/items throught game
                System.out.println("***There are two types of items within this game: treasures and tools/weapons. Treasures throughout the game are yours for the taking! Whenever you stumble upon a treasure item, a message will display letting you know it’s a treasure item and telling you to grab it, so grab it! The tools/weapons in the game are there to help you get through traps and other obstacles that come your way in different rooms of the map. Grabbing these will help you stay alive and overcome obstacles throughout the game, take advantage of them! ***");
                break;
            case 'T': //traveling in the board (how to play)
                System.out.println("*** To travel throughout the board you will use one of three keys on the keyboard ***"
+                                  "\n F to move forward one space"
+                                  "\n L to move left one space"
+                                  "\n R to move right one space"
                break;
            case 'S': //save game
                System.out.println("*** To save the game at any point in time, PRESS S.")
                break;
            case 'Q': //quit
                System.out.println("*** At any point in time while you are playing the game and want to quit, PRESS Q. ***")
                return;
            default
                System.out.println("\n*** Invalid selection ** Try again!");
                break;
    }

    /* Q - Quit
    ** P - Purpose of the game
    ** I - Inventory/Items throughout game
    ** T - Traveling in the board (How to play)
     */
}

@Override
public String[] getInputs() {
    string[] inputs = new String[1];
    
    System.out.println("***Help Menu***"
+        "\n"
+        "\n"
+        "\n"
+        "\n")

    String.value = this.getInput("Enter one of the menu options.")

    inputs[0] = value;
    return inputs;
    
}





