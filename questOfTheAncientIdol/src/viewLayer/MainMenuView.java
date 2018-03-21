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
       String displayMessage = ("\n *** Choose an option. ***");
    @Override   
    public void displayMainMenuView extends View() {
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
    public String getInput extends View() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {

            System.out.println("\n" + this.displayMessage);
            
            
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n*** Choose an option ***");
                continue;
            }
            valid = true;
        }
        return value;
    }
    
    public boolean doAction extends View(char choice) {
        
        switch (choice) {
            case 'N': // start new game
                this.startNewGame();
                break;
            case 'S': //save game
                this.saveGame();
                break;
            case 'G': //get and resume saved game
                this.getAndResumeSavedGame()
                break;
            case 'H': //help 
                this.displayHelpMenu();
                break;
            case 'Q': //quit
                return;
            default:
                System.out.println("\n*** Invalid selection ** Try again!");
                break;
        }
    }
    /* N - start new game
    ** S - Save Game
    ** G - Get and resume saved game
    ** H - Help
    ** Q - Quit
    */
}
