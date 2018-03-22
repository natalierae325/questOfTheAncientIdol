/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

/**
 *
 * @author natal
 */
public class MainMenuView extends View {

    @Override
    public String[] getInputs() {
        // create a new array of Strings called inputs whose length is the number of inputs to be retrieved (1)
        String[] inputs = new String[1];

        // display the text of the main menu
        System.out.println("Main Menu"
                + "N - start new game"
                + "\nS - Save Game"
                + "\nG - Get and resume saved game"
                + "\nH - Help"
                + "\nQ - Quit");
        
        // prompt for and get the menu input by the end user
        String value = this.getInput("Enter one of the menu options.");
        
        // asssign the value input to the first position in the inputs array
        inputs[0] = value;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
       switch (choice) {
            case "N": // start new game
                this.startNewGame();
                break;
            case "S": //save game
                this.saveGame();
                break;
            case "G": //get and resume saved game
                this.getAndResumeSavedGame();
                break;
            case "H": //help 
                this.displayHelpMenu();
                break;
            case "Q": //quit
                this.endGame();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again!");
                break;
        }
       return false;
    }

    private void startNewGame() {
        
    }

    private void saveGame() {
        
    }

    private void getAndResumeSavedGame() {
        
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
    private void endGame() {
        
    }
}
