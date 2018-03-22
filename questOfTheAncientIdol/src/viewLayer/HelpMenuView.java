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

        @Override
        public String[] getInputs() {
        
            String[] inputs = new String[1];
    
            System.out.println("***Help Menu***"
+                   "\n Press P for the purpose of the game"
+                   "\n Press I for information about the inventory/items inside the game"
+                   "\n Press T for information on how to travel in the board"
+                   "\n Press S to learn how to save a game"
+                   "\n Press M to go to the main menu"
+                   "\n Press N to learn how to start a new game"
+                   "\n Press Q to learn how to quit the game");

            String.value = this.getInput("Enter one of the menu options.");

            inputs[0] = value;
            return inputs;
 }
    
        @Override
        public boolean doAction(String[] inputs) {

        String choice = inputs[0];
        switch (choice) {
            case "P": //purpose of the game
                this.purpose();
                break;
            case "I": //inventory/items throught game
                this.inventoryItems();
                break;
            case "T": //traveling in the board (how to play)
                this.travelInformation();
                break;
            case "S": //save game
                this.saveGame();
                break;
            case "M": // go to the main menu
                 this.displayMainMenu();
                 break;
            case "N": // start a new game
                 this.startNewGame()
            case "Q": //quit
                 this.endGame();
                return;
            default
                System.out.println("\n*** Invalid selection ** Try again!");
                break;
        }
      return false;
    }

    private void purpose() {
              //System.out.println("The purpose of this game is to return the anciet idol, found in your backpack, to pedestal found in the last room after correctly answering a question.");

}

    private void inventoryItems() {
              //System.out.println("There are two types of items within this game: treasures and tools/weapons. Treasures throughout the game are yours for the taking! Whenever you stumble upon a treasure item, a message will display letting you know it’s a treasure item and telling you to grab it, so grab it! The tools/weapons in the game are there to help you get through traps and other obstacles that come your way in different rooms of the map. Grabbing these will help you stay alive and overcome obstacles throughout the game, take advantage of them!");

}

    private void travelInformation() {
        //System.out.println("To travel throughout the board you will use one of three keys on the keyboar:"
+                                //"\n F to move forward one space"
+                               //"\n L to move left one space"
+                                //"\n R to move right one space"
}

    private void saveGame() {
              //System.out.println("*** To save the game at any point in time, PRESS S.")

}

    private void displayMainMenu() {

}

    private void startNewGame() {

}
    
    private void endGame() {
                     // System.out.println("*** At any point in time while you are playing the game and want to quit, PRESS Q. ***")

    }
    
}

