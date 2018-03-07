/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questOfTheAncientIdol.view;

/**
 *
 * @author natal
 */
public class MainMenuView {
       String displayMessage = ("\n *** Choose an option. ***"); 
    public void displayMainMenuView() {
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
                System.out.println("\n*** Choose an option ***");
                continue;
            }
            valid = true;
        }
        return value;
    }
    /* N - start new game
    ** S - Save Game
    ** G - Get and resume saved game
    ** H - Help
    ** Q - Quit
    */
}
