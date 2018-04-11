/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

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
public class StartProgramView extends View {
    

 String displayMessage = "\n *** Enter your name ***";

    public StartProgramView() {
    }
      
   

    public boolean doAction(String[] inputValues) {
        
        String playersName = inputValues[0];
        Player player = GameControl.savePlayer(playersName);
        
        if (player == null) {
          System.out.println("Could not create the player." + "Enter a different name.");
          return false;
        }
        
        
           System.out.println("Welcome," + playersName + "! Thank you for accepting the challenge of the Quest of the Ancient Idol!");

        return true;
    }
    

    @Override
    public String[] getInputs() {
       //create a String array of inputs length = number of inputs
       String[] inputs = new String[1];
       //print out description of the view - description of game 
       System.out.println(" Quest of the Ancient Idol is a mission to replace the lost idol back to its pedestal at the end of a grid of rooms."
               + "\n These rooms will have various challenges as well as treasures and tools that you can pick up. Be prepared to solve puzzles"
               + "\n in order to make it to the pedestal! Good luck on your journey!");
       //call getInput with the prompt message
       String value = this.getInput(this.displayMessage);
       // assign valaue returned from getInput to the first position in the inputs array
       inputs[0] = value;
       //return the inputs array
       return inputs;

                        
    }
    
}
