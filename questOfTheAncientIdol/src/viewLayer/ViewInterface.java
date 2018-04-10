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


public interface ViewInterface {
    public  void displayView();
    public  String[] getInputs();
    public  String getInput(String displayMessage);
    public  boolean doAction(String[] inputs);

}
       
