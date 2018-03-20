/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;
import Model.Player;
import java.util.Scanner;
/**
 *Notes - get lesson 9 team assignment done and then go back and make 3 more view layers, one of them has to be a menu view.
 * @author natal
 */
public absract class View implements ViewInterface {
    public display(){
        
    }
}

 class View implements ViewInterface{
     String displayMessage = ("\n *** Enter your name ***"); 
    public void displayView() {
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

    public String getInput (String displayMessage) {
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
        
        if (player == null) {
            displayMessage = ("Could not create the player." + "Enter a different name.");
          return false;
        }
        
        System.out.println("\n" + this.displayMessage);
            displayMessage = ("Welcome," + playersName + "! Thank you for accepting the challenge of the Quest of the Ancient Idol!");

        return false;
    }
}
