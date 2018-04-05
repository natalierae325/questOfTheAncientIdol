/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;

import Model.Player;
import java.util.Scanner;

/**
 * Notes - get lesson 9 team assignment done and then go back and make 3 more
 * view layers, one of them has to be a menu view.
 *
 * @author natal
 */
public abstract class View implements ViewInterface {

    public View() {
    }

    @Override
    public void displayView() {

        boolean endOfView = false;
        do {
            String[] values = this.getInputs();
            if (values[0].toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }

            endOfView = doAction(values);
        } while (!endOfView);
    }

    @Override
    public String getInput(String displayMessage) {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {

            System.out.println("\n" + displayMessage);

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
