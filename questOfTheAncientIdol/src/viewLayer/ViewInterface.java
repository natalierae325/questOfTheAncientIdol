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
public abstract class ViewInterface {
    public abstract void displayView();
    public abstract String[] getInputs();
    public abstract String[] getInput(String displayMessage);
    public abstract boolean doAction(String[] inputs);
       
}
